package at.justacasualday.api;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.List;
import java.util.Map;

public interface CookiesCommand {
    void onCommand(CommandSender sender, Command command, String label, List<String> args);

    List<String> onTabComplete(CommandSender sender, Command command, String label, List<String> args);
}
