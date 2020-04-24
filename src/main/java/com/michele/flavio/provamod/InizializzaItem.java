package com.michele.flavio.provamod;

import com.michele.flavio.provamod.tabCreative.Gruppi;
import com.michele.flavio.provamod.tierOggetti.TierSpade;

import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ExampleMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(ExampleMod.MOD_ID)
public class InizializzaItem {

	//lingotti
	public static Item gum_ingot = null;
	
	//spade
	private static Item gum_sword = null;
	private static Item obscure_sword = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> evento) {
		Properties proprieta_gum_ingot = new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64).group(Gruppi.misc_group);
		gum_ingot = new Item(proprieta_gum_ingot).setRegistryName("gum_ingot");
		evento.getRegistry().register(gum_ingot);
		
		Properties proprieta_gum_sword = new Item.Properties().group(Gruppi.misc_group);
		gum_sword = new SwordItem(TierSpade.GUM, 2,-2.0f, proprieta_gum_sword).setRegistryName("gum_sword");//la f sta per float, che � meno preciso del double
		evento.getRegistry().register(gum_sword);
		
		Properties proprieta_obscure_sword = new Item.Properties().group(Gruppi.misc_group);
		obscure_sword = new SwordItem(TierSpade.OBSCURE, 6, -3.0F, proprieta_obscure_sword).setRegistryName("obscure_sword");
		evento.getRegistry().register(obscure_sword);
		
	}
}
