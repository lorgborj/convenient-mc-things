/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.convenientthings.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.convenientthings.ConvenientThingsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ConvenientThingsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ConvenientThingsMod.MODID);
	public static final RegistryObject<CreativeModeTab> CONVENIENT_THINGS = REGISTRY.register("convenient_things",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.convenient_things.convenient_things")).icon(() -> new ItemStack(ConvenientThingsModItems.SULFUR_DUST.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ConvenientThingsModBlocks.SULFUR_ORE.get().asItem());
				tabData.accept(ConvenientThingsModItems.SULFUR_DUST.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(ConvenientThingsModBlocks.SULFUR_ORE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(ConvenientThingsModItems.SULFUR_DUST.get());
		}
	}
}