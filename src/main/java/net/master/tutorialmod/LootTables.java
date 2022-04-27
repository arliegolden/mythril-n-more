package net.master.tutorialmod;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.master.tutorialmod.item.ModItems;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class LootTables {

    // Nether Fortress chests loot table.
    private static final Identifier END_CITY_TREASURE = new Identifier("minecraft", "chests/end_city_treasure");

    public static void init() {
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            if (END_CITY_TREASURE.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        // The minimum and maximum amount that can appear in one cell of the chest.
                        // (But this is not accurate, I have not figured it out myself yet).
                        .rolls(UniformLootNumberProvider.create(0.0f, 4.0f))
                        // Here I add Mythril Ingot and set its weight.
                        .withEntry(ItemEntry.builder(ModItems.MYTHRIL_INGOT).weight(30).build());
                supplier.withPool(poolBuilder.build());
            }
        }));


    }}