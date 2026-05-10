package at.justacasualday.config;

import at.justacasualday.cookies.Cookies;
import at.justacasualday.justACasualAPI.configs.JSONConfig;
import at.justacasualday.map.GameMap;

import java.util.List;

public class MapConfig {
    private final JSONConfig<GameMap> mapConfig;
    private final List<GameMap> maps;

    public MapConfig(Cookies plugin) {
        mapConfig = new JSONConfig<>("maps.json", plugin, GameMap.class);
        maps = mapConfig.getObjectList();
    }

    public void quit() {
        mapConfig.saveToFile();
    }

    public GameMap getGameMap(String name) {
        for (GameMap map : maps) {
            if (map.getName().equals(name)) return map;
        }

        return null;
    }

    public void addMap(GameMap map) {
        maps.add(map);
    }
}
