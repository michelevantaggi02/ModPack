package com.michele.flavio.provamod;

import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ExampleMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(ExampleMod.MOD_ID)
public class InizializzaItem {

	private static Item gum_ingot = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> evento) {
		Properties proprieta_gum_ingot = new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64);
		gum_ingot = new Item(proprieta_gum_ingot).setRegistryName("gum_ingot");
		evento.getRegistry().register(gum_ingot);
	}
}
