package at.justacasualday.api;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

/**
 * Base class for every cookies related item
 */
public abstract class CookiesItem implements Listener {
    protected final NamespacedKey ID;
    protected final String itemID;
    protected ItemTiers tier;
    protected ItemStack item;
    protected ItemMeta meta;

    public CookiesItem(String itemID) {
        ID = CookiesKeys.COOKIES_ITEM;
        this.itemID = itemID;
    }

    public ItemStack create() {
        tier = ItemTiers.I;
        item = new ItemStack(getMaterial());
        meta = item.getItemMeta();
        meta.getPersistentDataContainer().set(ID, PersistentDataType.STRING, itemID);
        item.setItemMeta(meta);

        return item;
    }

    protected abstract Material getMaterial();

    protected abstract void onInteract(PlayerInteractEvent event);
}
