package com.palmtrww69.firstplugin.tasks;

import com.palmtrww69.firstplugin.FirstPlugin;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class KeepDayTask extends BukkitRunnable {

    FirstPlugin plugin;

    public KeepDayTask(FirstPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run() {
        String world = plugin.getConfig().getString("lobby-world");
        Bukkit.getServer().getWorld(plugin.getConfig().getString("lobby-world")).setTime(0L);
        if (Bukkit.getServer().getWorld(world) != null) {

            Bukkit.getServer().getWorld(plugin.getConfig().getString("lobby-world")).setTime(0L);


        } else {

            System.out.println("The lobby world in the config.yml doesn't exist! make sure everything is right (FirstPlugin)");

        }

    }
}
