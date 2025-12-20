package net.cosmic.azure_origins.item;

import net.cosmic.azure_origins.AzureOrigins;
import net.cosmic.azure_origins.ModFoodComponents;
import net.cosmic.azure_origins.item.custom.CausticElixir;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CAUSTIC_ELIXIR = registerItem("caustic_elixir", new CausticElixir(new Item.Settings().food(ModFoodComponents.CAUSTIC_ELIXIR)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AzureOrigins.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AzureOrigins.LOGGER.info("Registering Mod Items for " + AzureOrigins.MOD_ID);
    }
}
