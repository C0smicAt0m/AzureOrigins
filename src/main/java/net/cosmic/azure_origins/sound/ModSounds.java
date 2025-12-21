package net.cosmic.azure_origins.sound;

import net.cosmic.azure_origins.AzureOrigins;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent CONSUME_MAGIC_ITEM = registerSoundEvent("consume_magic_item");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(AzureOrigins.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        AzureOrigins.LOGGER.info("Registering sounds for " + AzureOrigins.MOD_ID);
    }
}
