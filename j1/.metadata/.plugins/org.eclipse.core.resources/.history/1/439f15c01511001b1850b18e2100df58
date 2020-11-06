package br.ol.dq1.infra;

import java.util.Random;

/**
 * Miscellaneous class.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 */
public class Miscellaneous {
    
    private final Random random = new Random(System.currentTimeMillis());
    
    public int random(int max) {
        return random.nextInt(max);
    }
    
    public void sleep(long ms) {
        try { 
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
        }
    }
    
}
