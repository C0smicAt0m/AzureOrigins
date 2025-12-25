package net.cosmic.azure_origins.item.custom;

import net.cosmic.azure_origins.entity.custom.GreenSpectralArrow;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpectralArrowItem;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class GreenSpectralArrowItem extends SpectralArrowItem {
    public GreenSpectralArrowItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter, @Nullable ItemStack shotFrom) {
        // Always spawn your custom arrow entity
        return new GreenSpectralArrow(world, shooter);
    }
}
