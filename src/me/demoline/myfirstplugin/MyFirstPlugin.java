package me.demoline.myfirstplugin;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by ПК on 29.04.2017.
 */
public class MyFirstPlugin extends JavaPlugin {
    @Override
    public  void onEnable() {
    try {
        Player player = event.getPlayer();
        if (player == null) return;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    }
}
public class MainListener implements Listener {

}