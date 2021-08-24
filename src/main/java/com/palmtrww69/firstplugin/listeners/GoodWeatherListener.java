package com.palmtrww69.firstplugin.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class GoodWeatherListener implements Listener
{

    @EventHandler
    public void onWeatherChange(WeatherChangeEvent e) {

        e.setCancelled(true);

    }

}
