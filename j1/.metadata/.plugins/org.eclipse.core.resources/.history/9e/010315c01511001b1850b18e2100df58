package br.ol.dq1.event;

import br.ol.dq1.infra.Assets;
import br.ol.dq1.infra.Audio;
import br.ol.dq1.infra.Dialog;
import br.ol.dq1.infra.Event;
import br.ol.dq1.infra.Input;
import br.ol.dq1.infra.Miscellaneous;
import br.ol.dq1.infra.Player;
import br.ol.dq1.infra.Renderer;
import br.ol.dq1.infra.Sprite;
import br.ol.dq1.test.TestGame;

/**
 * 
 * @author onole
 */
public class Npc extends Event {
    
    public Npc(Input i, Renderer r, Audio a, Miscellaneous m) {
        super(i, r, a, m);
        col = 12;
        row = 12;
        sprite = new Sprite(Assets.tileSets.get("npc"));
        sprite.setFrame(Sprite.DOWN, 0, 1, 4, 5, 2, 3, 6, 7);
        sprite.setAnimation(Sprite.DOWN);  
        isRigid = true;
    }

    @Override
    public boolean checkTrigger(Player player) {
        if (activated && (player.col != col || player.row != row)) {
            activated = false;
        }
        else if (activated) {
            return false;
        }
        
        if (player.col == col && player.row == row) {
            onTrigger();
            activated = true;
            return true;
        }
        return false;
    } 

    private int movementCount = 0;
    private int movementDirection = 0;
    
    @Override
    public void updateMovement() {
        movementCount--;
        if (movementCount <= 0) {
            movementCount = (int) (4 * Math.random()) * 2;
            movementDirection = (int) (4 * Math.random());
        }
        else if (movementCount % 2 == 0) {
            switch (movementDirection) {
                case 0: col -= 1; break;
                case 1: col += 1; break;
                case 2: row -= 1; break;
                case 3: row += 1; break;
            }
        }
    }
    
    @Override
    public void onMapEnter() {
    }

    @Override
    public void onMapExit() {
    }
    
    @Override
    public void onTrigger() {
        r.print(2, 4, 10, "                           ");
        r.print(2, 4, 11, "     NPC WAS TRIGGERED !   ");
        r.print(2, 4, 12, "                           ");
        i.waitForKey(TestGame.BUTTON1);
        r.fillBox(2, -1, 4, 10, 30, 12);
        
        Dialog.open(i, r, a, m);
        
        String message = "'S' KEY - SHAKE SCREEN";
        for (int c = 0; c < message.length(); c++) {
            r.print(2, c + 4, 18, message.charAt(c));
            m.sleep(100);
        }

        message = "'F' KEY - FLASH SCREEN";
        for (int c = 0; c < message.length(); c++) {
            r.print(2, c + 4, 20, message.charAt(c));
            m.sleep(100);
        }
        
        r.setCursorTileId(1);
        r.setCursorVisible(true);
        r.setCursorPosition(16, 24);
        
        i.waitForKey(TestGame.BUTTON1);

        r.setCursorVisible(false);

        Dialog.close(i, r, a, m);
    }
    
}
