package net.cosmic.azure_origins.client.renderer;

import net.cosmic.azure_origins.client.AzureOriginsClient;
import net.cosmic.azure_origins.client.renderer.model.SearingLightModel;
import net.cosmic.azure_origins.entity.custom.projectiles.SearingLight;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;

public class SearingLightRenderer extends EntityRenderer<SearingLight> {

    private static final Identifier TEXTURE =
            Identifier.of("azure_origins", "textures/entity/projectiles/searing_light.png");

    private final SearingLightModel model;

    public SearingLightRenderer(EntityRendererFactory.Context context) {
        super(context);
        // Use the model layer registered in the client initializer
        this.model = new SearingLightModel(context.getPart(AzureOriginsClient.SEARING_LIGHT_LAYER));
    }

    @Override
    public void render(SearingLight entity, float yaw, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light) {

        matrices.push();

        double centerY = entity.getHeight() / 2.0;
        matrices.translate(0.0D, centerY, 0.0D);

        Vec3d v = entity.getVelocity();

        if (v.lengthSquared() > 1.0E-6) {
            float yawFromVelocity =
                    (float)(Math.atan2(v.x, v.z) * (180F / Math.PI));

            float pitchFromVelocity =
                    (float)(Math.atan2(
                            v.y,
                            Math.sqrt(v.x * v.x + v.z * v.z)
                    ) * (180F / Math.PI));

            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(yawFromVelocity));
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(-pitchFromVelocity));
        }

        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180F));

        matrices.translate(0.0, -centerY - 0.875, 0.0);

        VertexConsumer vertexConsumer = vertexConsumers.getBuffer(RenderLayer.getEntityCutout(TEXTURE));

        // Render the model with a white color (0xFFFFFFFF)
        model.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV, 0xFFFFFFFF);

        matrices.pop();

        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }

    @Override
    public Identifier getTexture(SearingLight entity) {
        return TEXTURE;
    }
}
