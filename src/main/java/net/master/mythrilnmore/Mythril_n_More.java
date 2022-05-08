package net.master.mythrilnmore;

import net.fabricmc.api.ModInitializer;
import net.master.mythrilnmore.block.ModBlocks;
import net.master.mythrilnmore.item.ModItems;

import net.master.mythrilnmore.sound.Sounds;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.master.mythrilnmore.item.ModItems.NETHERITE_SHIELD;
import static net.master.mythrilnmore.sound.Sounds.registerSoundEvent;


public class Mythril_n_More implements ModInitializer {

	public static final String MOD_ID = "mythrilnmore";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Registering all the items and blocks in indivdual waves
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		Registry.register(Registry.ITEM, new Identifier("mythrilnmore", "netherite_shield"), NETHERITE_SHIELD);
		LootTables.init();
		SoundEvent PROPELL_ENERGY = registerSoundEvent("propell_energy");




	}
}


// TODO: ADD CRAFT RECIPE FOR DOWSING ROD
