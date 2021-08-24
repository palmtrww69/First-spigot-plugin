package com.palmtrww69.firstplugin.utils;


import org.bukkit.Location;

import org.bukkit.Material;
import org.bukkit.block.*;

import org.bukkit.entity.Player;


import java.util.HashSet;
import java.util.Random;

public class RTPUtils {

    public static HashSet<Material> bad_blocks = new HashSet<>();

    static{
        bad_blocks.add(Material.LAVA);
        bad_blocks.add(Material.FIRE);
        bad_blocks.add(Material.CACTUS);
    }


    public static Location generateLocation(Player player) {

        Random random = new Random();

        int x = random.nextInt(1000);
        int y = 150;
        int z = random.nextInt(1000);

        Location randomLoc = new Location(player.getWorld(), x, y, z);

        y = randomLoc.getWorld().getHighestBlockYAt(randomLoc);
        randomLoc.setY(y);

        while (!isLocationSafe(randomLoc)) {
            randomLoc = generateLocation(player);
        }
        return randomLoc;
    }


    public static boolean isLocationSafe(Location location) {

        int x = location.getBlockX();
        int y = location.getBlockY();
        int z = location.getBlockZ();

        Block block = location.getWorld().getBlockAt(x, y, z);
        Block below = location.getWorld().getBlockAt(x, y- 1, z);
        Block above = location.getWorld().getBlockAt(x, y + 1, z);

        return !(bad_blocks.contains(below.getType()) || (block.getType().isSolid()) || above.getType().isSolid());

    }

}
