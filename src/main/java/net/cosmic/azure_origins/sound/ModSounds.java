package net.cosmic.azure_origins.sound;

import net.cosmic.azure_origins.AzureOrigins;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent CONSUME_MAGIC_ITEM = registerSoundEvent("consume_magic_item");

    public static final SoundEvent ECLIPSE = registerSoundEvent("eclipse");
    public static final RegistryKey<JukeboxSong> ECLIPSE_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(AzureOrigins.MOD_ID, "eclipse"));

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(AzureOrigins.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        AzureOrigins.LOGGER.info("Registering sounds for " + AzureOrigins.MOD_ID);
    }
}
