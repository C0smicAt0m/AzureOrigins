package net.cosmic.azure_origins.mixin;

import net.minecraft.client.gl.JsonEffectShaderProgram;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(JsonEffectShaderProgram.class)
public class JsonEffectShaderProgramMixin {
    @Redirect(
            method = "<init>",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/util/Identifier;ofVanilla(Ljava/lang/String;)Lnet/minecraft/util/Identifier;"
            )
    )
    private Identifier redirectIdentifier(String path) {
        int lastSlash = path.lastIndexOf('/');
        String fileName = path.substring(lastSlash + 1, path.length() - ".json".length());

        if (fileName.contains(":")) {
            String[] split = fileName.split(":", 2);
            String namespace = split[0];
            String shaderName = split[1];
            return Identifier.of(namespace, "shaders/program/" + shaderName + ".json");
        }

        return Identifier.ofVanilla(path);
    }

    @Redirect(
            method = "loadEffect",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/util/Identifier;ofVanilla(Ljava/lang/String;)Lnet/minecraft/util/Identifier;"
            )
    )
    private static Identifier redirectVertexFragmentIdentifier(String path) {
        int lastSlash = path.lastIndexOf('/');
        String fileNameWithExt = path.substring(lastSlash + 1);

        int dotIndex = fileNameWithExt.lastIndexOf('.');
        String fileName = fileNameWithExt.substring(0, dotIndex);
        String extension = fileNameWithExt.substring(dotIndex);

        if (fileName.contains(":")) {
            String[] split = fileName.split(":", 2);
            String namespace = split[0];
            String shaderName = split[1];
            return Identifier.of(namespace, "shaders/program/" + shaderName + extension);
        }

        return Identifier.ofVanilla(path);
    }
}
