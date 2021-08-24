package com.palmtrww69.firstplugin.commands;

import com.palmtrww69.firstplugin.FirstPlugin;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class FlyCommand implements CommandExecutor {

    private ArrayList<Player> list_of_flying_people = new ArrayList<>();
    private FirstPlugin plugin;

    public FlyCommand(FirstPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;
            String onMessage = plugin.getConfig().getString("on-message");
            String offMessage = plugin.getConfig().getString("off-message");
            if(player.hasPermission("firstplugin.fly")){
                if (list_of_flying_people.contains(player)){
                    list_of_flying_people.remove(player);
                    player.sendMessage(offMessage);
                    player.setAllowFlight(false);
                }else if(!list_of_flying_people.contains(player)){
                    list_of_flying_people.add(player);
                    player.sendMessage(onMessage);
                    player.setAllowFlight(true);
                }
            }else{
                player.sendMessage(ChatColor.GREEN + "You don't have the " + ChatColor.YELLOW + "firstplugin.fly " + ChatColor.GREEN + "permission required to use this command.");
            }
        }else{
            System.out.println("You must be a player to fly.");
        }

        return true;
    }
}
