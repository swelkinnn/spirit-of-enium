package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;

import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;

@SoeModElements.ModElement.Tag
public class DynamitethrownBulletHitsLivingEntityProcedure extends SoeModElements.ModElement {
	public DynamitethrownBulletHitsLivingEntityProcedure(SoeModElements instance) {
		super(instance, 560);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SoeMod.LOGGER.warn("Failed to load dependency x for procedure DynamitethrownBulletHitsLivingEntity!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SoeMod.LOGGER.warn("Failed to load dependency y for procedure DynamitethrownBulletHitsLivingEntity!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SoeMod.LOGGER.warn("Failed to load dependency z for procedure DynamitethrownBulletHitsLivingEntity!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SoeMod.LOGGER.warn("Failed to load dependency world for procedure DynamitethrownBulletHitsLivingEntity!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 1, Explosion.Mode.BREAK);
		}
	}
}
