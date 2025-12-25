package net.cosmic.azure_origins;

import net.cosmic.azure_origins.client.renderer.GreenSpectralArrowEntityRenderer;
import net.cosmic.azure_origins.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class AzureOriginsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.GREEN_SPECTRAL_ARROW, (dispatcher) -> new GreenSpectralArrowEntityRenderer(dispatcher));
    }
}
