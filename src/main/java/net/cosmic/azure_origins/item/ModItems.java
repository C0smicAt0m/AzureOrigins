package net.cosmic.azure_origins.item;

import net.cosmic.azure_origins.AzureOrigins;
import net.cosmic.azure_origins.item.custom.*;
import net.cosmic.azure_origins.sound.ModSounds;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CAUSTIC_ELIXIR = registerItem("caustic_elixir", new CausticElixir(new Item.Settings().food(ModFoodComponents.CAUSTIC_ELIXIR).maxCount(1)));
    public static final Item SOLAR_SHARD = registerItem("solar_shard", new SolarShard(new Item.Settings().food(ModFoodComponents.SOLAR_SHARD_FOOD).maxCount(1)));
    public static final Item LUNAR_SHARD = registerItem("lunar_shard", new LunarShard(new Item.Settings().food(ModFoodComponents.LUNAR_SHARD_FOOD).maxCount(1)));
    public static final Item FLARE_OF_HELIOS = registerItem("flare_of_helios", new FlareOfHelios(new Item.Settings().food(ModFoodComponents.FLARE_OF_HELIOS_FOOD).maxCount(1)));
    public static final Item SURGE_OF_SELENE = registerItem("surge_of_selene", new SurgeOfSelene(new Item.Settings().food(ModFoodComponents.SURGE_OF_SELENE_FOOD).maxCount(1)));
    public static final Item ECLIPSE_MUSIC_DISC = registerItem("eclipse_music_disc", new Item(new Item.Settings().jukeboxPlayable(ModSounds.ECLIPSE_KEY).maxCount(1)));
    public static final Item GREEN_SPECTRAL_ARROW = registerItem("green_spectral_arrow", new GreenSpectralArrowItem(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AzureOrigins.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AzureOrigins.LOGGER.info("Registering Mod Items for " + AzureOrigins.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(ECLIPSE_MUSIC_DISC);
        });
    }
}
