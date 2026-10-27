package com.oshi.sinborne.creativemodetab;

import com.oshi.sinborne.Sinborne;
import com.oshi.sinborne.items.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Sinborne.MOD_ID);

    public static final Supplier<CreativeModeTab> SINBORNE_ITEMS_TAB = CREATIVE_MODE_TABS.register("sinborne_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BOOK_OF_THE_SIN.get()))
                    .withTabsBefore(CreativeModeTabs.INGREDIENTS)
                    .withTabsAfter(Identifier.fromNamespaceAndPath(Sinborne.MOD_ID, "sinborne_items_tab"))
                    .title(Component.translatable("item.creative_mode.sinborne"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BOOK_OF_THE_SIN);

                    }).build());

    public static final Supplier<CreativeModeTab> SUPERBIA_ITEMS_TAB = CREATIVE_MODE_TABS.register("superbia_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SHATTERED_HALO.get()))
                    .title(Component.translatable("item.creative_mode.superbia"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SHATTERED_HALO);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
