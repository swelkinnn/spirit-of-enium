package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.particle.PlagueDustParticle;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

@SoeModElements.ModElement.Tag
public class PlaguedTonicBulletHitsLivingEntityProcedure extends SoeModElements.ModElement {
	public PlaguedTonicBulletHitsLivingEntityProcedure(SoeModElements instance) {
		super(instance, 589);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure PlaguedTonicBulletHitsLivingEntity!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SoeMod.LOGGER.warn("Failed to load dependency x for procedure PlaguedTonicBulletHitsLivingEntity!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SoeMod.LOGGER.warn("Failed to load dependency y for procedure PlaguedTonicBulletHitsLivingEntity!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SoeMod.LOGGER.warn("Failed to load dependency z for procedure PlaguedTonicBulletHitsLivingEntity!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SoeMod.LOGGER.warn("Failed to load dependency world for procedure PlaguedTonicBulletHitsLivingEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !world.isRemote()) {
			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
		} else {
			((World) world).playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
		}
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(PlagueDustParticle.particle, x, y, z, (int) 25, 1, 1, 1, 1);
		}
		if ((((Entity) world
				.getEntitiesWithinAABB(LivingEntity.class,
						new AxisAlignedBB(x - (5 / 2d), y - (5 / 2d), z - (5 / 2d), x + (5 / 2d), y + (5 / 2d), z + (5 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WITHER, (int) 100, (int) 1, (false), (false)));
		}
	}
}
