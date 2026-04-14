package net.assassinreport.betterendportal;

import net.assassinreport.betterendportal.block.entity.ModBlockEntities;
import net.assassinreport.betterendportal.block.entity.renderer.NewEndPortalBlockEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class BetterEndPortalClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockEntityRendererFactories.register(ModBlockEntities.NEW_END_PORTAL_BLOCK_ENTITY, NewEndPortalBlockEntityRenderer::new);
    }
}