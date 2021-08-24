package com.palmtrww69.firstplugin;

import com.palmtrww69.firstplugin.commands.*;
import com.palmtrww69.firstplugin.itemevents.TPBowEvent;
import com.palmtrww69.firstplugin.itemevents.WandEvent;
import com.palmtrww69.firstplugin.items.ItemManager;
import com.palmtrww69.firstplugin.listeners.GoodWeatherListener;
import com.palmtrww69.firstplugin.listeners.PlayerJoinListeners;
import com.palmtrww69.firstplugin.tasks.KeepDayTask;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public final class FirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {

        // Config
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        System.out.println("Now working (FirstPlugin)");
        ItemManager.init();

        // Commands
        getCommand("wand").setExecutor(new WandCommand());
        getCommand("tpbow").setExecutor(new TPBowCommand());
        getCommand("rtp").setExecutor(new RandomTPCommand());
        getCommand("fly").setExecutor(new FlyCommand(this));
        getCommand("feed").setExecutor(new FeedCommand());

        // Item Events
        getServer().getPluginManager().registerEvents(new WandEvent(), this);
        getServer().getPluginManager().registerEvents(new TPBowEvent(), this);

        // Listeners
        getServer().getPluginManager().registerEvents(new GoodWeatherListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerJoinListeners(this), this);


        // Tasks
        BukkitTask keepDayTask = new KeepDayTask(this).runTaskTimer(this, 0L, 100L);

    }

}
