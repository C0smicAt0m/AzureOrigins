package net.cosmic.azure_origins;

import net.cosmic.azure_origins.client.renderer.GreenSpectralArrowEntityRenderer;
import net.cosmic.azure_origins.client.renderer.MoonblastRenderer;
import net.cosmic.azure_origins.client.renderer.model.MoonblastModel;
import net.cosmic.azure_origins.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class AzureOriginsClient implements ClientModInitializer {

    public static final EntityModelLayer MOONBLAST_LAYER =
            new EntityModelLayer(
                    Identifier.of("azure_origins", "moonblast"),
                    "main"
            );

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.GREEN_SPECTRAL_ARROW, GreenSpectralArrowEntityRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(MOONBLAST_LAYER, MoonblastModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.MOONBLAST, MoonblastRenderer::new);
    }
}
