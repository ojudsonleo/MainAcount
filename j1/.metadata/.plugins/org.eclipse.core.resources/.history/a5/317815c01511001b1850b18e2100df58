package br.ol.dq1.infra;

import java.awt.Rectangle;

/**
 * Event class.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 */
public class Event {
    
    public static int TRIGGER_ON_INSIDE = 0;
    public static int TRIGGER_ON_INSIDE_AND_FIRE = 1;
    public static int TRIGGER_ON_TOUCH = 20;
    public static int TRIGGER_ON_TOUCH_AND_FIRE = 3;
    public static int TRIGGER_ON_NEIGHBOR = 4;
    public static int TRIGGER_ON_NEIGHBOR_AND_DIRECTION = 5;
    public static int TRIGGER_ON_NEIGHBOR_AND_DIRECTION_AND_FIRE = 6;
    
    public static int MOVEMENT_STATIC = 0;
    public static int MOVEMENT_RANDOM = 0;
    
    public Sprite sprite;
    public boolean isRigid;
    public int MOVEMENT_TYPE;
    public int TRIGGER_CONDITION;
    public final Rectangle movementArea = new Rectangle();

    public int col;
    public int row;
    
    public boolean activated;

    protected Input i;
    protected Renderer r;
    protected Audio a;
    protected Miscellaneous m;

    public Event(Input i, Renderer r, Audio a, Miscellaneous m) {
        this.i = i;
        this.r = r;
        this.a = a; 
        this.m = m;
    }
    
    public void setMovementArea(int col1, int row1, int col2, int row2) {
        movementArea.setBounds(col1, row1, col2 - col1 + 1, row2 - row1 + 1);
    }
    
    public void updateMovement() {
    }
    
    public void draw(GraphicBuffer gb, Player player) {
        gb.fill(-1);
        sprite.draw(gb, col - player.col + 15, row - player.row + 14);
    }

    public boolean checkTrigger(Player player) {
        return false;
    } 
    
    public boolean isBlocked(int col, int row) {
        if (!isRigid) {
            return false;
        }
        return Math.abs(this.col - col) < 2 && Math.abs(this.row - row) < 2;
    }
    
    public void onMapEnter() {
    }

    public void onMapExit() {
    }
    
    public void onTrigger() {
    }
    
}
