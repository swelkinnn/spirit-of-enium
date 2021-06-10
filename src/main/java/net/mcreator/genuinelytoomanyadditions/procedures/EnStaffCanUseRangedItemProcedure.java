package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;

@SoeModElements.ModElement.Tag
public class EnStaffCanUseRangedItemProcedure extends SoeModElements.ModElement {
	public EnStaffCanUseRangedItemProcedure(SoeModElements instance) {
		super(instance, 677);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure EnStaffCanUseRangedItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).experienceLevel : 0) >= 2)) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).addExperienceLevel(-((int) 2));
		}
	}
}
