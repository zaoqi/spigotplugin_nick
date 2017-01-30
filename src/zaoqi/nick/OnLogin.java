//Nick
//Copyright (C) 2017  zaoqi

//This program is free software: you can redistribute it and/or modify
//it under the terms of the GNU Affero General Public License as published
//by the Free Software Foundation, either version 3 of the License, or
//(at your option) any later version.

//This program is distributed in the hope that it will be useful,
//but WITHOUT ANY WARRANTY; without even the implied warranty of
//MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//GNU Affero General Public License for more details.

//You should have received a copy of the GNU Affero General Public License
//along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
