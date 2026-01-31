package com.enricobarbieri.glasspanedoormod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

import com.enricobarbieri.glasspanedoormod.block.GlassPaneDoorBlock;

public class ModBlocks {
    public static final Block GLASS_PANE_DOOR = registerGlassPaneDoorBlock("glass_pane_door");
    public static final Block BLACK_GLASS_PANE_DOOR = registerGlassPaneDoorBlock("black_glass_pane_door");
    public static final Block RED_GLASS_PANE_DOOR = registerGlassPaneDoorBlock("red_glass_pane_door");
    public static final Block WHITE_GLASS_PANE_DOOR = registerGlassPaneDoorBlock("white_glass_pane_door");
    public static final Block LIGHT_GRAY_GLASS_PANE_DOOR = registerGlassPaneDoorBlock("light_gray_glass_pane_door");
    public static final Block GRAY_GLASS_PANE_DOOR = registerGlassPaneDoorBlock("gray_glass_pane_door");
    public static final Block BROWN_GLASS_PANE_DOOR = registerGlassPaneDoorBlock("brown_glass_pane_door");
    public static final Block ORANGE_GLASS_PANE_DOOR = registerGlassPaneDoorBlock("orange_glass_pane_door");
    public static final Block YELLOW_GLASS_PANE_DOOR = registerGlassPaneDoorBlock("yellow_glass_pane_door");
    public static final Block LIME_GLASS_PANE_DOOR = registerGlassPaneDoorBlock("lime_glass_pane_door");
    public static final Block GREEN_GLASS_PANE_DOOR = registerGlassPaneDoorBlock("green_glass_pane_door");
    public static final Block CYAN_GLASS_PANE_DOOR = registerGlassPaneDoorBlock("cyan_glass_pane_door");
    public static final Block LIGHT_BLUE_GLASS_PANE_DOOR = registerGlassPaneDoorBlock("light_blue_glass_pane_door");
    public static final Block BLUE_GLASS_PANE_DOOR = registerGlassPaneDoorBlock("blue_glass_pane_door");
    public static final Block PURPLE_GLASS_PANE_DOOR = registerGlassPaneDoorBlock("purple_glass_pane_door");
    public static final Block MAGENTA_GLASS_PANE_DOOR = registerGlassPaneDoorBlock("magenta_glass_pane_door");
    public static final Block PINK_GLASS_PANE_DOOR = registerGlassPaneDoorBlock("pink_glass_pane_door");

    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory,
            AbstractBlock.Settings settings, boolean shouldRegisterItem) {
        Identifier id = new Identifier(GlassPaneDoorMod.MOD_ID, name);
        // Create the block instance
        Block block = blockFactory.apply(settings);

        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block,
                    new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.BLACK_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.RED_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.WHITE_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.LIGHT_GRAY_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.GRAY_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.BROWN_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.ORANGE_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.YELLOW_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.LIME_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.GREEN_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.CYAN_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.LIGHT_BLUE_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.BLUE_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.PURPLE_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.MAGENTA_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.add(ModBlocks.PINK_GLASS_PANE_DOOR.asItem());
        });
    }

    public static Block registerGlassPaneDoorBlock(String name) {
        return register(
                name,
                GlassPaneDoorBlock::new,
                AbstractBlock.Settings.copy(Blocks.OAK_WOOD)
                        .strength(0.3F)
                        .nonOpaque() // non-occluding, like glass
                        .sounds(BlockSoundGroup.GLASS),
                true);
    }
}