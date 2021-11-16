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
public class TestMap3 extends Map {
    private BugEnemy SecondBug, ThirdBug;

    public TestMap3() {
        super("test_map3.txt", new CommonTileset(), new Point(1, 22));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new BugEnemy(getPositionByTileIndex(18, 20), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(20, 20), Direction.RIGHT));
        enemies.add(new BugEnemy(getPositionByTileIndex(34, 23), Direction.RIGHT));
        enemies.add(new BugEnemy(getPositionByTileIndex(35, 23), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(8, 22), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(50, 21), Direction.LEFT));
        enemies.add(new DinosaurEnemy(getPositionByTileIndex(27, 21).addY(2), getPositionByTileIndex(22, 1).addY(2), Direction.RIGHT));
        return enemies;
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();

        /*enhancedMapTiles.add(new HorizontalMovingPlatform(
                ImageLoader.load("GreenPlatform.png"),
                getPositionByTileIndex(24, 6),
                getPositionByTileIndex(27, 6),
                TileType.JUMP_THROUGH_PLATFORM,
                3,
                new Rectangle(0, 6,16,4),
                Direction.RIGHT
        ));*/

        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(52, 19)
        ));

        return enhancedMapTiles;
    }

    @Override
    public ArrayList<NPC> loadNPCs() {
        ArrayList<NPC> npcs = new ArrayList<>();

        npcs.add(new Walrus(getPositionByTileIndex(12, 20).subtract(new Point(0, 13)), this));

        return npcs;
    }
}


