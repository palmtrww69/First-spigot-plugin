package com.palmtrww69.firstplugin.listeners;

import com.palmtrww69.firstplugin.FirstPlugin;
import com.palmtrww69.firstplugin.items.ItemManager;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.map.MinecraftFont;
import org.json.simple.ItemList;

public class PlayerJoinListeners implements Listener {

    FirstPlugin plugin;

    public PlayerJoinListeners(FirstPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e ){

        Player p = e.getPlayer();


        p.getInventory().addItem();

        if(plugin.getConfig().getBoolean("motd")) {

            for (int i = 0; i < plugin.getConfig().getList("motd-message").size(); i++) {


                p.sendMessage(plugin.getConfig().getList("motd-message").get(i).toString());

            }

        }

    }

}
