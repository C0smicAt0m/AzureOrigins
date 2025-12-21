package net.cosmic.azure_origins.item;

import net.cosmic.azure_origins.mixin.FoodComponentBuilderAccessor;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;

public class ModFoodComponents extends FoodComponents {

    public static final FoodComponent CAUSTIC_ELIXIR = new FoodComponent.Builder()
            .alwaysEdible()
            .nutrition(0)
            .saturationModifier(1.0F)
            .usingConvertsTo(Items.GLASS_BOTTLE)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 2400), 1.0F)
            .build();

    public static final FoodComponent SOLAR_SHARD_FOOD = setEatSeconds(new FoodComponent.Builder(), 0.05F)
            .nutrition(0)
            .saturationModifier(0f)
            .alwaysEdible()
            .build();

    public static final FoodComponent LUNAR_SHARD_FOOD = setEatSeconds(new FoodComponent.Builder(), 0.05F)
            .nutrition(0)
            .saturationModifier(0f)
            .alwaysEdible()
            .build();

    public static final FoodComponent FLARE_OF_HELIOS_FOOD = setEatSeconds(new FoodComponent.Builder(), 0.05F)
            .nutrition(0)
            .saturationModifier(0f)
            .alwaysEdible()
            .build();

    public static final FoodComponent SURGE_OF_SELENE_FOOD = setEatSeconds(new FoodComponent.Builder(), 0.05F)
            .nutrition(0)
            .saturationModifier(0f)
            .alwaysEdible()
            .build();

    public static FoodComponent.Builder setEatSeconds(FoodComponent.Builder builder, float seconds) {
        ((FoodComponentBuilderAccessor) builder).azure_origins$setEatSeconds(seconds);
        return builder;
    }

}
