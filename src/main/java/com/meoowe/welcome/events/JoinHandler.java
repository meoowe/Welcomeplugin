package com.meoowe.welcome.events;

import com.meoowe.welcome.WelcomePlugin;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class JoinHandler implements Listener{

    @EventHandler
    public static void playerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        String name = JavaPlugin.getPlugin(WelcomePlugin.class).getConfig().getString("Server_name");
        player.sendMessage(ChatColor.GREEN + "Welcome to " + name + ", "  + player.getName());
    }



}

