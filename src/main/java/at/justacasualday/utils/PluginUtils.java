package at.justacasualday.utils;

import at.justacasualday.commands.CommandManager;
import at.justacasualday.commands.RootCommand;
import at.justacasualday.commands.cookiesCommands.ShopCommand;
import at.justacasualday.commands.cookiesCommands.TestCommand;
import at.justacasualday.cookies.Cookies;
import at.justacasualday.events.OpenShopEvent;
import org.bukkit.Bukkit;

public class PluginUtils {
    private final Cookies plugin;

    public PluginUtils(Cookies plugin) {
        this.plugin = plugin;
    }

    public void init() {
        plugin.getLogger().info("Hello from Cookies!");

        registerCommands();
        registerEvents();
    }

    private void registerEvents() {
        //Bukkit.getPluginManager().registerEvents();
        Bukkit.getPluginManager().registerEvents(new OpenShopEvent(), plugin);

        plugin.getLogger().info("Registed Events");
    }

    /**
     * Register root Command; Add the rest of subcommands in CommandManager
     */
    private void registerCommands() {

        // Root Command
        plugin.getCommand("jccookies").setExecutor(new RootCommand());

        // TODO: make the Commands WAY better
        CommandManager.register("shop", new ShopCommand());
        CommandManager.register("test", new TestCommand());
        plugin.getLogger().info("Registered Commands");
    }

    public void quit() {
        // save config
        plugin.getLogger().info("Goodbye from Cookies");
    }
}
