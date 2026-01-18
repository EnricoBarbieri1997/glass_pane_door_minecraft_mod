package com.enricobarbieri.glasspanedoormod;

import com.enricobarbieri.glasspanedoormod.block.GlassPaneDoorBlock;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(GlassPaneDoorMod.MODID)
public class GlassPaneDoorMod {
        // Define mod id in a common place for everything to reference
        public static final String MODID = "glasspanedoormod";
        // Directly reference a slf4j logger
        private static final Logger LOGGER = LogUtils.getLogger();
        // Create a Deferred Register to hold Blocks which will all be registered under
        // the "glasspanedoormod" namespace
        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
        // Create a Deferred Register to hold Items which will all be registered under
        // the "glasspanedoormod" namespace
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

        public static final RegistryObject<Block> GLASS_PANE_DOOR = BLOCKS.register("glass_pane_door",
                        () -> new GlassPaneDoorBlock(BLOCKS.key("glass_pane_door")));
        public static final RegistryObject<Item> GLASS_PANE_DOOR_ITEM = ITEMS.register("glass_pane_door",
                        () -> new BlockItem(GLASS_PANE_DOOR.get(),
                                        new Item.Properties().setId(ITEMS.key("glass_pane_door"))));

        public static final RegistryObject<Block> BLACK_GLASS_PANE_DOOR = BLOCKS.register("black_glass_pane_door",
                        () -> new GlassPaneDoorBlock(BLOCKS.key("black_glass_pane_door")));
        public static final RegistryObject<Item> BLACK_GLASS_PANE_DOOR_ITEM = ITEMS.register("black_glass_pane_door",
                        () -> new BlockItem(BLACK_GLASS_PANE_DOOR.get(),
                                        new Item.Properties().setId(ITEMS.key("black_glass_pane_door"))));

        public static final RegistryObject<Block> RED_GLASS_PANE_DOOR = BLOCKS.register("red_glass_pane_door",
                        () -> new GlassPaneDoorBlock(BLOCKS.key("red_glass_pane_door")));
        public static final RegistryObject<Item> RED_GLASS_PANE_DOOR_ITEM = ITEMS.register("red_glass_pane_door",
                        () -> new BlockItem(RED_GLASS_PANE_DOOR.get(),
                                        new Item.Properties().setId(ITEMS.key("red_glass_pane_door"))));

        public static final RegistryObject<Block> WHITE_GLASS_PANE_DOOR = BLOCKS.register("white_glass_pane_door",
                        () -> new GlassPaneDoorBlock(BLOCKS.key("white_glass_pane_door")));
        public static final RegistryObject<Item> WHITE_GLASS_PANE_DOOR_ITEM = ITEMS.register("white_glass_pane_door",
                        () -> new BlockItem(WHITE_GLASS_PANE_DOOR.get(),
                                        new Item.Properties().setId(ITEMS.key("white_glass_pane_door"))));

        public static final RegistryObject<Block> LIGHT_GRAY_GLASS_PANE_DOOR = BLOCKS.register(
                        "light_gray_glass_pane_door",
                        () -> new GlassPaneDoorBlock(BLOCKS.key("light_gray_glass_pane_door")));
        public static final RegistryObject<Item> LIGHT_GRAY_GLASS_PANE_DOOR_ITEM = ITEMS.register(
                        "light_gray_glass_pane_door",
                        () -> new BlockItem(LIGHT_GRAY_GLASS_PANE_DOOR.get(),
                                        new Item.Properties().setId(ITEMS.key("light_gray_glass_pane_door"))));

        public static final RegistryObject<Block> GRAY_GLASS_PANE_DOOR = BLOCKS.register("gray_glass_pane_door",
                        () -> new GlassPaneDoorBlock(BLOCKS.key("gray_glass_pane_door")));
        public static final RegistryObject<Item> GRAY_GLASS_PANE_DOOR_ITEM = ITEMS.register("gray_glass_pane_door",
                        () -> new BlockItem(GRAY_GLASS_PANE_DOOR.get(),
                                        new Item.Properties().setId(ITEMS.key("gray_glass_pane_door"))));

