package Maps;

import Enemies.BugEnemy;
import Enemies.DinosaurEnemy;
import Engine.ImageLoader;
import EnhancedMapTiles.EndLevelBox;
import EnhancedMapTiles.HorizontalMovingPlatform;
import GameObject.Rectangle;
import Level.*;
import NPCs.Walrus;
import Tilesets.CommonTileset;
import Utils.Direction;
import Utils.Point;

import java.util.ArrayList;

// Represents a test map to be used in a level
public class TestMap5 extends Map {

    public TestMap5() {
        super("test_map5.txt", new CommonTileset(), new Point(1, 11));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new BugEnemy(getPositionByTileIndex(5, 23), Direction.RIGHT));
        enemies.add(new BugEnemy(getPositionByTileIndex(6, 23), Direction.RIGHT));
        enemies.add(new BugEnemy(getPositionByTileIndex(7, 23), Direction.RIGHT));
        enemies.add(new BugEnemy(getPositionByTileIndex(8, 23), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(9, 23), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(38, 17), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(41, 23), Direction.RIGHT));
        enemies.add(new BugEnemy(getPositionByTileIndex(42, 23), Direction.RIGHT));
        enemies.add(new BugEnemy(getPositionByTileIndex(43, 23), Direction.RIGHT));
        enemies.add(new BugEnemy(getPositionByTileIndex(44, 23), Direction.RIGHT));
        enemies.add(new BugEnemy(getPositionByTileIndex(45, 23), Direction.RIGHT));
        enemies.add(new BugEnemy(getPositionByTileIndex(46, 23), Direction.RIGHT));
        enemies.add(new BugEnemy(getPositionByTileIndex(47, 23), Direction.RIGHT));
        enemies.add(new BugEnemy(getPositionByTileIndex(48, 23), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(49, 23), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(50, 23), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(51, 23), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(52, 23), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(53, 23), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(54, 23), Direction.LEFT));

        
        enemies.add(new BugEnemy(getPositionByTileIndex(25, 23), Direction.RIGHT));
        enemies.add(new BugEnemy(getPositionByTileIndex(26, 23), Direction.RIGHT));
        enemies.add(new BugEnemy(getPositionByTileIndex(27, 23), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(28, 23), Direction.LEFT));

        
        return enemies;
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();


        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(54, 19)
        ));

        return enhancedMapTiles;
    }

    
    }

