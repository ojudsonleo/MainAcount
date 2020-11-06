package br.ol.dq1.infra;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 * TileSet class.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 */
public class TileSet {

    public static class Terrain {
        public int damagePerStep; // 0 if not damageable
        public String battleBackground;
        public boolean isBlocked;
    }
    
    public static class Tile {
        public TileSet tileSet;
        public int id;
        public BufferedImage image;
        public Terrain terrain;
        
        public void draw(Graphics2D g,int col, int row) {
            int dx = col * 8;  
            int dy = row * 8;
            g.drawImage(image, dx, dy, null);
        }
        
    }

    private BufferedImage image;
    private final Map<Integer, Tile> tiles = new HashMap<>();

    public TileSet(String name) {
        try {
            image = ImageIO.read(Assets.class.getClass().getResourceAsStream("/res/graphic/" + name + ".png"));
        } catch (IOException ex) {
            Logger.getLogger(Assets.class.getClass().getName()).log(Level.SEVERE, null, ex);
            System.exit(-1);
        }         
        extractAllTiles();
        loadTerrainInformation(name);
    }

    private void extractAllTiles() {
        int width = image.getWidth();
        int height = image.getHeight();
        final int tileSize = 8;
        int cols = width / tileSize;
        int rows = height / tileSize;
        
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                
                BufferedImage tileImage = image.getSubimage(
                    col * tileSize, row * tileSize, tileSize, tileSize);
                
                int id = row * cols + col;
                Tile tile = new Tile();
                tile.id = id;
                tile.image = tileImage;
                tile.tileSet = this;
                tiles.put(id, tile);
            }
        }
    }

    private void loadTerrainInformation(String name) {
        try {
            InputStream is = getClass().getResourceAsStream("/res/terrain/" + name + ".ter");
            if (is == null) {
                // ok this tileset doesn't have terrain information so just ignore                
                return;
            }
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty() || line.trim().startsWith("#")) {
                    continue;
                }
                System.out.println(line);
                String[] fields = line.split("\\ ");
                Terrain terrain = new Terrain();
                int tileId = Integer.parseInt(fields[0]);
                terrain.isBlocked = fields[1].toLowerCase().equals("t");
                terrain.damagePerStep = Integer.parseInt(fields[2]);
                terrain.battleBackground = fields[3];
                Tile tile = tiles.get(tileId);
                tile.terrain = terrain;
            }
        }
        catch (Exception ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(-1);
        }
    }
    
    public Tile getTile(int tileId) {
        return tiles.get(tileId);
    }
    
}
