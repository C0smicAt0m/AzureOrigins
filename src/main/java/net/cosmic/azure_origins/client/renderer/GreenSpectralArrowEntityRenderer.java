package net.cosmic.azure_origins.client.renderer;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.SpectralArrowEntityRenderer;
import net.minecraft.entity.projectile.SpectralArrowEntity;
import net.minecraft.util.Identifier;

public class GreenSpectralArrowEntityRenderer extends SpectralArrowEntityRenderer {

    private static final Identifier TEXTURE = Identifier.of("azure_origins",  "textures/entity/projectiles/green_spectral_arrow.png");

    public GreenSpectralArrowEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(SpectralArrowEntity spectralArrowEntity) {
        return TEXTURE;
    }
}
