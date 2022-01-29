package welcomeplugin.welcomeplugin;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import welcomeplugin.welcomeplugin.events.whenplayerjoins;


public final class Welcome extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new whenplayerjoins(), this);
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Welcomeplugin] Enabled");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED + "[Welcomeplugin] Disabed");
    }
}
