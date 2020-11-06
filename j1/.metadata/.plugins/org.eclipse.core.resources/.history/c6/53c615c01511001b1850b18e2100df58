package br.ol.dq1.test;

import br.ol.dq1.event.Door;
import br.ol.dq1.event.Npc;
import br.ol.dq1.infra.*;
import br.ol.dq1.infra.TileSet.Tile;
import java.awt.Color;
import java.awt.event.KeyEvent;

/**
 * Game logic & rendering calls will be coded here.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 */
public class TestGame extends Game {

    public static final int UP = KeyEvent.VK_UP;
    public static final int DOWN = KeyEvent.VK_DOWN;
    public static final int LEFT = KeyEvent.VK_LEFT;
    public static final int RIGHT = KeyEvent.VK_RIGHT;
    public static final int BUTTON1 = KeyEvent.VK_ENTER;
    public static final int BUTTON2 = KeyEvent.VK_ENTER;
    public static final int SHAKE_SCREEN = KeyEvent.VK_S;
    public static final int FLASH_SCREEN = KeyEvent.VK_F;
    
    @Override
    public void start(Input i, Renderer r, Audio a, Miscellaneous m) {
        //r.loadTilesFromResource("/res/graphic/tile.png");
        Assets.loadTileSetFromResource("font8x8");
        Assets.loadTileSetFromResource("map_tileset");
        Assets.loadTileSetFromResource("player");
        Assets.loadTileSetFromResource("npc");
        Assets.loadTileSetFromResource("door");
        
        Assets.loadMapFromResource("world", "/res/map/world.txt");
        Assets.loadMapFromResource("king", "/res/map/tantegel_king.txt");
        Map worldMap = Assets.mapsSet.get("world");
        Map kingMap = Assets.mapsSet.get("king");
        
        for (int l = 0; l < Graphic.LAYERS_SIZE; l++) {
            r.createLayer(l, Assets.tileSets.get("map_tileset"));
        }

        r.createLayer(2, Assets.tileSets.get("font8x8"));
        
        r.createLayer(5, Assets.tileSets.get("npc"));
        r.createLayer(6, Assets.tileSets.get("door"));
        r.createLayer(7, Assets.tileSets.get("player"));

        r.setCursorTileSet(Assets.tileSets.get("font8x8"));

        r.setBoxBorderTileIds(3, 4, 5, 6, 7, 8, 9, 10);
        
        a.loadSound(1, "/res/sound/confirmation.wav");
        a.loadSound(2, "/res/sound/hit.wav");
        a.loadSound(3, "/res/sound/damage.wav");
        
        a.loadMusic(1, "/res/music/dw1castl.mid");
        a.loadMusic(2, "/res/music/dw1town.mid");
        a.loadMusic(3, "/res/music/overworld1.mid");
        
        a.playMusic(1);

        //r.print(4, 15, 14, 0);
        //r.print(4, 16, 14, 1);
        //r.print(4, 15, 15, 4);
        //r.print(4, 16, 15, 5);
        Player player = new Player();
        player.col = 10;
        player.row = 10;
        
        Map map = kingMap;
        
        // event test
        Npc npc = new Npc(i, r, a, m);
        Door door = new Door(i, r, a, m);
        
        outer:
        while (true) {
            
            //int k = i.waitForKey(LEFT, RIGHT, UP, DOWN);
            if (i.isKeyDown(LEFT) && !map.isBlocked(player, -1, 0)) player.col -= 1;
            if (i.isKeyDown(RIGHT) && !map.isBlocked(player, 1, 0)) player.col += 1;
            if (i.isKeyDown(UP) && !map.isBlocked(player, 0, -1)) player.row -= 1;
            if (i.isKeyDown(DOWN) && !map.isBlocked(player, 0, 1)) player.row += 1;
            
            if (i.isKeyDown(FLASH_SCREEN)) {
                a.playSound(3);
                r.flashScreen(12, new Color(255, 255, 255, 192));
            }
            
            if (i.isKeyDown(SHAKE_SCREEN)) {
                a.playSound(2);
                r.shakeScreen(15);
            }
            
            Tile t = map.getTile(player.col, player.row);
            if (t != null && t.terrain != null) {
                r.drawBox(2, -1, 2, 2, 20, 3);
                r.print(2, 2, 2, t.terrain.battleBackground);
            }
            
            npc.updateMovement();
            door.updateMovement();
            
            map.draw(r.getLayer(0), player.col, player.row);
            
            for (int e = 0; e < 40; e++) {
                
                npc.draw(r.getLayer(5), player);
                door.draw(r.getLayer(6), player);
                
                player.getSprite().draw(r.getLayer(7), 15, 14);
                
                if (e == 0) {
                    npc.checkTrigger(player);
                    if (door.checkTrigger(player)) {

                        map = worldMap;
                        
                        player.col = 94;
                        player.row = 94;
                        a.playMusic(3);
                        map.draw(r.getLayer(0), player.col, player.row);
                        npc.draw(r.getLayer(5), player);
                        door.draw(r.getLayer(6), player);
                        m.sleep(500);
                        
                        testDialog(i, r, a, m);
                    }
                } 
                
                m.sleep(5);
            }
            // System.out.println("player position: (" + player.col + "," + player.row + ")");
        }
    }
    
    private void testDialog(Input i, Renderer r, Audio a, Miscellaneous m) {
        Dialog.open(i, r, a, m);
        
        Dialog.printSomethingTest(i, r, a, m);
        
        r.setCursorTileId(1);
        r.setCursorVisible(true);
        r.setCursorPosition(16, 24);

        int x = 1;
        OUTER:
        while (x == 1) {
            int key = i.waitForKey(UP, DOWN, LEFT, RIGHT, BUTTON2);
            switch (key) {
                case UP:
                    System.out.println("up ! " + System.nanoTime());
                    break;
                case DOWN:
                    System.out.println("down ! " + System.nanoTime());
                    break;
                case BUTTON1:
                    break OUTER;
                default:
                    break;
            }
        }
        
        r.setCursorVisible(false);
        
        Dialog.close(i, r, a, m);
        
        m.sleep(500);
    }
    
}