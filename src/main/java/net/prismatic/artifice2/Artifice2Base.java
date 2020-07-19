package net.prismatic.artifice2;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.prismatic.artifice2.blocks.BlastWallAdvanced;
import net.prismatic.artifice2.blocks.BlastWallBasic;
import net.prismatic.artifice2.blocks.BlastWallIndustrial;
import net.prismatic.artifice2.blocks.BlastWallReinforced;

import java.util.List;

public class Artifice2Base implements ModInitializer {
	public static final BlastWallBasic BLAST_WALL_BASIC = new BlastWallBasic(FabricBlockSettings.of(Material.STONE).resistance(20.0f));
	public static final BlastWallReinforced BLAST_WALL_REINFORCED = new BlastWallReinforced(FabricBlockSettings.of(Material.STONE).resistance(30.0f));
	public static final BlastWallIndustrial BLAST_WALL_INDUSTRIAL = new BlastWallIndustrial(FabricBlockSettings.of(Material.STONE).resistance(50.0f));
	public static final BlastWallAdvanced BLAST_WALL_ADVANCED = new BlastWallAdvanced(FabricBlockSettings.of(Material.METAL).resistance(80.0f));
	public static final ItemGroup ARTIFICE = FabricItemGroupBuilder.build(
			new Identifier("artifice2", "artifice2"),
			() -> new ItemStack(Blocks.BRICKS));

	@Override

	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Registry.register(Registry.BLOCK, new Identifier("artifice2", "blast_wall_basic"), BLAST_WALL_BASIC);
		Registry.register(Registry.ITEM, new Identifier("artifice2", "blast_wall_basic"), new BlockItem(BLAST_WALL_BASIC, new Item.Settings().group(ARTIFICE)));
		Registry.register(Registry.BLOCK, new Identifier("artifice2", "blast_wall_reinforced"), BLAST_WALL_REINFORCED);
		Registry.register(Registry.ITEM, new Identifier("artifice2", "blast_wall_reinforced"), new BlockItem(BLAST_WALL_REINFORCED, new Item.Settings().group(ARTIFICE)));
		Registry.register(Registry.BLOCK, new Identifier("artifice2", "blast_wall_industrial"), BLAST_WALL_INDUSTRIAL);
		Registry.register(Registry.ITEM, new Identifier("artifice2", "blast_wall_industrial"), new BlockItem(BLAST_WALL_INDUSTRIAL, new Item.Settings().group(ARTIFICE)));
		Registry.register(Registry.BLOCK, new Identifier("artifice2", "blast_wall_advanced"), BLAST_WALL_ADVANCED);
		Registry.register(Registry.ITEM, new Identifier("artifice2", "blast_wall_advanced"), new BlockItem(BLAST_WALL_ADVANCED, new Item.Settings().group(ARTIFICE)));


	}
}
