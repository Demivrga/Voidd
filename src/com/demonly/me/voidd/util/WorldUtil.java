package com.demonly.me.voidd.util;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.WorldType;
import org.bukkit.World.Environment;
import org.bukkit.entity.Player;
import org.bukkit.generator.ChunkGenerator;

import com.demonly.me.voidd.main;

public class WorldUtil {

	public static Runnable TeleportPlayer(final Player p) {
		Bukkit.getScheduler().scheduleSyncDelayedTask(main.pl(), new Runnable() {
			public void run() {

				World w = Bukkit.getWorld(p.getName());
				p.teleport(w.getSpawnLocation());

			}
		}, 10L);
		return null;
	}

	public static Runnable SetupWorld(final Player p) {
		Bukkit.getScheduler().scheduleSyncDelayedTask(main.pl(), new Runnable() {
			public void run() {

				World w = Bukkit.getWorld(p.getName());
				BorderUtil.setWorldBorder(p, 0, 0, 250, 0, 0);

				Location x = new Location(w, 0, 5, 0);
				x.getBlock().setType(Material.STONE);
				
				Bukkit.getWorld(p.getName()).setSpawnLocation(0, 5, 0);

			}
		}, 10L);
		return null;
	}

	public static Runnable LoadWorld(final Player p) {
		Bukkit.getScheduler().scheduleSyncDelayedTask(main.pl(), new Runnable() {
			public void run() {

				WorldCreator wc = new WorldCreator(p.getName());
				wc.generatorSettings("3;minecraft:air;2");
				wc.generator(WorldUtil.voidGenerator());
				wc.generateStructures(false);
				wc.type(WorldType.FLAT);
				wc.environment(Environment.NORMAL);
				wc.createWorld();

			}
		}, 5L);
		return null;
	}

	public static void DeleteWorld(Player p) {

		World w = Bukkit.getWorld(p.getName());

		for (Player wp : w.getPlayers()) {
			wp.teleport(Bukkit.getServer().getWorld("world").getSpawnLocation());
		}

		try {

			FileUtils.deleteDirectory(w.getWorldFolder());
			Bukkit.unloadWorld(p.getName(), false);
			main.pl().getConfig().set("worlds.created." + p.getName(), null);
			main.pl().saveConfig();
			p.closeInventory();

		} catch (IOException e) {
			MessageUtil.pmsg(p, "&4Error Deleting World!");
			MessageUtil.pmsg(p, "&4Please contact an Admin / Moderator");
		}
	}
	
	public static ChunkGenerator voidGenerator() {
		return new VoidGenerator();
	}

}
