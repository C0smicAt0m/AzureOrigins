package net.cosmic.azure_origins.client.renderer.model;

import net.cosmic.azure_origins.entity.custom.Sunbeam;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class SunbeamModel extends EntityModel<Sunbeam> {
	private final ModelPart bb_main;
	public SunbeamModel(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData cube_r1 = bb_main.addChild("cube_r1", ModelPartBuilder.create().uv(0, 21).cuboid(-4.0F, -0.5F, -2.0F, 8.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0793F, 3.8848F, -0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r2 = bb_main.addChild("cube_r2", ModelPartBuilder.create().uv(0, 16).cuboid(-4.0F, -0.5F, -2.0F, 8.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -10.0793F, 3.8848F, 0.3927F, 0.0F, 0.0F));

		ModelPartData cube_r3 = bb_main.addChild("cube_r3", ModelPartBuilder.create().uv(0, 26).cuboid(-0.5F, -4.0F, -2.0F, 1.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-4.0793F, -6.0F, 3.8848F, 0.0F, -0.3927F, 0.0F));

		ModelPartData cube_r4 = bb_main.addChild("cube_r4", ModelPartBuilder.create().uv(24, 16).cuboid(-0.5F, -4.0F, -2.0F, 1.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(4.0793F, -6.0F, 3.8848F, 0.0F, 0.3927F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
		bb_main.render(matrices, vertexConsumer, light, overlay, color);
	}

	@Override
	public void setAngles(Sunbeam entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}
}