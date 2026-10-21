package com.oshi.sinborne.datagen;

import com.oshi.sinborne.Sinborne;
import com.oshi.sinborne.items.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, Sinborne.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ModItems.BOOK_OF_THE_SIN.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.SHATTERED_HALO.get(), ModelTemplates.FLAT_ITEM);

    }
}
