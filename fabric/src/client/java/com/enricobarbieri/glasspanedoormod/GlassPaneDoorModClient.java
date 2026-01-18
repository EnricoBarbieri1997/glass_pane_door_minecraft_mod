package com.enricobarbieri.glasspanedoormod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

public class GlassPaneDoorModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.putBlock(ModBlocks.GLASS_PANE_DOOR, ChunkSectionLayer.TRANSLUCENT);
		BlockRenderLayerMap.putBlock(ModBlocks.WHITE_GLASS_PANE_DOOR, ChunkSectionLayer.TRANSLUCENT);
		BlockRenderLayerMap.putBlock(ModBlocks.LIGHT_GRAY_GLASS_PANE_DOOR, ChunkSectionLayer.TRANSLUCENT);
		BlockRenderLayerMap.putBlock(ModBlocks.GRAY_GLASS_PANE_DOOR, ChunkSectionLayer.TRANSLUCENT);
		BlockRenderLayerMap.putBlock(ModBlocks.BLACK_GLASS_PANE_DOOR, ChunkSectionLayer.TRANSLUCENT);
		BlockRenderLayerMap.putBlock(ModBlocks.BROWN_GLASS_PANE_DOOR, ChunkSectionLayer.TRANSLUCENT);
		BlockRenderLayerMap.putBlock(ModBlocks.RED_GLASS_PANE_DOOR, ChunkSectionLayer.TRANSLUCENT);
		BlockRenderLayerMap.putBlock(ModBlocks.ORANGE_GLASS_PANE_DOOR, ChunkSectionLayer.TRANSLUCENT);
		BlockRenderLayerMap.putBlock(ModBlocks.YELLOW_GLASS_PANE_DOOR, ChunkSectionLayer.TRANSLUCENT);
		BlockRenderLayerMap.putBlock(ModBlocks.LIME_GLASS_PANE_DOOR, ChunkSectionLayer.TRANSLUCENT);
		BlockRenderLayerMap.putBlock(ModBlocks.GREEN_GLASS_PANE_DOOR, ChunkSectionLayer.TRANSLUCENT);
		BlockRenderLayerMap.putBlock(ModBlocks.CYAN_GLASS_PANE_DOOR, ChunkSectionLayer.TRANSLUCENT);
		BlockRenderLayerMap.putBlock(ModBlocks.LIGHT_BLUE_GLASS_PANE_DOOR, ChunkSectionLayer.TRANSLUCENT);
		BlockRenderLayerMap.putBlock(ModBlocks.BLUE_GLASS_PANE_DOOR, ChunkSectionLayer.TRANSLUCENT);
		BlockRenderLayerMap.putBlock(ModBlocks.PURPLE_GLASS_PANE_DOOR, ChunkSectionLayer.TRANSLUCENT);
		BlockRenderLayerMap.putBlock(ModBlocks.MAGENTA_GLASS_PANE_DOOR, ChunkSectionLayer.TRANSLUCENT);
		BlockRenderLayerMap.putBlock(ModBlocks.PINK_GLASS_PANE_DOOR, ChunkSectionLayer.TRANSLUCENT);
	}
}