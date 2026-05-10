package at.justacasualday.cookies;

import at.justacasualday.config.MapConfig;
import at.justacasualday.utils.PluginUtils;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.incendo.cloud.CommandManager;
import org.incendo.cloud.bukkit.BukkitCommandManager;
import org.jspecify.annotations.NonNull;

public final class Cookies extends JavaPlugin {
    private static Cookies instance;
    private final PluginUtils utils = new PluginUtils(this);
    private final MapConfig mapConfig = new MapConfig(this);

    public static boolean isDev() {
        return true;
    }

    public static Cookies getInstance() {
        return instance;
    }

    @Override
    public void onLoad() {
        instance = this;
        utils.init();
    }

    @Override
    public void onEnable() {
        // TODO: Command Manager init
        getLogger().info("Hello from Cookies! :)");
    }

    @Override
    public void onDisable() {
        utils.quit();
        mapConfig.quit();
    }
}
