package at.justacasualday.map;

import at.justacasualday.api.Team;
import org.bukkit.Location;

import java.util.List;
import java.util.Map;

public class GameMap {
    private final String name;

    private final List<Location> blockSpawners;
    private final Map<Team, Location> teamSpawns;
    private final Map<Team, Location> villagers;
    private final Map<Team, Location> witch;
    private final Map<Team, Location> oli;
    private final Map<Team, Location> banker;
    private final Map<Team, Region> towers;

    public GameMap(String name, List<Location> blockSpawners, Map<Team, Location> teamSpawns, Map<Team, Location> villagers, Map<Team, Location> witch, Map<Team, Location> oli, Map<Team, Location> banker, Map<Team, Region> towers) {
        this.name = name;
        this.blockSpawners = blockSpawners;
        this.teamSpawns = teamSpawns;
        this.villagers = villagers;
        this.witch = witch;
        this.oli = oli;
        this.banker = banker;
        this.towers = towers;
    }

    public String getName() {
        return name;
    }

    public List<Location> getBlockSpawners() {
        return blockSpawners;
    }

    public Map<Team, Location> getTeamSpawns() {
        return teamSpawns;
    }

    public Map<Team, Location> getVillagers() {
        return villagers;
    }

    public Map<Team, Location> getWitch() {
        return witch;
    }

    public Map<Team, Location> getOli() {
        return oli;
    }

    public Map<Team, Location> getBanker() {
        return banker;
    }

    public Map<Team, Region> getTowers() {
        return towers;
    }
}
