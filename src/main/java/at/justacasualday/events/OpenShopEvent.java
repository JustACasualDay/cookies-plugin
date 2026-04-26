package at.justacasualday.events;

import at.justacasualday.api.CookiesKeys;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.persistence.PersistentDataType;

public class OpenShopEvent implements Listener {
    @EventHandler
    public void onClick(PlayerInteractAtEntityEvent event) {
        Entity entity = event.getRightClicked();
        String npc_type = entity.getPersistentDataContainer().get(CookiesKeys.NPC_TYPE, PersistentDataType.STRING);

        if (npc_type != null && npc_type.equals(CookiesKeys.SHOP_ID)) {
            event.getPlayer().sendMessage("Clicked at SHOP!");
            event.setCancelled(true);
        }
    }
}
