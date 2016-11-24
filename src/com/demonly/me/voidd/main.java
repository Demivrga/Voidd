package com.demonly.me.voidd;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.demonly.me.voidd.commands.dev;
import com.demonly.me.voidd.commands.Voidd;
import com.demonly.me.voidd.listeners.GUICreateListener;
import com.demonly.me.voidd.listeners.GUIRemoveItemsListener;
import com.demonly.me.voidd.listeners.UnloadListener;
import com.demonly.me.voidd.listeners.GUIUserMenuListener;
import com.demonly.me.voidd.listeners.GUIUserSettingsListener;

public class main extends JavaPlugin {

	private static main pl;
	public FileConfiguration config = getConfig();
	PluginManager pm;

	public void onEnable() {

		pm = Bukkit.getPluginManager();
		FileConfiguration config = getConfig();
		config.options().copyDefaults(true);
		saveConfig();

		pm.registerEvents(new GUIRemoveItemsListener(), this);
		pm.registerEvents(new GUICreateListener(this), this);
		pm.registerEvents(new GUIUserMenuListener(this), this);
		pm.registerEvents(new GUIUserSettingsListener(this), this);
		pm.registerEvents(new UnloadListener(), this);
		this.getCommand("voidd").setExecutor(new Voidd(this));
		this.getCommand("devtest").setExecutor(new dev());
		this.getCommand("devworlds").setExecutor(new dev());

	}

	public void onDisable() {
	}

	public main() {
		pl = this;
	}

	public static main pl() {
		return pl;
	}

}
