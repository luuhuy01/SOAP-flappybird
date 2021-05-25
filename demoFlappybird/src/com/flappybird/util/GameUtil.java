package com.flappybird.util;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;

import javax.imageio.ImageIO;


public class GameUtil {

    private GameUtil() {
    } 

    
    public static BufferedImage loadBufferedImage(String imgPath) {
        try {
            return ImageIO.read(new FileInputStream(imgPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean isInProbability(int numerator, int denominator) throws Exception {
       
        if (numerator <= 0 || denominator <= 0) {
            throw new Exception("An illegal parameter was passed in");
        }
        
        if (numerator >= denominator) {
            return true;
        }

        return getRandomNumber(1, denominator + 1) <= numerator;
    }

   
    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    
    public static int getStringWidth(Font font, String str) {
        AffineTransform affinetransform = new AffineTransform();
        FontRenderContext frc = new FontRenderContext(affinetransform, true, true);
        return (int) (font.getStringBounds(str, frc).getWidth());
    }

    public static int getStringHeight(Font font, String str) {
        AffineTransform affinetransform = new AffineTransform();
        FontRenderContext frc = new FontRenderContext(affinetransform, true, true);
        return (int) (font.getStringBounds(str, frc).getHeight());
    }


   
    public static void drawImage(BufferedImage image, int x, int y, Graphics g) {
        g.drawImage(image, x, y, null);
    }

}
