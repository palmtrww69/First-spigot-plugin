package com.palmtrww69.firstplugin.commands;

import com.palmtrww69.firstplugin.utils.RTPUtils;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Random;

public class RandomTPCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {

            Player player = (Player) sender;


            player.teleport(RTPUtils.generateLocation(player));

        }

        return true;
    }
}
