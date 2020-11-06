package br.ol.dq1.infra;

import static br.ol.dq1.infra.Graphic.LAYER_BUFFER_COLS;
import static br.ol.dq1.infra.Graphic.LAYER_BUFFER_ROWS;
import java.util.Arrays;

/**
 * Graphic Buffer class.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 */
public class GraphicBuffer {
    
    public static final int TRANSPARENT = -1;
    
    private final TileSet tileSet;
    private final int[][] buffer = new int[LAYER_BUFFER_ROWS][LAYER_BUFFER_COLS];
    private boolean visible = true;

    public GraphicBuffer(TileSet tileSet) {
        this.tileSet = tileSet;
        fill(TRANSPARENT);
    }

    public TileSet getTileSet() {
        return tileSet;
    }

    public int[][] getBuffer() {
        return buffer;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    public int getTileId(int col, int row) {
        if (col >= 0 && col < LAYER_BUFFER_COLS && 
            row >= 0 && row < LAYER_BUFFER_ROWS) {
            
            return buffer[row][col];
        } 
        return -1;
    }
    
    public void putTileId(int col, int row, int tileId) {
        if (col >= 0 && col < LAYER_BUFFER_COLS && 
            row >= 0 && row < LAYER_BUFFER_ROWS) {

            buffer[row][col] = tileId;
        }
    }

    public void fill(int tileId) {
        for (int[] cols : buffer) {
            Arrays.fill(cols, tileId);
        }
    }
    
}
