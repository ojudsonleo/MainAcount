package br.ol.dq1.infra;

import java.awt.Color;

/**
 * Renderer class.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 */
public interface Renderer {
    
    public void loadTilesFromResource(String resource);
    
    public void createLayer(int layerIndex, TileSet tileSet);
    public GraphicBuffer getLayer(int layerIndex);
    public void clearLayer(int layerIndex);
    public void setLayerVisible(int layerIndex, boolean visible);
    
    public void print(int layerIndex, int col, int row, int tileId);
    public void print(int layerIndex, int col, int row, String text);

     
    public void copy(int dstLayer, int dstCol1, int dstRow1, int srcLayer, 
                     int srcCol1, int srcRow1, int srcCol2, int srcRow2);

    public void drawBox(int layerIndex, int tileId, 
                        int col1, int row1, int col2, int row2);
    
    public void fillBox(int layerIndex, int tileId, 
                        int col1, int row1, int col2, int row2);
    
    public void setBoxBorderTileIds(int topLeft, int top, int topRight,
                             int left, int right,
                             int bottomLeft, int bottom, int bottomRight);
    
    public void drawBoxBorder(int layerIndex, 
                              int col1, int row1, int col2, int row2);
    
    public void setCursorTileSet(TileSet cursorTileSet);
    public void setCursorPosition(int col, int row);
    public void setCursorVisible(boolean visible);
    public void setCursorTileId(int cursorChar);
    
    public void shakeScreen(int duration);
    public void flashScreen(int duration, Color color);
    
}
