package br.ol.dq1.infra;

/**
 * Sprite class.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 */
public class Sprite {

    public static final int UP = 0;
    public static final int DOWN = 1;
    public static final int LEFT = 2;
    public static final int RIGHT = 3;
    public static final int OPEN = 4;
    public static final int CLOSE = 5;
    public static final int STATIC = 6;
    
    private final TileSet tileSet;
    private final int[][] frames;
    private int animation = STATIC;

    public Sprite(TileSet tileSet) {
        this.tileSet = tileSet;
        frames = new int[7 * 2][4];
    }

    public TileSet getTileSet() {
        return tileSet;
    }

    public int[][] getFrames() {
        return frames;
    }
    
    public void setFrame(int startIndex,
            int tileId1a, int tileId2a, int tileId3a, int tileId4a,
            int tileId1b, int tileId2b, int tileId3b, int tileId4b) {
        
        int[] frameA = new int[] { tileId1a, tileId2a, tileId3a, tileId4a };
        int[] frameB = new int[] { tileId1b, tileId2b, tileId3b, tileId4b };
        frames[startIndex * 2] = frameA;
        frames[startIndex * 2 + 1] = frameB;
    }

    public int getAnimation() {
        return animation;
    }

    public void setAnimation(int animation) {
        this.animation = animation;
    }

    public void draw(GraphicBuffer graphicBuffer, int col, int row) {
        int f = ((int) (System.nanoTime() * 0.000000005)) % 2;
        int[] frame = frames[animation * 2 + f];
        graphicBuffer.putTileId(col, row, frame[0]);
        graphicBuffer.putTileId(col + 1, row, frame[1]);
        graphicBuffer.putTileId(col, row + 1, frame[2]);
        graphicBuffer.putTileId(col + 1, row + 1, frame[3]);
    } 
    
}
