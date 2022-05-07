package net.master.mythrilnmore;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.loader.impl.discovery.ModResolver;
import net.master.mythrilnmore.block.ModBlocks;
import net.master.mythrilnmore.item.ModItemGroup;
import net.master.mythrilnmore.item.ModItems;
import net.minecraft.block.Blocks;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

import static net.master.mythrilnmore.item.ModItems.NETHERITE_SHIELD;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Registering all the items and blocks in indivdual waves
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "netherite_shield"), NETHERITE_SHIELD);
		LootTables.init();




	}
}


// TODO: ADD CRAFT RECIPE FOR DOWSING ROD