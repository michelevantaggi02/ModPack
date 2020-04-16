package com.michele.flavio.provamod.tabCreative;

import com.michele.flavio.provamod.InizializzaBlocchi;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Misc extends ItemGroup {

	
	public Misc(int index, String label) {
		super(index, label);
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(InizializzaBlocchi.marine_grass_block);
	}

}
