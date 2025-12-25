package net.cosmic.azure_origins;

import net.cosmic.azure_origins.entity.ModEntities;
import net.cosmic.azure_origins.item.ModItemGroups;
import net.cosmic.azure_origins.item.ModItems;
import net.cosmic.azure_origins.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AzureOrigins implements ModInitializer {
	public static final String MOD_ID = "azure_origins";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerModItemGroups();
		ModSounds.registerSounds();
		ModEntities.registerModEntities();
	}
}