package at.justacasualday.api;

import org.bukkit.ChatColor;

public enum Team {
    BLUE("Blue", ChatColor.BLUE),
    RED("Red", ChatColor.RED);

    private final String name;
    private final ChatColor chatColor;

    Team(String name, ChatColor chatColor) {
        this.name = name;
        this.chatColor = chatColor;
    }

    public String getName() {
        return name;
    }

    public ChatColor getChatColor() {
        return chatColor;
    }
}
