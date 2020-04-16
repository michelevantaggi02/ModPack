package com.michele.flavio.provamod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ExampleMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(ExampleMod.MOD_ID)
public class InizializzaItem {

	public static Item oggetto = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> evento) {
		oggetto = new Item(new Item.Properties().group(ItemGroup.MATERIALS)).setRegistryName("oggetto");
		evento.getRegistry().register(oggetto);
	}
}
