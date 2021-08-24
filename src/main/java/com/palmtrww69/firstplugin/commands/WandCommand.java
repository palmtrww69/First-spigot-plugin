package com.palmtrww69.firstplugin.commands;

import com.palmtrww69.firstplugin.items.ItemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WandCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player)) {
            sender.sendMessage("Only players can use that command");
            return true;
        }

        Player player = (Player) sender;

        if (player.hasPermission("firstplugin.and")) {

            player.getInventory().addItem(ItemManager.wand);

        }

        return true;
    }
}
