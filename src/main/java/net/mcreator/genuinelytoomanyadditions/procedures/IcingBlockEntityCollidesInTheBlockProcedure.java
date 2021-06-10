package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;

@SoeModElements.ModElement.Tag
public class IcingBlockEntityCollidesInTheBlockProcedure extends SoeModElements.ModElement {
	public IcingBlockEntityCollidesInTheBlockProcedure(SoeModElements instance) {
		super(instance, 468);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure IcingBlockEntityCollidesInTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setMotionMultiplier(null, new Vector3d(0.25D, (double) 0.05F, 0.25D));
	}
}
