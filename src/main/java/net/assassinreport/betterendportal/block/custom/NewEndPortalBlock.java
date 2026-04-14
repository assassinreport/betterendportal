package net.assassinreport.betterendportal.block.custom;

import net.assassinreport.betterendportal.block.entity.NewEndPortalBlockEntity;
import net.kyrptonaught.customportalapi.CustomPortalBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class NewEndPortalBlock extends CustomPortalBlock implements BlockEntityProvider {
    public NewEndPortalBlock() {
        super(AbstractBlock.Settings.copy(Blocks.END_PORTAL));
    }
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new NewEndPortalBlockEntity(pos, state);
    }
    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        // do nothing, or add end portal particles here
    }

}