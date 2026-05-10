package at.justacasualday.commands;

import at.justacasualday.api.CookiesCommand;
import at.justacasualday.cookies.Cookies;
import at.justacasualday.map.Region;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RootCommand implements CommandExecutor, TabCompleter {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player) {
            if (Cookies.isDev()) {
                player.sendMessage("Command: " + command.toString());
                player.sendMessage("Label: " + label);
                player.sendMessage("ARGS: " + Arrays.toString(args));
            }

            if (args.length >= 1) {
                CookiesCommand subCommand = CommandManager.getCommand(args[0]);
                if (subCommand != null) {
                    List<String> arg = new ArrayList<>(List.of(args));
                    arg.removeFirst();
                    subCommand.onCommand(sender, command, label, arg);
                }
            }
        }

        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        if (args.length >= 1) {
            CookiesCommand subCommand = CommandManager.getCommand(args[0]);
            if (subCommand != null) {
                List<String> arg = new ArrayList<>(List.of(args));
                arg.removeFirst();

                return subCommand.onTabComplete(sender, command, label, arg);
            }
        }

        return CommandManager.getCommandTabComplete();
    }
}
