package com.theendercore

import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

// Image dimensions
const val CUT_WIDTH = 16
const val CUT_HEIGHT = 16
const val MODIFIER = 0

// Image names
val mode = NameMode.LIST

val colNames = HUMAN_MAP
val rowNames = HUMAN_MAP

val listNames = WOOD_SET
const val FLIPED = false

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

    for (i in 0 until numRows) {
        for (j in 0 until numCols) {
            val exportImg = input.getSubimage(
                j * CUT_WIDTH + MODIFIER, i * CUT_HEIGHT + MODIFIER,
                CUT_WIDTH - MODIFIER, CUT_HEIGHT - MODIFIER
            )
            val resultName = getName(j, i, name, numCols)
            if (!isNameValid(resultName) || !imageContainsPixels(exportImg)) continue
            println("name: $resultName, i: $i, j: $j")

            val folders = resultFolder.resolve(resultName).parentFile
            if (!folders.exists()) folders.mkdirs()
            ImageIO.write(exportImg, "png", resultFolder.resolve("${resultName}.png"))
        }
        println()
    }
}


fun getName(x: Int, y: Int, name: String, len: Int): String = when (mode) {
    NameMode.ROW_AND_COL -> String.format(rowNames[y], colNames[x])
    NameMode.REVERSE_ROW_AND_COL -> String.format(colNames[x], rowNames[y])
    NameMode.LIST -> String.format(String.format(listNames[x + (len * y)], name))
}

fun isNameValid(name: String): Boolean = name.isNotEmpty() && name != "_" && name != "-"


fun imageContainsPixels(image: BufferedImage): Boolean {
    for (y in 0 until image.height) {
        for (x in 0 until image.width) {
            if ((image.getRGB(x, y) shr 24) and 0xFF != 0x00)
                return true
        }
    }
    return false
}


enum class NameMode {
    ROW_AND_COL,
    REVERSE_ROW_AND_COL,
    LIST,
}