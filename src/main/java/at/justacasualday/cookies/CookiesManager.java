package at.justacasualday.cookies;

import org.bukkit.Location;

import java.util.ArrayList;
import java.util.List;

/**
 * Main class to store Cookies related data
 */
public class CookiesManager {
    private static final List<Location> cookieGeneratorBlockLocations = new ArrayList<>();

    public static boolean isCookieGeneratorBlock(Location loc) {
        return cookieGeneratorBlockLocations.contains(loc);
    }

    public static void addCookieGeneratorBlock(Location loc) {
        cookieGeneratorBlockLocations.add(loc);
    }
}