        public static final RegistryObject<Block> BROWN_GLASS_PANE_DOOR = BLOCKS.register("brown_glass_pane_door",
                        () -> new GlassPaneDoorBlock(BLOCKS.key("brown_glass_pane_door")));
        public static final RegistryObject<Item> BROWN_GLASS_PANE_DOOR_ITEM = ITEMS.register("brown_glass_pane_door",
                        () -> new BlockItem(BROWN_GLASS_PANE_DOOR.get(),
                                        new Item.Properties().setId(ITEMS.key("brown_glass_pane_door"))));

        public static final RegistryObject<Block> ORANGE_GLASS_PANE_DOOR = BLOCKS.register("orange_glass_pane_door",
                        () -> new GlassPaneDoorBlock(BLOCKS.key("orange_glass_pane_door")));
        public static final RegistryObject<Item> ORANGE_GLASS_PANE_DOOR_ITEM = ITEMS.register("orange_glass_pane_door",
                        () -> new BlockItem(ORANGE_GLASS_PANE_DOOR.get(),
                                        new Item.Properties().setId(ITEMS.key("orange_glass_pane_door"))));

        public static final RegistryObject<Block> YELLOW_GLASS_PANE_DOOR = BLOCKS.register("yellow_glass_pane_door",
                        () -> new GlassPaneDoorBlock(BLOCKS.key("yellow_glass_pane_door")));
        public static final RegistryObject<Item> YELLOW_GLASS_PANE_DOOR_ITEM = ITEMS.register("yellow_glass_pane_door",
                        () -> new BlockItem(YELLOW_GLASS_PANE_DOOR.get(),
                                        new Item.Properties().setId(ITEMS.key("yellow_glass_pane_door"))));

        public static final RegistryObject<Block> LIME_GLASS_PANE_DOOR = BLOCKS.register("lime_glass_pane_door",
                        () -> new GlassPaneDoorBlock(BLOCKS.key("lime_glass_pane_door")));
        public static final RegistryObject<Item> LIME_GLASS_PANE_DOOR_ITEM = ITEMS.register("lime_glass_pane_door",
                        () -> new BlockItem(LIME_GLASS_PANE_DOOR.get(),
                                        new Item.Properties().setId(ITEMS.key("lime_glass_pane_door"))));

        public static final RegistryObject<Block> GREEN_GLASS_PANE_DOOR = BLOCKS.register("green_glass_pane_door",
                        () -> new GlassPaneDoorBlock(BLOCKS.key("green_glass_pane_door")));
        public static final RegistryObject<Item> GREEN_GLASS_PANE_DOOR_ITEM = ITEMS.register("green_glass_pane_door",
                        () -> new BlockItem(GREEN_GLASS_PANE_DOOR.get(),
                                        new Item.Properties().setId(ITEMS.key("green_glass_pane_door"))));

        public static final RegistryObject<Block> CYAN_GLASS_PANE_DOOR = BLOCKS.register("cyan_glass_pane_door",
                        () -> new GlassPaneDoorBlock(BLOCKS.key("cyan_glass_pane_door")));
        public static final RegistryObject<Item> CYAN_GLASS_PANE_DOOR_ITEM = ITEMS.register("cyan_glass_pane_door",
                        () -> new BlockItem(CYAN_GLASS_PANE_DOOR.get(),
                                        new Item.Properties().setId(ITEMS.key("cyan_glass_pane_door"))));

        public static final RegistryObject<Block> LIGHT_BLUE_GLASS_PANE_DOOR = BLOCKS.register(
                        "light_blue_glass_pane_door",
                        () -> new GlassPaneDoorBlock(BLOCKS.key("light_blue_glass_pane_door")));
        public static final RegistryObject<Item> LIGHT_BLUE_GLASS_PANE_DOOR_ITEM = ITEMS.register(
                        "light_blue_glass_pane_door",
                        () -> new BlockItem(LIGHT_BLUE_GLASS_PANE_DOOR.get(),
                                        new Item.Properties().setId(ITEMS.key("light_blue_glass_pane_door"))));

        public static final RegistryObject<Block> BLUE_GLASS_PANE_DOOR = BLOCKS.register("blue_glass_pane_door",
                        () -> new GlassPaneDoorBlock(BLOCKS.key("blue_glass_pane_door")));
        public static final RegistryObject<Item> BLUE_GLASS_PANE_DOOR_ITEM = ITEMS.register("blue_glass_pane_door",
                        () -> new BlockItem(BLUE_GLASS_PANE_DOOR.get(),
                                        new Item.Properties().setId(ITEMS.key("blue_glass_pane_door"))));

