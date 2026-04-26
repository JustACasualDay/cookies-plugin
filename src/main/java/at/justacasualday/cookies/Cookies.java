package at.justacasualday.cookies;

import at.justacasualday.utils.PluginUtils;
import org.bukkit.plugin.java.JavaPlugin;

public final class Cookies extends JavaPlugin {
    private static Cookies instance;
    private final PluginUtils utils = new PluginUtils(this);

    public static boolean isDev() {
        return true;
    }

    public static Cookies getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        utils.init();
    }

    @Override
    public void onDisable() {
        utils.quit();
    }
}
