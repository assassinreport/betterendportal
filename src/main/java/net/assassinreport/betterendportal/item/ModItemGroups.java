package net.assassinreport.betterendportal.item;

import net.assassinreport.betterendportal.BetterEndPortal;
import net.assassinreport.betterendportal.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class ModItemGroups {
    public static void registerItemsToVanillaGroups() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(ModBlocks.VOID_MATTER);
        });
    }


    public static void registerItemGroups() {
        BetterEndPortal.LOGGER.info("Registering Item Groups for " + BetterEndPortal.MOD_ID);
    }
}