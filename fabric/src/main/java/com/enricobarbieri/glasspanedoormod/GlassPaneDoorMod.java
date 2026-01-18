package com.enricobarbieri.glasspanedoormod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// import com.enricobarbieri.glasspanedoormod.ModBlocks;

public class GlassPaneDoorMod implements ModInitializer {
	public static final String MOD_ID = "glasspanedoormod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Glass Pane Door Mod initializing");

		ModBlocks.initialize();

		LOGGER.info("Glass Pane Door Mod initialized");
	}
}