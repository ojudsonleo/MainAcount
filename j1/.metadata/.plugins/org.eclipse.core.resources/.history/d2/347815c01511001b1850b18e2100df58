package br.ol.dq1.infra;

import br.ol.dq1.infra.TileSet.Tile;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 * Graphic class.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 */
public class Graphic implements Renderer {
    
    public static final int LAYERS_SIZE = 10;
    public static final int LAYER_BUFFER_COLS = 32;
    public static final int LAYER_BUFFER_ROWS = 30;
    
    private final BufferedImage offscreen;
    private final Graphics2D osg;
    
    private final GraphicBuffer[] layers = new GraphicBuffer[LAYERS_SIZE];
    
    private TileSet cursorTileSet;
    private int cursorTileId = 1;
    private boolean cursorVisible = false;
    private int cursorCol;
    private int cursorRow;
    
    private double shakeScreenCount;
    private int shakeScreenOffsetX;

    private double flashScreenCount;
    private Color flashScreenColor;
    
    public Graphic() {
        offscreen = new BufferedImage(View.SCREEN_WIDTH, View.SCREEN_HEIGHT, 
                                      BufferedImage.TYPE_INT_RGB);
        
        osg = (Graphics2D) offscreen.getGraphics();
        osg.setBackground(Color.BLACK);
        
        // create all layers
        //for (int i = 0; i < LAYERS_SIZE; i++) {
        //    layers[i] = new GraphicBuffer();
        //}
    }
    
    public void draw(Graphics2D g) {
        osg.clearRect(0, 0, View.SCREEN_WIDTH, View.SCREEN_HEIGHT);
        
        drawAllLayers(osg);

        // draw cursor
        boolean blink = (long) (System.nanoTime() * 0.000000004) % 2 == 0;
        if (cursorVisible && blink) {
            Tile cursorTile = cursorTileSet.getTile(cursorTileId);
            cursorTile.draw(osg, cursorCol, cursorRow);
            //drawTile(osg, cursorCol, cursorRow, cursorTileId);
        }
        
        // shake screen effect
        shakeScreenOffsetX = 0;
        if (shakeScreenCount > 0) {
            shakeScreenOffsetX = (int) shakeScreenCount;
            shakeScreenOffsetX *= (shakeScreenOffsetX % 3) - 1;
            shakeScreenCount -= 0.5;
        }
        
        // flash screen effect
        if (flashScreenCount > 0) {
            boolean flashScreen = ((int) flashScreenCount) % 2 == 0;
            if (flashScreen) {
                osg.setColor(flashScreenColor);
                osg.fillRect(0, 0, View.SCREEN_WIDTH, View.SCREEN_HEIGHT);
            }
            flashScreenCount -= 0.5;
        }
        
        g.drawImage(offscreen, shakeScreenOffsetX, 0, 
                    View.SCALED_WIDTH + shakeScreenOffsetX, View.SCALED_HEIGHT,
                    0, 0, View.SCREEN_WIDTH, View.SCREEN_HEIGHT, null);
    }

    private void drawAllLayers(Graphics2D g) {
        for (int layerIndex = 0; layerIndex < LAYERS_SIZE; layerIndex++) {
            GraphicBuffer layer = layers[layerIndex];
            if (layer == null || !layer.isVisible()) {
                continue;
            }
            for (int row = 0; row < 30; row++) {
                for (int col = 0; col < 32; col++) {
                    int tileId = layer.getTileId(col, row);

                    // ignore if transparent
                    if (tileId < 0) {
                        continue;
                    }
                    
                    Tile tile = layer.getTileSet().getTile(tileId);
                    if (tile != null) {
                        tile.draw(g, col, row);
                    }
                }
            }
        }
    }
    
//    private void drawTile(Graphics2D g, int col, int row, int tileId) {
//        int dx1 = col * 8;  
//        int dy1 = row * 8;
//        int dx2 = dx1 + 8; 
//        int dy2 = dy1 + 8;
//        int sx1 = 8 * tileId;
//        int sy1 = 0; 
//        int sx2 = sx1 + 8;
//        int sy2 = sy1 + 8;
//        g.drawImage(tiles, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, null);
//    }
    
// --- Renderer implementation ---

    @Override
    public void loadTilesFromResource(String resource) {
//        try {
//            tiles = ImageIO.read(getClass().getResourceAsStream(resource));
//        } catch (IOException ex) {
//            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
//            System.exit(-1);
//        }        
    }

    @Override
    public void createLayer(int layerIndex, TileSet tileSet) {
        layers[layerIndex] = new GraphicBuffer(tileSet);
    }
    
    @Override
    public void clearLayer(int layerIndex) {
        layers[layerIndex].fill(-1);
        //for (int[] cols : layers[layerIndex].getBuffer()) {
        //    Arrays.fill(cols, (char) 0);
        //}
    }

