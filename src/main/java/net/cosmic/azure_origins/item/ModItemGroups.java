package net.cosmic.azure_origins.item;

import net.cosmic.azure_origins.AzureOrigins;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup AZURE_ORIGINS_ITEMS = Registry.register(Registries.ITEM_GROUP, Identifier.of(AzureOrigins.MOD_ID, "azure_origins_items"), FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.CAUSTIC_ELIXIR))
            .displayName(Text.translatable("itemgroup.azure_origins.azure_origins_items"))
            .entries((displayContext, entries) -> {
                entries.add(ModItems.CAUSTIC_ELIXIR);
            })
            .build());

    public static void registerModItemGroups() {
        AzureOrigins.LOGGER.info("Registering Mod Item Groups for " + AzureOrigins.MOD_ID);
    }
}
