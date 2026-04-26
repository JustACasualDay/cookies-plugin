package at.justacasualday.commands.cookiesCommands;

import at.justacasualday.api.CookiesCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.List;

public class TestCommand implements CookiesCommand {
    @Override
    public void onCommand(CommandSender sender, Command command, String label, List<String> args) {

    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, List<String> args) {
        return List.of("Tested", "Hi", "fex");
    }
}
