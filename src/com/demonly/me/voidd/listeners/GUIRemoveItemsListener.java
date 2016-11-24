package com.demonly.me.voidd.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;

public class GUIRemoveItemsListener implements Listener {

	@EventHandler
	public void InvClick(InventoryClickEvent ev) {

		if (ev.getInventory().getName().equals("Voidd | Create")) {
			ev.setCancelled(true);
		}

		if (ev.getInventory().getName().equals("Voidd | UserMenu")) {
			ev.setCancelled(true);
		}

		if (ev.getInventory().getName().equals("Voidd | Settings")) {
			ev.setCancelled(true);
		}

	}

	@EventHandler
	public void InvDrag(InventoryDragEvent ev) {

		if (ev.getInventory().getName().equals("Voidd | Create")) {
			ev.setCancelled(true);
		}

		if (ev.getInventory().getName().equals("Voidd | UserMenu")) {
			ev.setCancelled(true);
		}

		if (ev.getInventory().getName().equals("Voidd | Settings")) {
			ev.setCancelled(true);
		}

	}
}
