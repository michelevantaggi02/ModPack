package com.michele.flavio.provamod.world.gen;

import com.michele.flavio.provamod.InizializzaBlocchi;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class GeneraOre {
		
	public static void genera() {
		
		for(Biome bioma : ForgeRegistries.BIOMES) {
			CountRangeConfig dati_blocco = new CountRangeConfig(20, 20, 0, 128);
			ConfiguredPlacement<CountRangeConfig> configurazione = Placement.COUNT_RANGE.func_227446_a_(dati_blocco);
			OreFeatureConfig configurazione_ore = new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, InizializzaBlocchi.gum_ore.getDefaultState(), 13);
			bioma.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(configurazione_ore).func_227228_a_(configurazione));
		}
	}
}
