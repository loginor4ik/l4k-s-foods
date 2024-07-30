package com.loginor4ik.l4ksFoods;

import com.loginor4ik.l4ksFoods.events.eatEvent;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class L4ksFoods extends JavaPlugin {

    public static FileConfiguration config;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        config = getConfig();

        getServer().getPluginManager().registerEvents(new eatEvent(), this);
    }

    public static int getCMD() {
        return config.getInt("customModelData");
    }

    public static int getSDuration() {
        return config.getInt("saturationEffectDuration");
    }

    public static String getCFColor() {
        return config.getString("chickenFootColor");
    }

    public static String getCFName() {
        return config.getString("chickenFootName");
    }
}