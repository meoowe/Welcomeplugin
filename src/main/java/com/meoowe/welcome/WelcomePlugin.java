package com.meoowe.welcome;

import org.bukkit.plugin.java.JavaPlugin;
import com.meoowe.welcome.events.JoinHandler;


public final class WelcomePlugin extends JavaPlugin {

    private static WelcomePlugin instance;

    @Override
    public void onEnable() {
        instance = this;

        getServer().getPluginManager().registerEvents(new JoinHandler(), this);
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
    }

    public static WelcomePlugin getInstance() {
        return instance;
    }
}
