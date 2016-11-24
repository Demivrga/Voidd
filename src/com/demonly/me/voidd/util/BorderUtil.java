package com.demonly.me.voidd.util;

import org.bukkit.Bukkit;
import org.bukkit.WorldBorder;
import org.bukkit.entity.Player;


public class BorderUtil {
	
	
	public static void setWorldBorder
	(Player p, double centerX, double centerZ, int size, int damageAmount, int damageBuffer) {
		
		
		WorldBorder w = Bukkit.getWorld(p.getName()).getWorldBorder();
		w.setCenter(centerX, centerZ);
		w.setSize(size);
		w.setDamageAmount(damageAmount);
		w.setDamageBuffer(damageBuffer);
		
	}

	

}
