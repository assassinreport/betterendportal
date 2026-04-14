package net.assassinreport.betterendportal.block;

import net.assassinreport.betterendportal.BetterEndPortal;
import net.assassinreport.betterendportal.block.custom.NewEndPortalBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final NewEndPortalBlock NEW_END_PORTAL_BLOCK = (NewEndPortalBlock) registerBlock("new_end_portal_block",
            new NewEndPortalBlock());

    public static final Block VOID_MATTER = registerBlock("void_matter",
            new Block(Block.Settings.copy(Blocks.OBSIDIAN)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BetterEndPortal.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BetterEndPortal.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        BetterEndPortal.LOGGER.info("Registering ModBlocks for " + BetterEndPortal.MOD_ID);
    }
}