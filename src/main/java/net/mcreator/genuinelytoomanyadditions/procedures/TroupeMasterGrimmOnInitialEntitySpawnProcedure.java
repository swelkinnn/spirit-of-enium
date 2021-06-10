package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.particle.GrimmfireParticle;
import net.mcreator.genuinelytoomanyadditions.entity.TroupeMasterGrimmEntity;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;

@SoeModElements.ModElement.Tag
public class TroupeMasterGrimmOnInitialEntitySpawnProcedure extends SoeModElements.ModElement {
	public TroupeMasterGrimmOnInitialEntitySpawnProcedure(SoeModElements instance) {
		super(instance, 302);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure TroupeMasterGrimmOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SoeMod.LOGGER.warn("Failed to load dependency x for procedure TroupeMasterGrimmOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SoeMod.LOGGER.warn("Failed to load dependency y for procedure TroupeMasterGrimmOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SoeMod.LOGGER.warn("Failed to load dependency z for procedure TroupeMasterGrimmOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SoeMod.LOGGER.warn("Failed to load dependency world for procedure TroupeMasterGrimmOnInitialEntitySpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((entity instanceof TroupeMasterGrimmEntity.CustomEntity)) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(GrimmfireParticle.particle, x, y, z, (int) 50, 3, 3, 3, 1);
			}
		}
	}
}
