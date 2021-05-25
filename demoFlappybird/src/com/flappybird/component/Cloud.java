package com.flappybird.component;

import com.flappybird.util.Constant;

import java.awt.Graphics;
import java.awt.image.BufferedImage;


public class Cloud {

    private final int speed; 
    private int x; 
    private final int y;

    private final BufferedImage img;

    private final int scaleImageWidth;
    private final int scaleImageHeight;


    public Cloud(BufferedImage img, int x, int y) {
        super();
        this.img = img;
        this.x = x;
        this.y = y;
        this.speed = Constant.GAME_SPEED * 2; 

        double scale = 1 + Math.random(); 

        scaleImageWidth = (int) (scale * img.getWidth());
        scaleImageHeight = (int) (scale * img.getWidth());
    }


    public void draw(Graphics g, Bird bird) {
        int speed = this.speed;
        if (bird.isDead())
            speed = 1;
        x -= speed;
        g.drawImage(img, x, y, scaleImageWidth, scaleImageHeight, null);
    }


    public boolean isOutFrame() {
        return x < -1 * scaleImageWidth;
    }

}
