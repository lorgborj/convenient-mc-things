/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.convenientthings.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.convenientthings.item.SulfurDustItem;
import net.mcreator.convenientthings.item.SulfurCoatedBoneItem;
import net.mcreator.convenientthings.ConvenientThingsMod;

public class ConvenientThingsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ConvenientThingsMod.MODID);
	public static final RegistryObject<Item> SULFUR_ORE;
	public static final RegistryObject<Item> SULFUR_DUST;
	public static final RegistryObject<Item> SULFUR_COATED_BONE;
	static {
		SULFUR_ORE = block(ConvenientThingsModBlocks.SULFUR_ORE);
		SULFUR_DUST = REGISTRY.register("sulfur_dust", SulfurDustItem::new);
		SULFUR_COATED_BONE = REGISTRY.register("sulfur_coated_bone", SulfurCoatedBoneItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}