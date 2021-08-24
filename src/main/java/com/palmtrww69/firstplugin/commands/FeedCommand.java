package com.palmtrww69.firstplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;
            if(p.hasPermission("firstplugin.feed")) {

                p.setFoodLevel(20);
                p.sendMessage("§4§lYour have been fed!");

            } else {

                p.sendMessage("§7I'm sorry but you don't have permissions to execute this command");

            }
        } else {

            System.out.println("Only players can execute this command");

        }

        return true;
    }

}
