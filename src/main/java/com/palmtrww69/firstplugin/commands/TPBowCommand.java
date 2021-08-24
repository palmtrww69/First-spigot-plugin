package com.palmtrww69.firstplugin.commands;

import com.palmtrww69.firstplugin.items.ItemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TPBowCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {

            Player player = (Player) sender;

            player.getInventory().addItem(ItemManager.tpbow);
        } else {
            System.out.println("You aren't a player, you can't use this command");
        }

        return true;
    }
}
