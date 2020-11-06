package br.ol.dq1.infra;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Input class.
 * @author Leonardo Ono (ono.leo@gmail.com)
 */
public class KeyHandler extends KeyAdapter implements Input {
     
    private static class KeyState {
        boolean pressed;
        boolean consumed;
    }
    
    private static final KeyState[] KEY_STATES = new KeyState[256];
    
    static {
        for (int i = 0; i < KEY_STATES.length; i++) {
            KEY_STATES[i] = new KeyState();
            KEY_STATES[i].pressed = false;
        }
    }

    @Override
    public synchronized void keyPressed(KeyEvent e) {
        if (e.getKeyCode() > 255) return;
        if (!KEY_STATES[e.getKeyCode()].pressed) {
            KEY_STATES[e.getKeyCode()].pressed = true;
            notify();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() > 255) return;
        KEY_STATES[e.getKeyCode()].pressed = false;
        KEY_STATES[e.getKeyCode()].consumed = false;
    }
    
    // --- Input implementation ---
    
    @Override
    public boolean isKeyDown(int keyCode) {
        return KEY_STATES[keyCode].pressed;
    }
        
    @Override
    public synchronized int waitForKey(int ... keyCodes) {
        int pressedKeyCode = -1;
        while (pressedKeyCode < 0) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                    // ignore ?
                }

            for (int keyCode : keyCodes) {
                KeyState keyState = KEY_STATES[keyCode];
                if (keyState.pressed && !keyState.consumed) {
                    keyState.consumed = true;
                    pressedKeyCode = keyCode;
                }
            }
        }
        return pressedKeyCode;
    }
    
}
