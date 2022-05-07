package net.master.mythrilnmore.util;

import net.fabricmc.fabric.api.tag.TagFactory;
import net.master.mythrilnmore.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks {

        private static Tag.Identified<Block> createTag(String name) {
            return TagFactory.BLOCK.create(new Identifier(TutorialMod.MOD_ID, name));

        }
        private static Tag.Identified<Block> createCommonTag(String name) {
            return TagFactory.BLOCK.create(new Identifier("C", name));
        }

    public static class Items {
        public static final Tag.Identified<Item> MYTHRIL_INGOTS = createCommonTag("mythril_ingots");
        public static final Tag.Identified<Item> MYTHRIL_NUGGETS = createCommonTag("mythril_nuggets");


        private static Tag.Identified<Item> createTag(String name) {
            return TagFactory.ITEM.create(new Identifier(TutorialMod.MOD_ID, name));

        }
        private static Tag.Identified<Item> createCommonTag(String name) {
            return TagFactory.ITEM.create(new Identifier("C", name));
        }

    }

}
}
