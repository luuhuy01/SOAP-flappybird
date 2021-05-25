package com.flappybird.component;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import com.flappybird.util.Constant;
import com.flappybird.util.GameUtil;


public class GameForeground {
    private final List<Cloud> clouds; 
    private final BufferedImage[] cloudImages; 
    private long time; 
    public static final int CLOUD_INTERVAL = 100; 

    public GameForeground() {
        clouds = new ArrayList<>(); 
       
        cloudImages = new BufferedImage[Constant.CLOUD_IMAGE_COUNT];
        for (int i = 0; i < Constant.CLOUD_IMAGE_COUNT; i++) {
            cloudImages[i] = GameUtil.loadBufferedImage(Constant.CLOUDS_IMG_PATH[i]);
        }
        time = System.currentTimeMillis(); 
    }


    public void draw(Graphics g, Bird bird) {
        cloudBornLogic();
        for (Cloud cloud : clouds) {
            cloud.draw(g, bird);
        }
    }


    private void cloudBornLogic() {

        if (System.currentTimeMillis() - time > CLOUD_INTERVAL) {
            time = System.currentTimeMillis(); 
           
            if (clouds.size() < Constant.MAX_CLOUD_COUNT) {
                try {
                    if (GameUtil.isInProbability(Constant.CLOUD_BORN_PERCENT, 100)) { 
                        int index = GameUtil.getRandomNumber(0, Constant.CLOUD_IMAGE_COUNT); 
                    
                        int x = Constant.FRAME_WIDTH; 
                       
                        int y = GameUtil.getRandomNumber(Constant.TOP_BAR_HEIGHT, Constant.FRAME_HEIGHT / 3);
                   
                        Cloud cloud = new Cloud(cloudImages[index], x, y);
                        clouds.add(cloud);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } 

         
            for (int i = 0; i < clouds.size(); i++) {               
                Cloud tempCloud = clouds.get(i);
                if (tempCloud.isOutFrame()) {
                    clouds.remove(i);
                    i--;
                }
            }
        }
    }
}
