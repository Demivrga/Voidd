package com.demonly.me.voidd.gui;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

import com.demonly.me.voidd.items.Items;

public class GUICreate {
	
	public static Inventory VoiddMain() {
		
		Inventory voidd = Bukkit.createInventory(null, 27, "Voidd | Create");
		
		voidd.setItem(13, Items.create());
		
		return voidd;
		
	}
	
	

}
