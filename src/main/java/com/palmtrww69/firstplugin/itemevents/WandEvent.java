package com.palmtrww69.firstplugin.itemevents;

import com.palmtrww69.firstplugin.items.ItemManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class WandEvent implements Listener {

    @EventHandler
    public static void onRightCLick(PlayerInteractEvent e) {

        if(e.getAction() == Action.RIGHT_CLICK_BLOCK) {

            if(e.getItem() != null) {

                if(e.getItem().getItemMeta().equals(ItemManager.wand.getItemMeta())) {

                    Player player = e.getPlayer();
                    player.getWorld().createExplosion(player.getLocation(), 2.0f);
                    player.sendMessage("§6You dare use the stick of truth?! YOU MUST FACE THE CONSEQUENCES");

                }

            }

        }

    }

}
