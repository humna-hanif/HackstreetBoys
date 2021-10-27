package MapEditor;

import Level.Map;
import Maps.TestMap;
import Maps.TitleScreenMap;
import Maps.TestMap2;
import Maps.TestMap3;

import java.util.ArrayList;

public class EditorMaps {
    public static ArrayList<String> getMapNames() {
        return new ArrayList<String>() {{
            add("TestMap");
            add("TestMap2");
            add("TestMap3");
            add("TitleScreen");
        }};
    }

    public static Map getMapByName(String mapName) {
        switch(mapName) {
            case "TestMap":
                return new TestMap();
            case "TestMap2":
                return new TestMap2();
            case "TestMap3":
                return new TestMap3();
            case "TitleScreen":
                return new TitleScreenMap();
            default:
                throw new RuntimeException("Unrecognized map name");
        }
    }
}
