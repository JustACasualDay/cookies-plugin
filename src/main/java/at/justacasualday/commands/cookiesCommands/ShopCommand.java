package at.justacasualday.commands.cookiesCommands;

import at.justacasualday.api.CookiesCommand;
import at.justacasualday.api.CookiesKeys;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public class ShopCommand implements CookiesCommand {
    @Override
    public void onCommand(CommandSender sender, Command command, String label, List<String> args) {
        if (sender instanceof Player player) {
            if (!args.isEmpty()) {
                switch (args.getFirst()) {
                    case "spawn" -> spawn(player);
                    case "open" -> {
                    }

                }
            }
        }
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String label, List<String> args) {
        return List.of("open", "spawn");
    }

    private void spawn(Player player) {
        Villager villager = player.getWorld().spawn(new Location(player.getWorld(), player.getLocation().getBlockX(), player.getLocation().getBlockY(), player.getLocation().getBlockZ()), Villager.class);
        villager.setAI(false);
        villager.setInvulnerable(true);
        villager.setCollidable(false);
        villager.setSilent(true);
        villager.getPersistentDataContainer().set(CookiesKeys.NPC_TYPE, PersistentDataType.STRING, CookiesKeys.SHOP_ID);
    }
}
