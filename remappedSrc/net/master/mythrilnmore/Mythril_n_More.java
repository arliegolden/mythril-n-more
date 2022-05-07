package net.master.mythrilnmore;

import net.fabricmc.api.ModInitializer;
import net.master.mythrilnmore.block.ModBlocks;
import net.master.mythrilnmore.item.ModItems;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.master.mythrilnmore.item.ModItems.NETHERITE_SHIELD;

public class Mythril_n_More implements ModInitializer {
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
