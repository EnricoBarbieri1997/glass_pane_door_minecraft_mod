package com.enricobarbieri.glasspanedoormod.block;

import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockSetType;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;

public class GlassPaneDoorBlock extends DoorBlock {
    public static final EnumProperty<Direction> FACING = Properties.HORIZONTAL_FACING;
    public static final BooleanProperty OPEN = Properties.OPEN;

    // Thickness: 2 pixels (2/16 = 0.125)
    private static final double T = 0.125D;

    // --- CLOSED SHAPES (centered slab) ---
    private static final VoxelShape CLOSED_NS = VoxelShapes.cuboid(
            0.0D, 0.0D, 0.5D - (T / 2.0D),
            1.0D, 1.0D, 0.5D + (T / 2.0D));

    private static final VoxelShape CLOSED_EW = VoxelShapes.cuboid(
            0.5D - (T / 2.0D), 0.0D, 0.0D,
            0.5D + (T / 2.0D), 1.0D, 1.0D);

    // --- OPEN SHAPES (two side columns, hollow middle) ---
    private static final VoxelShape OPEN_NS = VoxelShapes.union(
            VoxelShapes.cuboid(
                    0.0D, 0.0D, 0.5D - (T / 2.0D),
                    0 + (T / 4.0D), 1.0D, 0.5D + (T / 2.0D)),
            VoxelShapes.cuboid(
                    1.0 - (T / 4.0D), 0.0D, 0.5D - (T / 2.0D),
                    1.0D, 1.0D, 0.5D + (T / 2.0D)));
    private static final VoxelShape OPEN_EW = VoxelShapes.union(
            VoxelShapes.cuboid(
                    0.0D, 0.0D, 0.0D,
                    1.0D, 1.0D, (T / 4.0D)),
            VoxelShapes.cuboid(
                    0.0D, 0.0D, 1.0D - (T / 4.0D),
                    1.0D, 1.0D, 1.0D));

    public GlassPaneDoorBlock(AbstractBlock.Settings properties) {
        super(
                properties,
                BlockSetType.OAK);
    }

    private boolean isAxisZ(BlockState state) {
        Direction facing = state.get(FACING);
        return (facing == Direction.NORTH || facing == Direction.SOUTH);
    }

    private VoxelShape getShapeOpen(BlockState state, BlockView level, BlockPos pos, ShapeContext ctx) {

        if (!isAxisZ(state)) {
            return OPEN_EW;
        } else {
            return OPEN_NS;
        }
    }

    private VoxelShape getShapeClosed(BlockState state, BlockView level, BlockPos pos, ShapeContext ctx) {

        if (!isAxisZ(state)) {
            return CLOSED_EW;
        } else {
            return CLOSED_NS;
        }
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView level, BlockPos pos, ShapeContext ctx) {
        boolean open = state.get(OPEN);

        if (!open) {
            return getShapeClosed(state, level, pos, ctx);
        } else {
            return getShapeOpen(state, level, pos, ctx);
        }
    }

    @Override
    public VoxelShape getSidesShape(BlockState state, BlockView level, BlockPos pos) {
        return VoxelShapes.fullCube(); // full cube -> sideSolidFullSquare == true on all sides
    }
}
