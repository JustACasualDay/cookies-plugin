package at.justacasualday.items;

import at.justacasualday.api.CookiesItem;
import at.justacasualday.api.CookiesKeys;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;

public class CookiesPickaxe extends CookiesItem {
    public CookiesPickaxe() {
        super(CookiesKeys.COOKIES_PICKAXE);
    }

    @Override
    protected Material getMaterial() {
        return Material.IRON_PICKAXE;
    }

    @Override
    protected void onInteract(PlayerInteractEvent event) {
    }

    public void onBreak(BlockBreakEvent event) {

        ItemStack item = event.getPlayer().getItemInUse();
        if (item == null) return;
        ItemMeta meta = item.getItemMeta();

        if (meta.getPersistentDataContainer().get(CookiesKeys.COOKIES_ITEM, PersistentDataType.STRING).equals(CookiesKeys.COOKIES_PICKAXE)) {
            event.setCancelled(true);
            // TODO: Drop Loot
        }
    }

    @Override
    public ItemStack create() {
        super.create();

        meta.setUnbreakable(true);
        meta.addEnchant(Enchantment.UNBREAKING, 1, true);
        meta.setItemName(ChatColor.GOLD + "Cookies Pickaxe");
        meta.setHideTooltip(true);
        meta.setLore(List.of("Pickaxe to break Cookie Blocks!"));
        item.setItemMeta(meta);

        return item;
    }
}
