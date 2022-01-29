package welcomeplugin.welcomeplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import welcomeplugin.welcomeplugin.Welcome;


public class whenplayerjoins implements Listener{
    @EventHandler
    public static void onPlayerjoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        String name = JavaPlugin.getPlugin(Welcome.class).getConfig().getString("Server_name");
        player.sendMessage(ChatColor.GREEN + "Welcome to " + name + ", "  + player.getName());
    }



}

