package com.demonly.me.voidd.listeners;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class UnloadListener implements Listener {

	@EventHandler
	public void onLeave(PlayerQuitEvent ev) {

		Player p = ev.getPlayer();
		World w = Bukkit.getWorld(p.getName());

		p.teleport(Bukkit.getServer().getWorld("world").getSpawnLocation());

		if (Bukkit.getWorlds().contains(w)) {

			for (Player wp : w.getPlayers()) {
				wp.teleport(Bukkit.getServer().getWorld("world").getSpawnLocation());
			}

			Bukkit.unloadWorld(p.getName(), true);
			Bukkit.broadcastMessage(p.getName() + ": UNLOADED");

		}

	}

}