        public static final RegistryObject<Block> PURPLE_GLASS_PANE_DOOR = BLOCKS.register("purple_glass_pane_door",
                        () -> new GlassPaneDoorBlock(BLOCKS.key("purple_glass_pane_door")));
        public static final RegistryObject<Item> PURPLE_GLASS_PANE_DOOR_ITEM = ITEMS.register("purple_glass_pane_door",
                        () -> new BlockItem(PURPLE_GLASS_PANE_DOOR.get(),
                                        new Item.Properties().setId(ITEMS.key("purple_glass_pane_door"))));

        public static final RegistryObject<Block> MAGENTA_GLASS_PANE_DOOR = BLOCKS.register("magenta_glass_pane_door",
                        () -> new GlassPaneDoorBlock(BLOCKS.key("magenta_glass_pane_door")));
        public static final RegistryObject<Item> MAGENTA_GLASS_PANE_DOOR_ITEM = ITEMS.register(
                        "magenta_glass_pane_door",
                        () -> new BlockItem(MAGENTA_GLASS_PANE_DOOR.get(),
                                        new Item.Properties().setId(ITEMS.key("magenta_glass_pane_door"))));

        public static final RegistryObject<Block> PINK_GLASS_PANE_DOOR = BLOCKS.register("pink_glass_pane_door",
                        () -> new GlassPaneDoorBlock(BLOCKS.key("pink_glass_pane_door")));
        public static final RegistryObject<Item> PINK_GLASS_PANE_DOOR_ITEM = ITEMS.register("pink_glass_pane_door",
                        () -> new BlockItem(PINK_GLASS_PANE_DOOR.get(),
                                        new Item.Properties().setId(ITEMS.key("pink_glass_pane_door"))));

        public GlassPaneDoorMod(FMLJavaModLoadingContext context) {
                var modBusGroup = context.getModBusGroup();

                // Register the commonSetup method for modloading
                FMLCommonSetupEvent.getBus(modBusGroup).addListener(this::commonSetup);

                // Register the Deferred Register to the mod event bus so blocks get registered
                BLOCKS.register(modBusGroup);
                // Register the Deferred Register to the mod event bus so items get registered
                ITEMS.register(modBusGroup);

                // Register the item to a creative tab
                BuildCreativeModeTabContentsEvent.BUS.addListener(GlassPaneDoorMod::addCreative);

                // Register our mod's ForgeConfigSpec so that Forge can create and load the
                // config file for us
                context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
        }

        private void commonSetup(final FMLCommonSetupEvent event) {
                // Some common setup code
                LOGGER.info("Glass Pane Door Mod: Common Setup");
        }

        // Add the example block item to the building blocks tab
        private static void addCreative(BuildCreativeModeTabContentsEvent event) {
                if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
                        event.accept(GLASS_PANE_DOOR_ITEM);
                        event.accept(BLACK_GLASS_PANE_DOOR_ITEM);
                        event.accept(RED_GLASS_PANE_DOOR_ITEM);
                        event.accept(WHITE_GLASS_PANE_DOOR_ITEM);
                        event.accept(LIGHT_GRAY_GLASS_PANE_DOOR_ITEM);
                        event.accept(GRAY_GLASS_PANE_DOOR_ITEM);
                        event.accept(BROWN_GLASS_PANE_DOOR_ITEM);
                        event.accept(ORANGE_GLASS_PANE_DOOR_ITEM);
                        event.accept(YELLOW_GLASS_PANE_DOOR_ITEM);
                        event.accept(LIME_GLASS_PANE_DOOR_ITEM);
                        event.accept(GREEN_GLASS_PANE_DOOR_ITEM);
                        event.accept(CYAN_GLASS_PANE_DOOR_ITEM);
                        event.accept(LIGHT_BLUE_GLASS_PANE_DOOR_ITEM);
                        event.accept(BLUE_GLASS_PANE_DOOR_ITEM);
                        event.accept(PURPLE_GLASS_PANE_DOOR_ITEM);
                        event.accept(MAGENTA_GLASS_PANE_DOOR_ITEM);
                        event.accept(PINK_GLASS_PANE_DOOR_ITEM);
                }
        }
}
