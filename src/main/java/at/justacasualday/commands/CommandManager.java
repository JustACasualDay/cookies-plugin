package at.justacasualday.commands;

import at.justacasualday.api.CookiesCommand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandManager {
    private static final Map<String, CookiesCommand> commands = new HashMap<>();

    public static boolean register(String literal, CookiesCommand listener) {
        if (commands.containsKey(literal)) return false;
        commands.put(literal, listener);

        return true;
    }

    public static CookiesCommand getCommand(String literal) {
        return commands.get(literal);
    }

    public static List<String> getCommandTabComplete() {
        return new ArrayList<>(commands.keySet());
    }
}
