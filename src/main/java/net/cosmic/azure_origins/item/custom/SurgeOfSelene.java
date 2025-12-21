package net.cosmic.azure_origins.item.custom;

import net.cosmic.azure_origins.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.UseAction;

public class SurgeOfSelene extends Item {
    public SurgeOfSelene(Settings settings) {
        super(settings);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.NONE;
    }

    @Override
    public SoundEvent getEatSound() {
        return ModSounds.CONSUME_MAGIC_ITEM;
    }
}
