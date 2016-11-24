package com.demonly.me.voidd.gui;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

import com.demonly.me.voidd.items.Items;

public class GUIUserMenu {
	
	public static Inventory UserMain() {
		
		Inventory voidd = Bukkit.createInventory(null, 27, "Voidd | UserMenu");
		
		voidd.setItem(11, Items.setSettings());
		voidd.setItem(13, Items.teleport());
		voidd.setItem(26, Items.destroy());
		
		return voidd;
		
	}


}
