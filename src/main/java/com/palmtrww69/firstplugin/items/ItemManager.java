package com.palmtrww69.firstplugin.items;

import com.palmtrww69.firstplugin.FirstPlugin;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack wand;
    public static ItemStack tpbow;

    // Da symbol: §



    public static void init() {

        createWand();
        createTpBow();

    }

    private static void createWand() {

        List<String> lore = new ArrayList<>();

        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6§lThe Wizard's Wand!");
        lore.add("§7§lThis powerful artifact is a relic of");
        lore.add("§7§lThis is apart of minecraft's history!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        wand = item;

    }

    private static void createTpBow() {

        List<String> lore = new ArrayList<>();

        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6§lTeleportation Bow");
        lore.add("§7§lThis bow will teleport you where ever you want to go!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.ARROW_INFINITE, 69, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        tpbow = item;

    }
}
