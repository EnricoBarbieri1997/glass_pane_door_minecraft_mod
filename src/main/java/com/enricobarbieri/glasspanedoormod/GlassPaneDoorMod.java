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

    // Creates a new Block with the id "glasspanedoormod:GLASS_PANE_DOOR"
    public static final RegistryObject<Block> GLASS_PANE_DOOR = BLOCKS.register("glass_pane_door",
            () -> new GlassPaneDoorBlock(BLOCKS.key("glass_pane_door")));
    // Creates a new BlockItem with the id "glasspanedoormod:glass_pane_door",
    // combining the
    // namespace and path
    public static final RegistryObject<Item> GLASS_PANE_DOOR_ITEM = ITEMS.register("glass_pane_door",
            () -> new BlockItem(GLASS_PANE_DOOR.get(), new Item.Properties().setId(ITEMS.key("glass_pane_door"))));

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

        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
    }

    // Add the example block item to the building blocks tab
    private static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
            event.accept(GLASS_PANE_DOOR_ITEM);
    }
}
