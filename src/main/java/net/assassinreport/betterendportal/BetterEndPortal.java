package net.assassinreport.betterendportal;

import net.assassinreport.betterendportal.block.ModBlocks;
import net.assassinreport.betterendportal.item.ModItemGroups;
import net.assassinreport.betterendportal.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterEndPortal implements ModInitializer {
	public static final String MOD_ID = "betterendportal";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
		ModItemGroups.registerItemsToVanillaGroups();

		CustomPortalBuilder.beginPortal()
				.frameBlock(ModBlocks.VOID_MATTER)
				.customPortalBlock(ModBlocks.NEW_END_PORTAL_BLOCK)
				.lightWithItem(Items.ENDER_EYE)
				.registerIgniteEvent((player, world, portalPos, framePos, ignitionSource) -> {
					world.playSound(null, portalPos, SoundEvents.BLOCK_END_PORTAL_SPAWN, SoundCategory.BLOCKS, 1.0F, 1.0F);
				})
				.destDimID(new Identifier("minecraft", "the_end"))
				.forcedSize(2,2)
				.flatPortal()
				.registerPortal();
	}
}