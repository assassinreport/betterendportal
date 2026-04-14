package net.assassinreport.betterendportal.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

public class NewEndPortalBlockEntity extends BlockEntity {
    protected NewEndPortalBlockEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }

    public NewEndPortalBlockEntity(BlockPos pos, BlockState state) {
        this(ModBlockEntities.NEW_END_PORTAL_BLOCK_ENTITY, pos, state);
    }

    public boolean shouldDrawSide(Direction direction) {
        return direction.getAxis() == Direction.Axis.Y;
    }
}