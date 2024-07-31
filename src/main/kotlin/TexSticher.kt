package com.theendercore

import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO

fun main() {
    val outputPath = "cooked/merged.png"

    try {
        val combinedImage = File("raw").listFiles()?.let { it2 -> combineImages( it2) }

        ImageIO.write(combinedImage, "png", File(outputPath))
        println("Successfully created $outputPath")
    } catch (e: Exception) {
        println("Error combining images: ${e.message}")
    }
}

fun combineImages(imagePaths: Array<File>): BufferedImage {
    val images = imagePaths.map { ImageIO.read(it) }

    val combinedWidth = images.sumOf { it.width }
    val maxHeight = images.maxOfOrNull { it.height } ?: 24

    val combinedImage = BufferedImage(combinedWidth, maxHeight, BufferedImage.TYPE_INT_ARGB)

    val g2d = combinedImage.graphics
    images.forEachIndexed { index, image ->
        g2d.drawImage(image, index * image.width, 0, null)
    }

    return combinedImage
}
