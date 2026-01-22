package net.cosmic.azure_origins.entity.custom.projectiles;

import net.cosmic.azure_origins.damage.ModDamageTypes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Sunbeam extends ProjectileEntity {
    public Sunbeam(EntityType<? extends ProjectileEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {

    }

    @Override
    public void tick() {
        super.tick();

        if (getWorld().isClient) {
            for (int i = 0; i < 5; i++) {
                /*calculate delta values
                random.nextDouble() creates value 0.0 - 1.0
                subtract by 0.5 to make range -0.5 - 0.5
                multiply by 0.25 because the value we are aiming for is 0.125 in each direction. Basic algebra gives us this value by solving for x in:
                0.5 * x = y
                Where x is what we need to multiply by (which we solve for here and get 0.25)
                And y is our end goal (0.125)
                 */
                double dx = (random.nextDouble() - 0.5) * 0.5;
                double dy = (random.nextDouble() - 0.5) * 0.5;
                double dz = (random.nextDouble() - 0.5) * 0.5;

                getWorld().addParticle(
                        ParticleTypes.FLAME,
                        getX() + dx,
                        getY() + dy + 0.25,
                        getZ() + dz,
                        0, 0, 0
                );
            }
        }

        this.setPosition(
                getX() + getVelocity().x,
                getY() + getVelocity().y,
                getZ() + getVelocity().z
        );

        if (!getWorld().isClient) {
            HitResult hitResult = net.minecraft.entity.projectile.ProjectileUtil.getCollision(this, this::canHit);

            if (hitResult.getType() != HitResult.Type.MISS) {
                this.onCollision(hitResult);
            }
            // Lifetime limit
            if (this.age > 80) {
                discard();
            }
        }
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);

        Entity entity = entityHitResult.getEntity();
        entity.damage(this.getDamageSources().create(ModDamageTypes.SOLAR, this, this.getOwner()), 1.0F);
        entity.setOnFireFor(8);

        BlockPos pos = this.getBlockPos();
        getWorld().playSound(null, pos, SoundEvents.ENTITY_FIREWORK_ROCKET_BLAST, SoundCategory.PLAYERS, 1.0F, (0.8F + getWorld().random.nextFloat() * 0.4F));
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);

        if (hitResult.getType() == HitResult.Type.ENTITY) {
            this.onEntityHit((EntityHitResult) hitResult);
        }

        if (!getWorld().isClient) {
            this.discard();
        }
    }

    @Override
    public void setVelocity(Entity shooter, float pitch, float yaw, float roll, float speed, float divergence) {
        Vec3d dir = Vec3d.fromPolar(pitch, yaw).normalize();
        this.setVelocity(dir.multiply(speed));
        this.velocityDirty = true;
    }

    @Override
    protected boolean canHit(Entity entity) {
        if (entity == getOwner()) return false;
        return super.canHit(entity);
    }
}
