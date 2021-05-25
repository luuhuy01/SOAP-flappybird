package com.flappybird.component;

import java.awt.Graphics;

import com.flappybird.util.Constant;


public class MovingPipe extends Pipe {

    private int dealtY; 
    public static final int MAX_DELTA = 50; 
    private int direction;
    public static final int DIR_UP = 0;
    public static final int DIR_DOWN = 1;

    public MovingPipe() {
        super();
    }

   
    public void setAttribute(int x, int y, int height, int type, boolean visible) {
        super.setAttribute(x, y, height, type, visible);
        dealtY = 0;
        direction = DIR_DOWN;
        if (type == TYPE_TOP_HARD) {
            direction = DIR_UP;
        }
    }

    public void draw(Graphics g, Bird bird) {
        switch (type) {
            case TYPE_HOVER_HARD:
                drawHoverHard(g);
                break;
            case TYPE_TOP_HARD:
                drawTopHard(g);
                break;
            case TYPE_BOTTOM_HARD:
                drawBottomHard(g);
                break;

        }
        if (bird.isDead()) {
            return;
        }
        movement();

      
//		g.setColor(Color.black);
//		g.drawRect((int) pipeRect.getX(), (int) pipeRect.getY(), (int) pipeRect.getWidth(), (int) pipeRect.getHeight());
    }

    
    private void drawHoverHard(Graphics g) {
        int count = (height - 2 * PIPE_HEAD_HEIGHT) / PIPE_HEIGHT + 1;

        g.drawImage(imgs[2], x - ((PIPE_HEAD_WIDTH - width) >> 1), y + dealtY, null);

        for (int i = 0; i < count; i++) {
            g.drawImage(imgs[0], x, y + dealtY + i * PIPE_HEIGHT + PIPE_HEAD_HEIGHT, null);
        }

        int y = this.y + height - PIPE_HEAD_HEIGHT;
        g.drawImage(imgs[1], x - ((PIPE_HEAD_WIDTH - width) >> 1), y + dealtY, null);
    }

    private void drawTopHard(Graphics g) {

        int count = (height - PIPE_HEAD_HEIGHT) / PIPE_HEIGHT + 1; // 取整+1

        for (int i = 0; i < count; i++) {
            g.drawImage(imgs[0], x, y + dealtY + i * PIPE_HEIGHT, null);
        }
 
        g.drawImage(imgs[1], x - ((PIPE_HEAD_WIDTH - width) >> 1),
                height - Constant.TOP_PIPE_LENGTHENING - PIPE_HEAD_HEIGHT + dealtY, null);
    }


    private void drawBottomHard(Graphics g) {

        int count = (height - PIPE_HEAD_HEIGHT) / PIPE_HEIGHT + 1;
 
        for (int i = 0; i < count; i++) {
            g.drawImage(imgs[0], x, Constant.FRAME_HEIGHT - PIPE_HEIGHT - i * PIPE_HEIGHT + dealtY, null);
        }
  
        g.drawImage(imgs[2], x - ((PIPE_HEAD_WIDTH - width) >> 1), Constant.FRAME_HEIGHT - height + dealtY, null);
    }


    private void movement() {
    
        x -= speed;
        pipeRect.x -= speed;
        if (x < -1 * PIPE_HEAD_WIDTH) {
            visible = false;
        }


        if (direction == DIR_DOWN) {
            dealtY++;
            if (dealtY > MAX_DELTA) {
                direction = DIR_UP;
            }
        } else {
            dealtY--;
            if (dealtY <= 0) {
                direction = DIR_DOWN;
            }
        }
        pipeRect.y = this.y + dealtY;
    }

}
