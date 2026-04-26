package at.justacasualday.api;

import at.justacasualday.cookies.Cookies;
import org.bukkit.NamespacedKey;

public class CookiesKeys {
    public static final NamespacedKey NPC_TYPE = new NamespacedKey(Cookies.getInstance(), "NPC_TYPE");
    public static final NamespacedKey COOKIES_ITEM = new NamespacedKey(Cookies.getInstance(), "COOKIES_ITEM");

    public static final String SHOP_ID = "cookies:shop";
    public static final String COOKIES_PICKAXE = "cookies:pickaxe";
}
