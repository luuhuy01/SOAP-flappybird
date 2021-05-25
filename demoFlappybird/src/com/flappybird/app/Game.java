package com.flappybird.app;

import com.flappybird.component.GameElementLayer;
import com.flappybird.component.Bird;
import com.flappybird.component.GameBackground;
import com.flappybird.component.GameForeground;
import com.flappybird.component.WelcomeAnimation;
import com.flappybird.service.User;

import static com.flappybird.util.Constant.FRAME_HEIGHT;
import static com.flappybird.util.Constant.FRAME_WIDTH;
import static com.flappybird.util.Constant.FRAME_X;
import static com.flappybird.util.Constant.FRAME_Y;
import static com.flappybird.util.Constant.FPS;
import static com.flappybird.util.Constant.GAME_TITLE;
import java.awt.BorderLayout;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.image.BufferedImage;




public class Game extends Frame{
    private static final long serialVersionUID = 1L; 
    private User user;
    
    private static int gameState; 
    public static final int GAME_READY = 0; 
    public static final int GAME_START = 1; 
    public static final int STATE_OVER = 2; 

    private GameBackground background; 
    private GameForeground foreground; 
    private Bird bird; 
    private GameElementLayer gameElement; 
    private WelcomeAnimation welcomeAnimation; 

   
    public Game(User user) {
        this.user = user;
        initFrame(); 
        initGame();     
    }

   
    private void initFrame() {
        setSize(FRAME_WIDTH, FRAME_HEIGHT); 
        setLayout(new BorderLayout());
        setTitle(GAME_TITLE); 
        setLocation(FRAME_X, FRAME_Y); 
        setResizable(false); 
        
       
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0); 
            }
        });
        addKeyListener(new BirdKeyListener()); 
    }


   
    class BirdKeyListener implements KeyListener {
      
        public void keyPressed(KeyEvent e) {
            int keycode = e.getKeyCode();
            switch (gameState) {
                case GAME_READY:
                    if (keycode == KeyEvent.VK_SPACE) {
                      
                        bird.birdFlap();
                        bird.birdFall();
                        setGameState(GAME_START); 
                    }
                    break;
                case GAME_START:
                    if (keycode == KeyEvent.VK_SPACE) {
                      
                        bird.birdFlap();
                        bird.birdFall();
                    }
                    break;
                case STATE_OVER:
                    if (keycode == KeyEvent.VK_SPACE) {
                   
                        resetGame();
                    }
                    break;
            }
        }

     
        private void resetGame() {
            setGameState(GAME_READY);
            gameElement.reset();
            bird.reset();
        }

    
        @Override
        public void keyReleased(KeyEvent e) {
            int keycode = e.getKeyChar();
            if (keycode == KeyEvent.VK_SPACE) {
                bird.keyReleased();
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }
    }

  
    private void initGame() {
        background = new GameBackground();
        gameElement = new GameElementLayer();
        foreground = new GameForeground();
        welcomeAnimation = new WelcomeAnimation();
        bird = new Bird(this.user);
        setGameState(GAME_READY);

     
        new Thread(() ->{
            while (true) {
                repaint(); 
                try {
                    Thread.sleep(FPS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

  
    private final BufferedImage bufImg = new BufferedImage(FRAME_WIDTH, FRAME_HEIGHT, BufferedImage.TYPE_4BYTE_ABGR);

    /**
     * 
     */
    @Override
    public void update(Graphics g) {
        Graphics bufG = bufImg.getGraphics();       
        background.draw(bufG, bird); 
        foreground.draw(bufG, bird); 
        if (gameState == GAME_READY) { 
            welcomeAnimation.draw(bufG);
        } else { 
            gameElement.draw(bufG, bird); 
        }
        bird.draw(bufG);
        g.drawImage(bufImg, 0, 0, null); 
    }

    public static void setGameState(int gameState) {
        Game.gameState = gameState;
    }

    public Bird getBird() {
        return bird;
    }

    public void setBird(Bird bird) {
        this.bird = bird;
    }
    
    
}
