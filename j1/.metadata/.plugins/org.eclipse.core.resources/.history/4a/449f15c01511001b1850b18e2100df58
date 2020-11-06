package br.ol.dq1.infra;

/**
 * Player class.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 */
public class Player {
 
    public int col; // X* -> X = (col,row)
    public int row; // ** 
    private final Sprite sprite;

    private String name;
    private int levelGrowthType;
    private int level;
    private int hp;
    private int mp;
    private int strength;
    private int agility;
    private int vitality;
    private int maxHp;
    private int maxMp;
    private int attack;
    private int defense;
    
    // inventory
    
    public Player() {
        sprite = new Sprite(Assets.tileSets.get("player"));
        sprite.setFrame(Sprite.DOWN, 0, 1, 4, 5, 2, 3, 6, 7);
        sprite.setAnimation(Sprite.DOWN);
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void update() {
    }

    public void draw(int[][] screenBuffer) {
    }
    
}
