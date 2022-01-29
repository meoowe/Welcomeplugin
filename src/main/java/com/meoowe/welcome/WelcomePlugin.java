package com.meoowe.welcome;

import org.bukkit.plugin.java.JavaPlugin;
import com.meoowe.welcome.events.JoinHandler;


public final class WelcomePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new JoinHandler(), this);
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
    }

}
