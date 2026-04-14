package net.assassinreport.betterendportal.block.entity;

import net.assassinreport.betterendportal.BetterEndPortal;
import net.assassinreport.betterendportal.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {

    public static final BlockEntityType<NewEndPortalBlockEntity> NEW_END_PORTAL_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(BetterEndPortal.MOD_ID, "new_end_portal_block_entity"),
                    FabricBlockEntityTypeBuilder.create(NewEndPortalBlockEntity::new,
                            ModBlocks.NEW_END_PORTAL_BLOCK).build());

    public static void registerBlockEntities() {
        BetterEndPortal.LOGGER.info("Registering Block Entities for " + BetterEndPortal.MOD_ID);
    }
}