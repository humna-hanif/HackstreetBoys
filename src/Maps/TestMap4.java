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
public class TestMap4 extends Map {
    private BugEnemy SecondBug, ThirdBug;

    public TestMap4() {
        super("test_map4.txt", new CommonTileset(), new Point(1, 11));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new BugEnemy(getPositionByTileIndex(8, 22), Direction.RIGHT));
        enemies.add(new BugEnemy(getPositionByTileIndex(9, 22), Direction.RIGHT));
        enemies.add(new BugEnemy(getPositionByTileIndex(10, 22), Direction.RIGHT));
        enemies.add(new BugEnemy(getPositionByTileIndex(11, 22), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(12, 22), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(13, 22), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(14, 22), Direction.LEFT));
        
        
        enemies.add(new BugEnemy(getPositionByTileIndex(27, 21), Direction.RIGHT));
        enemies.add(new BugEnemy(getPositionByTileIndex(29, 21), Direction.RIGHT));
        enemies.add(new BugEnemy(getPositionByTileIndex(31, 21), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(33, 21), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(35, 21), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(37, 21), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(39, 21), Direction.LEFT));
        
        enemies.add(new BugEnemy(getPositionByTileIndex(49, 21), Direction.RIGHT));
        enemies.add(new BugEnemy(getPositionByTileIndex(50, 21), Direction.RIGHT));
        enemies.add(new BugEnemy(getPositionByTileIndex(51, 21), Direction.RIGHT));
        enemies.add(new BugEnemy(getPositionByTileIndex(52, 21), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(53, 21), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(54, 21), Direction.LEFT));
        
        enemies.add(new DinosaurEnemy(getPositionByTileIndex(25, 11).addY(2), getPositionByTileIndex(22, 1).addY(2), Direction.RIGHT));
        return enemies;
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();

        enhancedMapTiles.add(new HorizontalMovingPlatform(
                ImageLoader.load("GreenPlatform.png"),
                getPositionByTileIndex(8, 20),
                getPositionByTileIndex(14, 20),
                TileType.JUMP_THROUGH_PLATFORM,
                3,
                new Rectangle(0, 6,16,4),
                Direction.RIGHT
        ));

        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(51, 10)
        ));

        return enhancedMapTiles;
    }

    
    }



