package at.justacasualday.map;

import org.bukkit.Location;

public class Region {
    private final Location loc1;
    private final Location loc2;

    private final int minX, maxX, minY, maxY, minZ, maxZ;

    public Region(Location loc1, Location loc2) {
        this.loc1 = loc1;
        this.loc2 = loc2;

        minX = Math.min(loc1.getBlockX(), loc2.getBlockX());
        minY = Math.min(loc1.getBlockY(), loc2.getBlockY());
        minZ = Math.min(loc1.getBlockZ(), loc2.getBlockZ());

        maxX = Math.max(loc1.getBlockX(), loc2.getBlockX());
        maxY = Math.max(loc1.getBlockY(), loc2.getBlockY());;
        maxZ = Math.max(loc1.getBlockZ(), loc2.getBlockZ());;
    }

    public boolean inSide(Location loc) {
        return
            loc.getBlockX() >= minX && loc.getBlockX() <= maxX &&
            loc.getBlockY() >= minY && loc.getBlockY() <= maxY &&
            loc.getBlockZ() >= minZ && loc.getBlockZ() <= maxZ;
    }

    public Location getLoc1() {
        return loc1;
    }

    public Location getLoc2() {
        return loc2;
    }
}
