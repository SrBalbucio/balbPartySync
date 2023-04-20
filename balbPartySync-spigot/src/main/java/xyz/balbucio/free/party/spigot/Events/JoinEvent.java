package xyz.balbucio.free.party.spigot.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import xyz.balbucio.free.party.spigot.Files.FileManager;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoinEvent(PlayerJpackage xyz.balbucio.free.party.spigot.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import xyz.balbucio.free.party.spigot.Files.FileManager;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoinEvent(PlayerJoinEvent evt){
        Player player = evt.getPlayer();
        if(FileManager.returnConfig().getBoolean("onjoin")){

        }
    }
}
