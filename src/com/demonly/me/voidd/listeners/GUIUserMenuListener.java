package com.demonly.me.voidd.listeners;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.demonly.me.voidd.main;
import com.demonly.me.voidd.gui.GUIUserSettings;
import com.demonly.me.voidd.items.Items;
import com.demonly.me.voidd.util.MessageUtil;
import com.demonly.me.voidd.util.WorldUtil;

public class GUIUserMenuListener implements Listener {

	public main pl;

	public GUIUserMenuListener(main instance) {
		pl = instance;
	}

	@EventHandler
	public void onAction(InventoryClickEvent ev) {

		Player p = (Player) ev.getWhoClicked();
		World w = Bukkit.getWorld(p.getName());

		boolean title = ev.getInventory().getTitle().equals("Voidd | UserMenu");

		// Teleport to the World
		if (title == true) {
			if (ev.getCurrentItem().equals(Items.teleport())) {

				WorldUtil.LoadWorld(p);
				WorldUtil.TeleportPlayer(p);
				MessageUtil.pmsg(p, "Welcome to your Void World!");

			}

			// Delete World
			if (ev.getCurrentItem().equals(Items.destroy())) {

				if (Bukkit.getWorlds().contains(w)) {

					WorldUtil.DeleteWorld(p);
					MessageUtil.pmsg(p, "&4World Deleted and Unloaded");

				} else {
					MessageUtil.pmsg(p, "Did you just delete nothing?");
				}
			}

			// Settings
			if (ev.getCurrentItem().equals(Items.setSettings())) {
				p.openInventory(GUIUserSettings.UserSettings());
			}

		}
	}

}