    @Override
    public void setLayerVisible(int layerIndex, boolean visible) {
        layers[layerIndex].setVisible(visible);
    }
        
    @Override
    public void print(int layerIndex, int col, int row, int tileId) {
        layers[layerIndex].getBuffer()[row][col] = tileId;
    }

    @Override
    public void print(int layerIndex, int col, int row, String text) {
        for (int i = 0; i < text.length(); i++) {
            print(layerIndex, col + i, row, text.charAt(i));
        }
    }
    
    private final int[][] copyArea = new int[LAYER_BUFFER_ROWS][LAYER_BUFFER_COLS];
    
    @Override
    public void copy(int dstLayer, int dstCol, int dstRow, int srcLayer, 
                     int srcCol1, int srcRow1, int srcCol2, int srcRow2) {

        for (int row = srcRow1; row <= srcRow2; row++) {
            for (int col = srcCol1; col <= srcCol2; col++) {
                copyArea[row][col] = layers[srcLayer].getBuffer()[row][col];
            }
        }
        for (int row = srcRow1; row <= srcRow2; row++) {
            for (int col = srcCol1; col <= srcCol2; col++) {
                int dr = dstRow + row - srcRow1;
                int dc = dstCol + col - srcCol1;
                layers[dstLayer].getBuffer()[dr][dc] = copyArea[row][col];
            }
        }
    }
    
    @Override
    public void drawBox(int layerIndex, int tileId, 
                        int col1, int row1, int col2, int row2) {
        
        for (int col = col1; col <= col2; col++) {
            print(layerIndex, col, row1, tileId);
            print(layerIndex, col, row2, tileId);
        }
        for (int row = row1; row <= row2; row++) {
            print(layerIndex, col1, row, tileId);
            print(layerIndex, col2, row, tileId);
        }
    }

    @Override
    public void fillBox(int layerIndex, int tileId, int col1, int row1, 
                        int col2, int row2) {
        
        for (int row = row1; row <= row2; row++) {
            for (int col = col1; col <= col2; col++) {
                print(layerIndex, col, row, tileId);
            }
        }
    }

    @Override
    public GraphicBuffer getLayer(int layerIndex) {
        return layers[layerIndex];
    }

    private static class BoxBorder {
        int topLeft;
        int top;
        int topRight;
        int left;
        int right;
        int bottomLeft;
        int bottom;
        int bottomRight;
    }
    
    private final BoxBorder boxBorder = new BoxBorder();
    
    @Override
    public void setBoxBorderTileIds(int topLeft, int top, int topRight, 
                             int left, int right, 
                             int bottomLeft, int bottom, int bottomRight) {

        boxBorder.topLeft = topLeft;
        boxBorder.top = top;
        boxBorder.topRight = topRight;
        boxBorder.left = left;
        boxBorder.right = right;
        boxBorder.bottomLeft = bottomLeft;
        boxBorder.bottom = bottom;
        boxBorder.bottomRight = bottomRight;
    } 

    @Override
    public void drawBoxBorder(int layerIndex, 
                              int col1, int row1, int col2, int row2) {
        
        for (int row = row1; row <= row2; row++) {
            for (int col = col1; col <= col2; col++) {
                if (row == row1 && col == col1) {
                    print(layerIndex, col, row, boxBorder.topLeft);
                }
                else if (row == row1 && col == col2) {
                    print(layerIndex, col, row, boxBorder.topRight);
                }
                else if (row == row1) {
                    print(layerIndex, col, row, boxBorder.top);
                }
                else if (row == row2 && col == col1) {
                    print(layerIndex, col, row, boxBorder.bottomLeft);
                }
                else if (row == row2 && col == col2) {
                    print(layerIndex, col, row, boxBorder.bottomRight);
                }
                else if (row == row2) {
                    print(layerIndex, col, row, boxBorder.bottom);
                }
                else if (col == col1) {
                    print(layerIndex, col, row, boxBorder.left);
                }
                else if (col == col2) {
                    print(layerIndex, col, row, boxBorder.right);
                }
            }
        }
    }

    @Override
    public void setCursorPosition(int col, int row) {
        cursorCol = col;
        cursorRow = row;
    }

    @Override
    public void setCursorVisible(boolean visible) {
        cursorVisible = visible;
    }

    @Override
    public void setCursorTileSet(TileSet cursorTileSet) {
        this.cursorTileSet = cursorTileSet;
    }

    @Override
    public void setCursorTileId(int cursorChar) {
        this.cursorTileId = cursorChar;
    }

    @Override
    public void shakeScreen(int duration) {
        shakeScreenCount = duration;
    }

    @Override
    public void flashScreen(int duration, Color color) {
        flashScreenColor = color;
        flashScreenCount = duration;
    }

}
