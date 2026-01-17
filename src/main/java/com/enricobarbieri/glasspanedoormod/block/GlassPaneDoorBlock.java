package com.enricobarbieri.glasspanedoormod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;

public class GlassPaneDoorBlock extends DoorBlock {
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty OPEN = BlockStateProperties.OPEN;

    // Thickness: 2 pixels (2/16 = 0.125)
    private static final double T = 0.125D;

    // --- CLOSED SHAPES (centered slab) ---
    private static final VoxelShape CLOSED_NS = Shapes.box(
            0.0D, 0.0D, 0.5D - (T / 2.0D),
            1.0D, 1.0D, 0.5D + (T / 2.0D));

    private static final VoxelShape CLOSED_EW = Shapes.box(
            0.5D - (T / 2.0D), 0.0D, 0.0D,
            0.5D + (T / 2.0D), 1.0D, 1.0D);

    // --- OPEN SHAPES (two side columns, hollow middle) ---
    private static final VoxelShape OPEN_NS = Shapes.or(
            Shapes.box(
                    0.0D, 0.0D, 0.5D - (T / 2.0D),
                    0 + (T / 4.0D), 1.0D, 0.5D + (T / 2.0D)),
            Shapes.box(
                    1.0 - (T / 4.0D), 0.0D, 0.5D - (T / 2.0D),
                    1.0D, 1.0D, 0.5D + (T / 2.0D)));
    private static final VoxelShape OPEN_EW = Shapes.or(
            Shapes.box(
                    0.0D, 0.0D, 0.0D,
                    1.0D, 1.0D, (T / 4.0D)),
            Shapes.box(
                    0.0D, 0.0D, 1.0D - (T / 4.0D),
                    1.0D, 1.0D, 1.0D));

    public GlassPaneDoorBlock(ResourceKey<Block> id) {
        super(
                BlockSetType.OAK,
                BlockBehaviour.Properties
                        .of()
                        .setId(id)
                        .strength(0.3F)
                        .noOcclusion() // non-occluding, like glass
                        .sound(SoundType.GLASS)
                        .isViewBlocking((s, l, p) -> false));
    }

    private boolean isAxisZ(BlockState state) {
        Direction facing = state.getValue(FACING);
        return (facing == Direction.NORTH || facing == Direction.SOUTH);
    }

    private VoxelShape getShapeOpen(BlockState state, BlockGetter level, BlockPos pos,
            CollisionContext ctx) {

        if (!isAxisZ(state)) {
            return OPEN_EW;
        } else {
            return OPEN_NS;
        }
    }

    private VoxelShape getShapeClosed(BlockState state, BlockGetter level, BlockPos pos,
            CollisionContext ctx) {

        if (!isAxisZ(state)) {
            return CLOSED_EW;
        } else {
            return CLOSED_NS;
        }
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos,
            CollisionContext ctx) {

        return getShapeClosed(state, level, pos, ctx);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level,
            BlockPos pos, CollisionContext ctx) {
        boolean open = state.getValue(OPEN);

        if (!open) {
            return getShapeClosed(state, level, pos, ctx);
        } else {
            return getShapeOpen(state, level, pos, ctx);
        }
    }

    @Override
    public VoxelShape getBlockSupportShape(BlockState state, BlockGetter level, BlockPos pos) {
        return Shapes.block(); // full cube -> sideSolidFullSquare == true on all sides
    }

    // Let light use the thin shape (so it behaves more like glass).
    @Override
    public boolean useShapeForLightOcclusion(BlockState state) {
        return false;
    }
}
