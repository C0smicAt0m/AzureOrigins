package net.cosmic.azure_origins.client.renderer;

import net.cosmic.azure_origins.client.renderer.model.MoonblastModel;
import net.cosmic.azure_origins.entity.custom.Moonblast;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class MoonblastRenderer extends EntityRenderer<Moonblast> {

    private static final Identifier TEXTURE =
            Identifier.of("azure_origins", "textures/entity/projectiles/moonblast.png");

    private final MoonblastModel model;

    public MoonblastRenderer(EntityRendererFactory.Context context) {
        super(context);
        // Use the model layer registered in the client initializer
        this.model = new MoonblastModel(context.getPart(net.cosmic.azure_origins.AzureOriginsClient.MOONBLAST_LAYER));
    }

    @Override
    public void render(Moonblast entity, float yaw, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light) {

        matrices.push();

        double centerY = entity.getHeight() / 2.0;
        matrices.translate(0.0D, centerY, 0.0D);

        matrices.multiply(net.minecraft.util.math.RotationAxis.POSITIVE_Y.rotationDegrees(entity.getYaw() - 90f));
        matrices.multiply(net.minecraft.util.math.RotationAxis.POSITIVE_Z.rotationDegrees(entity.getPitch()));

        matrices.translate(0.0, -centerY - 1.0, 0.0);

        VertexConsumer vertexConsumer = vertexConsumers.getBuffer(RenderLayer.getEntityCutout(TEXTURE));

        // Render the model with a white color (0xFFFFFFFF)
        model.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV, 0xFFFFFFFF);

        matrices.pop();

        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }

    @Override
    public Identifier getTexture(Moonblast entity) {
        return TEXTURE;
    }
}
