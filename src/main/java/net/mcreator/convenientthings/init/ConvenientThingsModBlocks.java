/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.convenientthings.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.convenientthings.block.SulfurOreBlock;
import net.mcreator.convenientthings.ConvenientThingsMod;

public class ConvenientThingsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ConvenientThingsMod.MODID);
	public static final RegistryObject<Block> SULFUR_ORE;
	static {
		SULFUR_ORE = REGISTRY.register("sulfur_ore", SulfurOreBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}