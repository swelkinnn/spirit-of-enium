package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;

@SoeModElements.ModElement.Tag
public class PheonixBlasterBulletHitsLivingEntityProcedure extends SoeModElements.ModElement {
	public PheonixBlasterBulletHitsLivingEntityProcedure(SoeModElements instance) {
		super(instance, 264);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure PheonixBlasterBulletHitsLivingEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 1);
	}
}
