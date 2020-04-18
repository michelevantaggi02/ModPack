package com.michele.flavio.provamod;

import com.michele.flavio.provamod.tabCreative.Gruppi;

import net.minecraft.block.Block;
import net.minecraft.block.Block.Properties;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(ExampleMod.MOD_ID)
@Mod.EventBusSubscriber(modid = ExampleMod.MOD_ID, bus = Bus.MOD)
public class InizializzaBlocchi {

	
	public static Block marine_grass_block = null;
	public static Block gum_ore = null;
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		Properties proprieta_marine_grass_block = Block.Properties.create(Material.EARTH).harvestTool(ToolType.SHOVEL).hardnessAndResistance(0.6f, 0.6f).sound(SoundType.PLANT);
		marine_grass_block = new Block(proprieta_marine_grass_block).setRegistryName("marine_grass_block");
		event.getRegistry().register(marine_grass_block);
		
		Properties proprieta_gum_ore = Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(0).hardnessAndResistance(1.5f, 3.0f).sound(SoundType.STONE);
		gum_ore = new Block(proprieta_gum_ore).setRegistryName("gum_ore");
		event.getRegistry().register(gum_ore);
		
	}
	
	private static Item item_marine_grass_block;
	private static Item item_gum_ore;
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		Item.Properties proprieta_item_marine_grass_block = new Item.Properties().maxStackSize(64).group(Gruppi.misc_group);
		item_marine_grass_block = new BlockItem(marine_grass_block, proprieta_item_marine_grass_block).setRegistryName("marine_grass_block");
		event.getRegistry().register(item_marine_grass_block);
		
		Item.Properties proprieta_item_gum_ore = new Item.Properties().maxStackSize(64).group(Gruppi.misc_group);
		item_gum_ore = new BlockItem(gum_ore, proprieta_item_gum_ore).setRegistryName("gum_ore");
		event.getRegistry().register(item_gum_ore);
	}
}
