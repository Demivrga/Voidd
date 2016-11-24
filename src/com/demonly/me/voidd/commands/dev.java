package com.demonly.me.voidd.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class dev implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String lbl, String[] args) {

		Player p = (Player) cs;

		if (lbl.equalsIgnoreCase("devworlds")) {

			p.sendMessage("XYZ: " + Bukkit.getWorlds().toString());

		}

		if (lbl.equalsIgnoreCase("devtest")) {

			if (Bukkit.getWorlds().contains(p.getDisplayName())) {
				p.sendMessage("TEST: GOOD");
			} else {
				p.sendMessage("TEST: BAD");
			}

		}
		return false;

	}

}