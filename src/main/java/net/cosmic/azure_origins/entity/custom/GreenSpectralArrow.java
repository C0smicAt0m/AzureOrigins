package net.cosmic.azure_origins.entity.custom;

import net.cosmic.azure_origins.entity.ModEntities;
import net.cosmic.azure_origins.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.SpectralArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GreenSpectralArrow extends SpectralArrowEntity {

    // Standard constructor used by FabricEntityTypeBuilder
    public GreenSpectralArrow(EntityType<? extends SpectralArrowEntity> type, World world) {
        super(type, world);
    }

    // Custom constructor for when shooting the arrow
    public GreenSpectralArrow(World world, LivingEntity owner) {
        super(ModEntities.GREEN_SPECTRAL_ARROW, world);  // Only type + world
        this.setOwner(owner);                            // Set the shooter
        this.setPos(owner.getX(), owner.getEyeY() - 0.1f, owner.getZ());
    }

    @Override
    protected ItemStack getDefaultItemStack() {
        return new ItemStack(ModItems.GREEN_SPECTRAL_ARROW);
    }
}

