package net.cosmic.azure_origins.entity;

import net.cosmic.azure_origins.AzureOrigins;
import net.cosmic.azure_origins.entity.custom.GreenSpectralArrow;
import net.cosmic.azure_origins.entity.custom.Moonblast;
import net.cosmic.azure_origins.entity.custom.Sunbeam;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<GreenSpectralArrow> GREEN_SPECTRAL_ARROW =
            Registry.register(
                    Registries.ENTITY_TYPE,
                    Identifier.of(AzureOrigins.MOD_ID, "green_spectral_arrow"),
                    EntityType.Builder
                            .<GreenSpectralArrow>create(
                                    GreenSpectralArrow::new,
                                    SpawnGroup.MISC
                            )
                            .dimensions(0.5F, 0.5F)
                            .maxTrackingRange(4)
                            .trackingTickInterval(20)
                            .build("green_spectral_arrow")
            );

    public static final EntityType<Moonblast> MOONBLAST =
            Registry.register(
                    Registries.ENTITY_TYPE,
                    Identifier.of(AzureOrigins.MOD_ID, "moonblast"),
                    EntityType.Builder
                            .create(
                                    Moonblast::new,
                                    SpawnGroup.MISC
                            )
                            .dimensions(0.5F, 0.5F)
                            .maxTrackingRange(4)
                            .trackingTickInterval(20)
                            .build("moonblast")
            );

    public static final EntityType<Sunbeam> SUNBEAM =
            Registry.register(
                    Registries.ENTITY_TYPE,
                    Identifier.of(AzureOrigins.MOD_ID, "sunbeam"),
                    EntityType.Builder
                            .create(
                                    Sunbeam::new,
                                    SpawnGroup.MISC
                            )
                            .dimensions(0.5F, 0.5F)
                            .maxTrackingRange(4)
                            .trackingTickInterval(20)
                            .build("sunbeam")
            );

    public static void registerModEntities() {
        AzureOrigins.LOGGER.info("Registering Mod Entities for " + AzureOrigins.MOD_ID);
    }
}
