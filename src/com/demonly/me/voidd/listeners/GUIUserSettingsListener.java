package com.demonly.me.voidd.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.demonly.me.voidd.main;
import com.demonly.me.voidd.items.Items;
import com.demonly.me.voidd.util.BorderUtil;
import com.demonly.me.voidd.util.MessageUtil;

public class GUIUserSettingsListener implements Listener {

	public main pl;

	public GUIUserSettingsListener(main instance) {
		pl = instance;
	}

	@EventHandler
	public void onAction(InventoryClickEvent ev) {

		Player p = (Player) ev.getWhoClicked();
		World w = Bukkit.getWorld(p.getName());

		boolean title = ev.getInventory().getTitle().equals("Voidd | Settings");

		// Checking the Inventory Title
		if (title == true) {
			
			
			// Preforming actions based on the item
			if (ev.getCurrentItem().equals(Items.setStone())) {

				w.getSpawnLocation().getBlock().setType(Material.ENDER_STONE);
				MessageUtil.pmsg(p, "Platform Set!");

			}

			if (ev.getCurrentItem().equals(Items.expandBorder())) {

				BorderUtil.setWorldBorder(p, 0, 0, 250, 0, 0);
				w.setSpawnLocation(0, 6, 0);

				for (Player s : w.getPlayers()) {
					s.teleport(w.getSpawnLocation());
					MessageUtil.pmsg(s, "The Worlds Owner has expanded their border!");
				}

				MessageUtil.pmsg(p, "World Border Expanded");
			}

			if (ev.getCurrentItem().equals(Items.lowerBorder())) {
				BorderUtil.setWorldBorder(p, 0, 0, 150, 0, 0);
				w.setSpawnLocation(0, 6, 0);

				for (Player s : w.getPlayers()) {
					s.teleport(w.getSpawnLocation());
					MessageUtil.pmsg(s, "The Worlds Owner has shrunk their border!");
				}

				MessageUtil.pmsg(p, "World Border Shrunk");
			}

			if (ev.getCurrentItem().equals(Items.setWorldSpawn())) {
				if (p.getWorld().equals(w)) {

					Location xyz = p.getLocation();
					int y = xyz.getBlockY() + 1;

					p.getWorld().setSpawnLocation(xyz.getBlockX(), y, xyz.getBlockZ());
					MessageUtil.pmsg(p, "World spawn set!");

				} else {
					MessageUtil.pmsg(p, "You can't set your world spawn here! Please move to your VOIDD world!");
				}
			}

		}

	}

}
