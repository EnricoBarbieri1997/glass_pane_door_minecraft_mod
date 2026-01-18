package com.enricobarbieri.glasspanedoormod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

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

    private static Block register(String name, Function<BlockBehaviour.Properties, Block> blockFactory,
            BlockBehaviour.Properties settings, boolean shouldRegisterItem) {
        // Create a registry key for the block
        ResourceKey<Block> blockKey = keyOfBlock(name);
        // Create the block instance
        Block block = blockFactory.apply(settings.setId(blockKey));

        if (shouldRegisterItem) {
            ResourceKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block,
                    new Item.Properties().setId(itemKey).useBlockDescriptionPrefix());
            Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
        }

        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }

    private static ResourceKey<Block> keyOfBlock(String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(GlassPaneDoorMod.MOD_ID, name));
    }

    private static ResourceKey<Item> keyOfItem(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(GlassPaneDoorMod.MOD_ID, name));
    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.accept(ModBlocks.GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.accept(ModBlocks.BLACK_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.accept(ModBlocks.RED_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.accept(ModBlocks.WHITE_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.accept(ModBlocks.LIGHT_GRAY_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.accept(ModBlocks.GRAY_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.accept(ModBlocks.BROWN_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.accept(ModBlocks.ORANGE_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.accept(ModBlocks.YELLOW_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.accept(ModBlocks.LIME_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.accept(ModBlocks.GREEN_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.accept(ModBlocks.CYAN_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.accept(ModBlocks.LIGHT_BLUE_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.accept(ModBlocks.BLUE_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.accept(ModBlocks.PURPLE_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.accept(ModBlocks.MAGENTA_GLASS_PANE_DOOR.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register((itemGroup) -> {
            itemGroup.accept(ModBlocks.PINK_GLASS_PANE_DOOR.asItem());
        });
    }

    public static Block registerGlassPaneDoorBlock(String name) {
        return register(
                name,
                GlassPaneDoorBlock::new,
                BlockBehaviour.Properties
                        .of()
                        .strength(0.3F)
                        .noOcclusion() // non-occluding, like glass
                        .sound(SoundType.GLASS)
                        .isViewBlocking((s, l, p) -> false),
                true);
    }
}