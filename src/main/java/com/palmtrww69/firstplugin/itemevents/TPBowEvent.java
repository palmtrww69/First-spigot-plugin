package com.palmtrww69.firstplugin.itemevents;

import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class TPBowEvent implements Listener {

    @EventHandler
    public void onBowShoot(ProjectileHitEvent e) {

        if (e.getEntity() instanceof Arrow) {

            Player player = (Player) e.getEntity().getShooter();

            Location location = e.getEntity().getLocation();

            player.teleport(location);
            player.playSound(player.getLocation(), Sound.ENTITY_CAT_PURR, 1.0F, 1.0F);
            player.sendMessage("§4§lSwoosh");

        }

    }

}
