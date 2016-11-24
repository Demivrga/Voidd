package com.demonly.me.voidd.listeners;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.demonly.me.voidd.main;
import com.demonly.me.voidd.items.Items;
import com.demonly.me.voidd.util.MessageUtil;
import com.demonly.me.voidd.util.WorldUtil;

public class GUICreateListener implements Listener {

	public main pl;

	public GUICreateListener(main instance) {
		pl = instance;
	}

	@EventHandler
	public void onAction(InventoryClickEvent ev) {

		Player p = (Player) ev.getWhoClicked();
		World w = Bukkit.getWorld(p.getName());
		Boolean title = ev.getInventory().getTitle().equals("Voidd | Create");

		// Create the World
		if (title == true) {
			if (ev.getCurrentItem().equals(Items.create())) {

				if (!Bukkit.getWorlds().contains(w)) {

					MessageUtil.pmsg(p, "Void world created!");
					WorldUtil.LoadWorld(p);
					WorldUtil.SetupWorld(p);
					WorldUtil.TeleportPlayer(p);
					pl.getConfig().set("worlds.created." + p.getName(), "created");
					pl.saveConfig();
					p.closeInventory();

				} else {
					MessageUtil.pmsg(p, "&4You already have a Void world!");
				}
			}
		}

	}

}