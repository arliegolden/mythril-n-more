package net.master.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.impl.discovery.ModResolver;
import net.master.tutorialmod.block.ModBlocks;
import net.master.tutorialmod.item.ModItemGroup;
import net.master.tutorialmod.item.ModItems;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.master.tutorialmod.item.ModItems.NETHERITE_SHIELD;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Registering all the items and blocks in indivdual waves
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		Registry.register(Registry.ITEM, new Identifier("tutorialmod", "netherite_shield"), NETHERITE_SHIELD);

	}
}

// TODO: ADD CRAFT RECIPE FOR DOWSING ROD
