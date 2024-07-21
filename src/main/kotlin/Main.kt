package com.theendercore

import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

const val CUT_WIDTH = 20
const val CUT_HEIGHT = 20

const val MODIFIER = 4

fun main() {
    File("raw").listFiles()?.forEach {
        val input = ImageIO.read(it)

        val numRows = input.height.floorDiv(CUT_HEIGHT)
        val numCols = input.width.floorDiv(CUT_WIDTH)
        for (i in 0 until numRows) {
            for (j in 0 until numCols) {
                val subImage = input.getSubimage(
                    j * CUT_WIDTH + MODIFIER, i * CUT_HEIGHT + MODIFIER,
                    CUT_WIDTH - MODIFIER, CUT_HEIGHT - MODIFIER
                )
                if (imageContainsPixels(subImage)) {
                    File("cooked/${it.nameWithoutExtension}").mkdirs()
                    ImageIO.write(subImage, "png", File("cooked/${it.nameWithoutExtension}/${i}_${j}.png"))
                }
            }
        }
    }
}

fun imageContainsPixels(image: BufferedImage): Boolean {
    for (y in 0 until image.height) {
        for (x in 0 until image.width) {
            if ((image.getRGB(x, y) shr 24) and 0xFF != 0x00)
                return true
        }
    }
    return false
}