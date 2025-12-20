package net.cosmic.azure_origins;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public class ModFoodComponents {
    public static final FoodComponent CAUSTIC_ELIXIR = new FoodComponent.Builder()
            .alwaysEdible()
            .nutrition(0)
            .saturationModifier(1.0F)
            .usingConvertsTo(Items.GLASS_BOTTLE)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 2400), 1.0F)
            .build();
}