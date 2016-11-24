package com.demonly.me.voidd.util;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class MessageUtil {
	
	  public static void msg(Player p, String message)
	  {
	    p.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
	  }
	  
	  public static void pmsg(Player p, String message)
	  {
	    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&5&lVOIDD &8|&e " + message));
	  }
	}
