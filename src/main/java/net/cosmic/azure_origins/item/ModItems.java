package net.cosmic.azure_origins.item;

import net.cosmic.azure_origins.AzureOrigins;
import net.cosmic.azure_origins.item.ModFoodComponents;
import net.cosmic.azure_origins.item.custom.*;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CAUSTIC_ELIXIR = registerItem("caustic_elixir", new CausticElixir(new Item.Settings().food(ModFoodComponents.CAUSTIC_ELIXIR)));
    public static final Item SOLAR_SHARD = registerItem("solar_shard", new SolarShard(new Item.Settings().food(ModFoodComponents.SOLAR_SHARD_FOOD)));
    public static final Item LUNAR_SHARD = registerItem("lunar_shard", new LunarShard(new Item.Settings().food(ModFoodComponents.LUNAR_SHARD_FOOD)));
    public static final Item FLARE_OF_HELIOS = registerItem("flare_of_helios", new FlareOfHelios(new Item.Settings().food(ModFoodComponents.FLARE_OF_HELIOS_FOOD)));
    public static final Item SURGE_OF_SELENE = registerItem("surge_of_selene", new SurgeOfSelene(new Item.Settings().food(ModFoodComponents.SURGE_OF_SELENE_FOOD)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AzureOrigins.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AzureOrigins.LOGGER.info("Registering Mod Items for " + AzureOrigins.MOD_ID);
    }
}
