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
public class Door extends Event {
    
    public Door(Input i, Renderer r, Audio a, Miscellaneous m) {
        super(i, r, a, m);
        col = 20;
        row = 20;
        sprite = new Sprite(Assets.tileSets.get("npc"));
        sprite.setFrame(Sprite.DOWN, 0, 1, 4, 5, 2, 3, 6, 7);
        sprite.setAnimation(Sprite.DOWN);  
        isRigid = false;
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

    @Override
    public void updateMovement() {
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
        r.print(2, 4, 11, "   DOOR WAS TRIGGERED !    ");
        r.print(2, 4, 12, "                           ");
        i.waitForKey(TestGame.BUTTON1);
        r.fillBox(2, -1, 4, 10, 30, 12);
    }
    
}
