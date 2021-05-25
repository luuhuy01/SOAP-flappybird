package com.flappybird.component;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.flappybird.util.Constant;
import com.flappybird.util.GameUtil;


public class GameBackground {

	private static final BufferedImage BackgroundImg;

	private final int speed; 
	private int layerX; 

	public static final int GROUND_HEIGHT;

	static {
		BackgroundImg = GameUtil.loadBufferedImage(Constant.BG_IMG_PATH);
		assert BackgroundImg != null;
		GROUND_HEIGHT = BackgroundImg.getHeight() / 2;
	}

	public GameBackground() {
		this.speed = Constant.GAME_SPEED;
		this.layerX = 0;
	}

	public void draw(Graphics g, Bird bird) {
		g.setColor(Constant.BG_COLOR);
		g.fillRect(0, 0, Constant.FRAME_WIDTH, Constant.FRAME_HEIGHT);

		int imgWidth = BackgroundImg.getWidth();
		int imgHeight = BackgroundImg.getHeight();

		int count = Constant.FRAME_WIDTH / imgWidth + 2; 
		for (int i = 0; i < count; i++) {
			g.drawImage(BackgroundImg, imgWidth * i - layerX, Constant.FRAME_HEIGHT - imgHeight, null);
		}
		
		if(bird.isDead()) { 
			return;
		}
		movement();
	}


	private void movement() {
		layerX += speed;
		if (layerX > BackgroundImg.getWidth())
			layerX = 0;
	}
}
