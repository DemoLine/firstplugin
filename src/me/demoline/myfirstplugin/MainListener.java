package me.demoline.myfirstplugin;

import org.bukkit.event.Listener;

/**
 * Created by ПК on 30.04.2017.
 */
public class MainListener implements Listener {
    private MyFirstPlugin main;

    public MainListener(MyFirstPlugin main) {
        this.main = main;
        main.getServer().getPluginManager().registerEvents(this, main);
    }
}