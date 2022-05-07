package net.master.mythrilnmore.util;

import net.minecraft.tag.TagKey;
import net.master.mythrilnmore.Mythril_n_More;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTags {

    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(Mythril_n_More.MOD_ID, name));

        }
        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("C", name));
        }

    public static class Items {
        public static final TagKey<Item> MYTHRIL_INGOTS = createCommonTag("mythril_ingots");
        public static final TagKey<Item> MYTHRIL_NUGGETS = createCommonTag("mythril_nuggets");


        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(Mythril_n_More.MOD_ID, name));

        }
        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("C", name));
        }

    }

}
}
