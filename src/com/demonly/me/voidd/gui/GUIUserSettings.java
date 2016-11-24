package com.demonly.me.voidd.gui;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

import com.demonly.me.voidd.items.Items;

public class GUIUserSettings {
	
	public static Inventory UserSettings() {
		
		Inventory settings = Bukkit.createInventory(null, 27, "Voidd | Settings");
		

		settings.setItem(0, Items.setStone());
		settings.setItem(1, Items.expandBorder());
		settings.setItem(2, Items.lowerBorder());
		settings.setItem(3, Items.setWorldSpawn());
		
		
		return settings;
		
	}

}
