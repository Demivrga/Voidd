package com.demonly.me.voidd.items;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class Items {
	
	public static ItemStack create() {
		ItemStack create = new ItemStack(Material.LAVA_BUCKET);
		ItemMeta createMeta = create.getItemMeta();

		createMeta.setDisplayName("§5§lVoidd§r §f§nCreate");

		create.setItemMeta(createMeta);
		return create;
	}
	
	public static ItemStack destroy() {
		ItemStack destroy = new ItemStack(Material.BARRIER);
		ItemMeta destroyMeta = destroy.getItemMeta();
		
		destroyMeta.setDisplayName("§4§lDelete §f§lVoidd");

		destroy.setItemMeta(destroyMeta);
		return destroy;
	}
	
	public static ItemStack teleport() {
		ItemStack teleport = new ItemStack(Material.END_CRYSTAL);
		ItemMeta teleportMeta = teleport.getItemMeta();

		teleportMeta.setDisplayName("§f§lTeleport to Voidd");

		teleport.setItemMeta(teleportMeta);
		return teleport;
	}
	
	public static ItemStack setStone() {
		ItemStack create = new ItemStack(Material.ENDER_STONE);
		ItemMeta createMeta = create.getItemMeta();

		createMeta.setDisplayName("Add Stone Platform");

		create.setItemMeta(createMeta);
		return create;
	}
	
	public static ItemStack setHead(String p) {
        ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
        SkullMeta skullmeta = (SkullMeta) skull.getItemMeta();
        skullmeta.setOwner(p);
        skullmeta.setDisplayName("Visit Voidds");
        skull.setItemMeta(skullmeta);
		return skull;
        
	}
	
	public static ItemStack setSettings() {
		ItemStack settings = new ItemStack(Material.REDSTONE_COMPARATOR);
		ItemMeta settingsmeta = settings.getItemMeta();
		settingsmeta.setDisplayName("§e§lSettings");
		settings.setItemMeta(settingsmeta);
		return settings;
		
	}
	
	public static ItemStack expandBorder() {
		ItemStack expand = new ItemStack(Material.THIN_GLASS);
		ItemMeta expandMeta = expand.getItemMeta();
		
		ArrayList<String> lore = new ArrayList<String>();
		
		lore.add("Sets border to 125 radius");
		lore.add("This will reset your WorldSpawn!");
		lore.add("This will also teleport you to 0, 5, 0!");
		
		expandMeta.setLore(lore);
		expandMeta.setDisplayName("Expand Border");
		expand.setItemMeta(expandMeta);
		return expand;
	}
	
	public static ItemStack lowerBorder() {
		ItemStack expand = new ItemStack(Material.THIN_GLASS);
		ItemMeta expandMeta = expand.getItemMeta();
		
		ArrayList<String> lore = new ArrayList<String>();
		
		lore.add("Sets border to 75 radius");
		lore.add("This will reset your WorldSpawn!");
		lore.add("This will also teleport you to 0, 5, 0!");
		
		expandMeta.setLore(lore);
		expandMeta.setDisplayName("Lower Border");
		expand.setItemMeta(expandMeta);
		return expand;
	}
	
	public static ItemStack setWorldSpawn() {
		ItemStack expand = new ItemStack(Material.GRASS);
		ItemMeta expandMeta = expand.getItemMeta();
		expandMeta.setDisplayName("Set World Spawn");
		expand.setItemMeta(expandMeta);
		return expand;
	}
	
}
