package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.entity.ArchSkeletonEntity;
import net.mcreator.genuinelytoomanyadditions.SoeModVariables;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;

@SoeModElements.ModElement.Tag
public class ArchSkeletonOnEntityTickUpdateProcedure extends SoeModElements.ModElement {
	public ArchSkeletonOnEntityTickUpdateProcedure(SoeModElements instance) {
		super(instance, 787);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure ArchSkeletonOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SoeMod.LOGGER.warn("Failed to load dependency world for procedure ArchSkeletonOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if (((entity instanceof ArchSkeletonEntity.CustomEntity) && ((SoeModVariables.MapVariables.get(world).HardMode) == (false)))) {
			if (!entity.world.isRemote())
				entity.remove();
		}
	}
}
