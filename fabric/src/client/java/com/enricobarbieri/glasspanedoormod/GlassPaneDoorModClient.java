package com.enricobarbieri.glasspanedoormod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

public class GlassPaneDoorModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.putBlock(ModBlocks.GLASS_PANE_DOOR, ChunkSectionLayer.TRANSLUCENT);
		BlockRenderLayerMap.putBlock(ModBlocks.BLACK_GLASS_PANE_DOOR, ChunkSectionLayer.TRANSLUCENT);
	}
}