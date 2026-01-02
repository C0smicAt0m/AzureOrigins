package net.cosmic.azure_origins.mixin;

import net.cosmic.azure_origins.item.ModItems;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(PlayerEntityModel.class)
public abstract class PlayerGliderRendererMixin<T extends LivingEntity> {

    @Inject(
            method = "setAngles(Lnet/minecraft/entity/LivingEntity;FFFFF)V",
            at = @At("TAIL")
    )
    private void applyGliderPose(
            T livingEntity, float f, float g, float h, float i, float j, CallbackInfo ci
    ) {
        if (!(livingEntity instanceof AbstractClientPlayerEntity player)) return;

        boolean holdingGlider =
                player.getMainHandStack().isOf(ModItems.NEBULA_GLIDER)
                        || player.getOffHandStack().isOf(ModItems.NEBULA_GLIDER);

        if (!holdingGlider) return;

        PlayerEntityModel<?> model = (PlayerEntityModel<?>)(Object)this;

        float armPitch = (float) Math.toRadians(-180);

        model.rightArm.pitch = armPitch;
        model.leftArm.pitch  = armPitch;

        model.rightArm.roll = 0.0F;
        model.leftArm.roll = 0.0F;

        model.rightArm.yaw = 0.0F;
        model.leftArm.yaw  = 0.0F;

        model.rightSleeve.pitch = armPitch;
        model.leftSleeve.pitch  = armPitch;

        model.rightSleeve.roll = 0.0F;
        model.leftSleeve.roll = 0.0F;

        model.rightSleeve.yaw = 0.0F;
        model.leftSleeve.yaw  = 0.0F;
    }
}
