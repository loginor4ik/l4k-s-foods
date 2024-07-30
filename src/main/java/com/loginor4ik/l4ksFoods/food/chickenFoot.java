package com.loginor4ik.l4ksFoods.food;

import com.loginor4ik.l4ksFoods.L4ksFoods;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.awt.*;

public class chickenFoot {
    public static ItemStack getChickenFoot() {
        ItemStack item = new ItemStack(Material.COOKED_PORKCHOP);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.of(L4ksFoods.getCFColor()) + L4ksFoods.getCFName());
        meta.setCustomModelData(L4ksFoods.getCMD());

        item.setItemMeta(meta);
        return item;
    }
}
