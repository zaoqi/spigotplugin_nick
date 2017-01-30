package zaoqi.nick;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnLogin implements Listener {

    public Main plugin;

    public OnLogin(Main instance) {
        plugin = instance;
    }

    @EventHandler
    public void onPlayerLogin(PlayerJoinEvent event) {
        Player p = event.getPlayer();
        plugin.newPlayer(p);
    }
}
