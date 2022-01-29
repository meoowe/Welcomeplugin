package com.meoowe.welcome.events;

import com.meoowe.welcome.WelcomePlugin;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class JoinHandler implements Listener{

    @EventHandler
    public static void playerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        String message = WelcomePlugin.getInstance().getConfig().getString("join-message");
        if (message != null) {
            e.setJoinMessage(ChatColor.translateAlternateColorCodes('&', message.replace("{player}", e.getPlayer().getName())));
        }
    }



}

