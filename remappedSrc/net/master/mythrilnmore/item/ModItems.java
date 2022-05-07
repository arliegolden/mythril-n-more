package net.master.mythrilnmore.item;

import com.github.crimsondawn45.fabricshieldlib.lib.object.FabricShieldItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.master.mythrilnmore.Mythril_n_More;
import net.master.mythrilnmore.item.custom.DowsingRodItem;
import net.master.mythrilnmore.item.custom.ModAxeItem;
import net.master.mythrilnmore.item.custom.ModHoeItem;
import net.master.mythrilnmore.item.custom.ModPickaxeItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class ModItems {
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));
    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));
    public static final Item RAW_MYTHRIL = registerItem("raw_mythril",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));


    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.MYTHRIL).maxDamage(16)));


    public static final Item MYTHRIL_SWORD = registerItem("mythril_sword",
            new SwordItem(ModToolMaterials.MYTHRIL, 3, -1,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL).fireproof()));
    public static final Item MYTHRIL_AXE = registerItem("mythril_axe",
            new ModAxeItem(ModToolMaterials.MYTHRIL, 5, -2,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL).fireproof()));
    public static final Item MYTHRIL_PICKAXE = registerItem("mythril_pickaxe",
            new ModPickaxeItem(ModToolMaterials.MYTHRIL, 1, 1.5f,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL).fireproof()));
    public static final Item MYTHRIL_SHOVEL = registerItem("mythril_shovel",
            new ShovelItem(ModToolMaterials.MYTHRIL, 1, 1.5f,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL).fireproof()));
    public static final Item MYTHRIL_HOE = registerItem("mythril_hoe",
            new ModHoeItem(ModToolMaterials.MYTHRIL, 0, 2.1f,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL).fireproof()));


    public static final Item MYTHRIL_HELMET = registerItem("mythril_helmet",
            new ArmorItem(ModArmorMaterials.MYTHRIL, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL).fireproof()));
    public static final Item MYTHRIL_CHESTPLATE = registerItem("mythril_chestplate",
            new ArmorItem(ModArmorMaterials.MYTHRIL, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL).fireproof()));
    public static final Item MYTHRIL_LEGGINGS = registerItem("mythril_leggings",
            new ArmorItem(ModArmorMaterials.MYTHRIL, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL).fireproof()));
    public static final Item MYTHRIL_BOOTS = registerItem("mythril_boots",
            new ArmorItem(ModArmorMaterials.MYTHRIL, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.MYTHRIL).fireproof()));


    public static final Item NETHERITE_SHIELD = new FabricShieldItem(
            new FabricItemSettings().maxDamage(2500).group(ItemGroup.COMBAT), 10, 24, Items.NETHERITE_INGOT);
    // FabricShieldItem(settings.maxDamage(durability), cooldownTicks, enchantability, repairItem)



    private static Item registerItem(String name, Item item, ItemGroup group, String tooltipKey) {
        return Registry.register(Registry.ITEM, new Identifier(Mythril_n_More.MOD_ID, name), new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)) {
                    @Override
                    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                        tooltip.add(new TranslatableText(tooltipKey));
                    }
                });
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Mythril_n_More.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Mythril_n_More.LOGGER.info("Registering Mod Items for " + Mythril_n_More.MOD_ID);
    }


}
