package net.cosmic.azure_origins.mixin;

import net.minecraft.component.type.FoodComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(FoodComponent.Builder.class)
public interface FoodComponentBuilderAccessor {
    @Accessor("eatSeconds")
    void azure_origins$setEatSeconds(float eatSeconds);
}
