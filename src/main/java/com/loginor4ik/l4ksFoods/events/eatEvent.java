package com.loginor4ik.l4ksFoods.events;

import com.loginor4ik.l4ksFoods.L4ksFoods;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class eatEvent implements Listener {

    @EventHandler
    public void onPlayerItemConsume(PlayerItemConsumeEvent e) {
        if(e.getItem().getType() == Material.COOKED_PORKCHOP) {
            ItemStack item = e.getItem();
            ItemMeta meta = item.getItemMeta();
            Player player = e.getPlayer();

            if(meta.getCustomModelData() == L4ksFoods.getCMD()) {
                player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, L4ksFoods.getSDuration(), 0, true, true));
            }
        }
    }
}
