package com.theendercore

import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

// Image dimensions
const val CUT_WIDTH = 16
const val CUT_HEIGHT = 16
val modifierType = ModifierType.ALL
const val W_MODIFIER = 4
const val H_MODIFIER = 2

// Image names
val mode = NameMode.ROW_AND_COL

val colNames = THE_ONE_TYPES
val rowNames = THE_ONE_COLORS

val listNames = CROSSHAIR_ICONS

val output = File("cooked")
val input = File("raw")

fun main() {
    if (!output.exists()) {
        println("ERROR : Output folder does not exist")
        output.mkdirs()
    }
    if (!input.exists()) {
        println("ERROR : Input folder does not exist")
        input.mkdirs()
    } else {
        input.listFiles()?.forEach(::processImage)
    }
}

fun processImage(image: File) {
    val name = image.nameWithoutExtension
    if (image.extension != "png") return

    val input = ImageIO.read(image)

    val numRows = input.height.floorDiv(CUT_HEIGHT)
    val numCols = input.width.floorDiv(CUT_WIDTH)

    val resultFolder = File("cooked/$name")

    for (x in 0 until numRows) {
        for (y in 0 until numCols) {
            val resultName = getName(y, x, name, numCols)
            if (!isNameValid(resultName)) continue
            println("name: $resultName, x: $x, y: $y")

            val exportImg = input.getImage(y, x) ?: continue
            if (!imageContainsPixels(exportImg)) continue

            val folders = resultFolder.resolve(resultName).parentFile
            if (!folders.exists()) folders.mkdirs()
            ImageIO.write(exportImg, "png", resultFolder.resolve("${resultName}.png"))
        }
    }
}

private fun BufferedImage.getImage(x: Int, y: Int): BufferedImage? {
    try {
        return when (modifierType) {
            ModifierType.ALL -> {
                this.getSubimage(
                    (x * CUT_WIDTH) + W_MODIFIER, (y * CUT_HEIGHT) + H_MODIFIER,
                    CUT_WIDTH - (W_MODIFIER * 2), CUT_HEIGHT - (H_MODIFIER * 2)
                )
            }

            ModifierType.BOTTOM_RIGHT -> this.getSubimage(
                x * (CUT_WIDTH), y * (CUT_HEIGHT), CUT_WIDTH - W_MODIFIER, CUT_HEIGHT - H_MODIFIER
            )
        }
    } catch (e: Exception) {
        println(
            "X: ${x * (CUT_WIDTH + W_MODIFIER)}\n" +
                    "Y: ${y * (CUT_HEIGHT + H_MODIFIER)}\n" +
                    "Width: ${CUT_WIDTH - (W_MODIFIER * 2)}\n" +
                    "Height: ${CUT_HEIGHT - (H_MODIFIER * 2)}"
        )
        println(e.message)
    }
    return null
}


fun getName(x: Int, y: Int, name: String, len: Int): String = when (mode) {
    NameMode.ROW_AND_COL -> String.format(rowNames[y], colNames[x])
    NameMode.REVERSE_ROW_AND_COL -> String.format(colNames[x], rowNames[y])
    NameMode.LIST -> String.format(String.format(listNames[x + (len * y)], name))
}

fun isNameValid(name: String): Boolean = name.isNotEmpty() && name != "_" && name != "-" && !name.contains("-")


fun imageContainsPixels(image: BufferedImage): Boolean {
    for (y in 0 until image.height) {
        for (x in 0 until image.width) {
            if ((image.getRGB(x, y) shr 24) and 0xFF != 0x00) return true
        }
    }
    return false
}


enum class NameMode { ROW_AND_COL, REVERSE_ROW_AND_COL, LIST, }
enum class ModifierType { ALL, BOTTOM_RIGHT }