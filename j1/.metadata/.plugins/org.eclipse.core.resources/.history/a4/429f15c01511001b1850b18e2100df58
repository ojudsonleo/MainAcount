package br.ol.dq1.infra;

import static br.ol.dq1.infra.Graphic.LAYER_BUFFER_COLS;
import static br.ol.dq1.infra.Graphic.LAYER_BUFFER_ROWS;
import br.ol.dq1.infra.TileSet.Tile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Map class.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 */
public class Map {
    
    public TileSet tileSet;
    public int[][] exceedTileIds;
    public int cols;
    public int rows;
    public int data[][];
    
    public boolean eventsCreated;
    public final List<Event> events = new ArrayList<>();

    public Map(String resource) {
        this.exceedTileIds = new int[2][2];
        load(resource);
    }
    
    private void load(String resource) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(resource)));
            
            String tileSetName = br.readLine().trim();
            tileSet = Assets.tileSets.get(tileSetName);
            
            if (tileSet == null) {
                throw new RuntimeException("Map " + resource + " doesn't have " + tileSetName + " tileSet loaded !");
            }
            
            try {
                exceedTileIds[0][0] = Integer.parseInt(br.readLine());
                exceedTileIds[0][1] = Integer.parseInt(br.readLine());
                exceedTileIds[1][0] = Integer.parseInt(br.readLine());
                exceedTileIds[1][1] = Integer.parseInt(br.readLine());
            }
            catch (Exception e) {
            }
            
            rows = Integer.parseInt(br.readLine());
            cols = Integer.parseInt(br.readLine());
            
            data = new int[rows][cols];
            String line = null;
            int row = 0;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }
                System.out.println(line);
                String[] colIds = line.split("\\,");
                for (int col = 0; col < cols; col++) {
                    data[row][col] = Integer.parseInt(colIds[col].trim());
                }
                row++;
            }
        } catch (IOException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(-1);
        }
    }
    
    public Tile getTile(int col, int row) {
        return tileSet.getTile(getTileId(col, row));
    }
    
    public int getTileId(int col, int row) {
        if (col >= 0 && col < cols && row >= 0 && row < rows) {
            return data[row][col];
        }
        return -1;
    }

    public boolean isBlocked(Player player, int dcol, int drow) {
        int pcol = player.col + dcol;
        int prow = player.row + drow;
        return isBlocked(pcol, prow) || isBlocked(pcol + 1, prow) ||
               isBlocked(pcol, prow + 1) || isBlocked(pcol + 1, prow + 1);
    }
    
    public boolean isBlocked(int col, int row) {
        for (br.ol.dq1.infra.Event event : events) {
            if (event.isBlocked(col, row)) {
                return true;
            }
        }
        int tileId = getTileId(col, row);
        Tile tile = tileSet.getTile(tileId);
        if (tile == null || tile.terrain == null) {
            return false;
        }
        if (tile.terrain.isBlocked) {
            return true;
        }
        return false;
    }
    
    public void draw(GraphicBuffer graphicBuffer, int playerX, int playerY) {
        for (int row = 0; row < LAYER_BUFFER_ROWS; row++) {
            for (int col = 0; col < LAYER_BUFFER_COLS; col++) {
                int tileId = getTileId(col + playerX - 15, row + playerY - 14);
                if (tileId >= 0) {
                    graphicBuffer.putTileId(col, row, tileId);
                } 
            }
        }
    }

    public void updateEvents() {
        for (Event event : events) {
            event.updateMovement();
        }
    }
    
    public void drawEvents(GraphicBuffer gb, Player player) {
        for (Event event : events) {
            event.draw(gb, player);
        }
    }

    public void onEnter() {
        // TODO verificar se existe algum evento que está acionado por touch do player
        // neste caso, desabilitar estes eventos
        
        for (Event event : events) {
            event.onMapEnter();
        }
    }

    public void onExit() {
        for (Event event : events) {
            event.onMapExit();
        }
    }
    
}
