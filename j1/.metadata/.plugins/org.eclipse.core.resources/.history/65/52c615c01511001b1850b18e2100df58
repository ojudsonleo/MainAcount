package br.ol.dq1.infra;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

/**
 * View class.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 */
public class View extends Canvas {
    
    public static final int SCREEN_WIDTH = 256;
    public static final int SCREEN_HEIGHT = 240;
    public static final double SCREEN_SCALE_X = 2.5;
    public static final double SCREEN_SCALE_Y = 2.5;
    public static final int SCALED_WIDTH = (int) (SCREEN_WIDTH * SCREEN_SCALE_X);
    public static final int SCALED_HEIGHT = (int) (SCREEN_HEIGHT * SCREEN_SCALE_Y);
    
    private BufferStrategy bs;
    private boolean running;
    private Thread graphicRefresherThread;
    private Thread gameThread;
    private Game game;
    private Graphic graphic;
    private KeyHandler input;
    private Audio audio;
    private Miscellaneous miscellaneous;
    
    public View() {
        init();
    }    
    
    private void init() {
        setPreferredSize(new Dimension(SCALED_WIDTH, SCALED_HEIGHT));
        setIgnoreRepaint(true);
        setBackground(Color.BLACK);
        addKeyListener(input = new KeyHandler());
    }

    public void start(Game game) {
        graphic = new Graphic();
        audio = new Audio();
        audio.start();  
        miscellaneous = new Miscellaneous();
        createBufferStrategy(1);
        bs = getBufferStrategy();
        graphicRefresherThread = new Thread(new GraphicRefresher());
        running = true;
        graphicRefresherThread.start();
        gameThread = new Thread(() -> game.start(input, graphic, audio, miscellaneous));
        gameThread.start();
    }
    
    private class GraphicRefresher implements Runnable {

        @Override
        public void run() {
            while (running) {
                Graphics2D g = (Graphics2D) bs.getDrawGraphics();
                graphic.draw(g);
                g.dispose();
                try {
                    Thread.sleep(1000 / 60);
                } catch (InterruptedException ex) {
                }
            }
        }
        
    }
    
}
