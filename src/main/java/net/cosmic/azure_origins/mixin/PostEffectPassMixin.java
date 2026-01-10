package net.cosmic.azure_origins.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.JsonEffectShaderProgram;
import net.minecraft.client.gl.PostEffectPass;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PostEffectPass.class)
public abstract class PostEffectPassMixin {
    @Shadow
    public abstract JsonEffectShaderProgram getProgram();

    @Unique
    private float longTime = 0.0F;

    @Inject(
            method = "render",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/gl/JsonEffectShaderProgram;enable()V"
            )
    )
    private void injectLongTimeUniform(float time, CallbackInfo ci) {
        MinecraftClient client = MinecraftClient.getInstance();

        longTime += client.getRenderTickCounter().getLastFrameDuration();

        longTime %= 3600;

        getProgram().getUniformByNameOrDummy("LongTime").set(longTime);
    }
}
