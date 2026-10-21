package com.oshi.sinborne.items;

import com.oshi.sinborne.Sinborne;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Sinborne.MOD_ID);

    public static final DeferredItem<Item> BOOK_OF_THE_SIN = ITEMS.registerSimpleItem("book_of_the_sin");
    public static final DeferredItem<Item> SHATTERED_HALO = ITEMS.registerSimpleItem("shattered_halo");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
