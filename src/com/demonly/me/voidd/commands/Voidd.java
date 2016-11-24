package com.demonly.me.voidd.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.demonly.me.voidd.main;
import com.demonly.me.voidd.gui.GUICreate;
import com.demonly.me.voidd.gui.GUIUserMenu;
import com.demonly.me.voidd.items.Items;

public class Voidd implements CommandExecutor {

	public main pl;

	public Voidd(main instance) {
		pl = instance;
	}

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String lbl, String[] args) {

		Player p = (Player) cs;
		String m = pl.getConfig().getString("worlds.created." + p.getName());

		if (lbl.equalsIgnoreCase("voidd")) {

			if (m != null) {

				p.openInventory(GUIUserMenu.UserMain());
				p.getOpenInventory().setItem(15, Items.setHead(p.getName()));

			} else {

				p.openInventory(GUICreate.VoiddMain());
				p.getOpenInventory().setItem(15, Items.setHead(p.getName()));

			}

		}
		return false;

	}

}
