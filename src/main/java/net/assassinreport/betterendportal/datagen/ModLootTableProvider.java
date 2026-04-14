package net.assassinreport.betterendportal.datagen;

import net.assassinreport.betterendportal.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> wrapper) {
        super(dataOutput, wrapper);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.VOID_MATTER);
    }
}