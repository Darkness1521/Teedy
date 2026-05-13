package com.sismics.util;

import org.junit.Assert;
import org.junit.Test;

import java.awt.image.BufferedImage;

/**
 * Test of the image utilities.
 * 
 * @author bgamard
 */
public class TestImageUtil {

    @Test
    public void computeGravatarTest() {
        Assert.assertEquals("0bc83cb571cd1c50ba6f3e8a78ef1346", ImageUtil.computeGravatar("MyEmailAddress@example.com "));
    }

    @Test
    public void computeGravatarNullTest() {
        Assert.assertNull(ImageUtil.computeGravatar(null));
    }

    @Test
    public void computeGravatarEmptyTest() {
        Assert.assertEquals("d41d8cd98f00b204e9800998ecf8427e", ImageUtil.computeGravatar(""));
    }

    @Test
    public void computeGravatarCaseTest() {
        // Test that email is converted to lowercase
        Assert.assertEquals(ImageUtil.computeGravatar("Test@Example.COM"), 
                           ImageUtil.computeGravatar("test@example.com"));
    }

    @Test
    public void isBlackTest() {
        // Create a simple black and white image
        BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_BYTE_BINARY);
        
        // Test black pixel (0, 0 should be black by default)
        Assert.assertTrue(ImageUtil.isBlack(image, 0, 0));
        
        // Test white pixel - set a pixel to white
        image.setRGB(5, 5, 0xFFFFFF);
        Assert.assertFalse(ImageUtil.isBlack(image, 5, 5));
    }

    @Test
    public void isBlackWithRGBImageTest() {
        // Create an RGB image
        BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        
        // Fill with white
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                image.setRGB(x, y, 0xFFFFFF);
            }
        }
        
        // White pixel should not be black
        Assert.assertFalse(ImageUtil.isBlack(image, 5, 5));
        
        // Set a black pixel
        image.setRGB(3, 3, 0x000000);
        Assert.assertTrue(ImageUtil.isBlack(image, 3, 3));
    }

    @Test
    public void isBlackBoundaryTest() {
        BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        
        // Test out of bounds - should return false (white)
        Assert.assertFalse(ImageUtil.isBlack(image, -1, 5));
        Assert.assertFalse(ImageUtil.isBlack(image, 5, -1));
        Assert.assertFalse(ImageUtil.isBlack(image, 15, 5));
        Assert.assertFalse(ImageUtil.isBlack(image, 5, 15));
    }
}
