package br.ol.dq1.infra;

import java.util.HashMap;
import java.util.Map;

/**
 * Assets class.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 */
public class Assets {
    
    public static Map<String, TileSet> tileSets = new HashMap<>();
    public static Map<String, br.ol.dq1.infra.Map> mapsSet = new HashMap<>();
    
    public static void loadTileSetFromResource(String name) {
        TileSet tileSet = new TileSet(name);
        tileSets.put(name, tileSet);
    }     

    public static void loadMapFromResource(String name, String resource) {
        br.ol.dq1.infra.Map map = new br.ol.dq1.infra.Map(resource);
        mapsSet.put(name, map);
    }    
    
}
