package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;

@SoeModElements.ModElement.Tag
public class BrutingstickLivingEntityIsHitWithToolProcedure extends SoeModElements.ModElement {
	public BrutingstickLivingEntityIsHitWithToolProcedure(SoeModElements instance) {
		super(instance, 328);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure BrutingstickLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setSneaking((true));
		entity.rotationYaw = (float) ((Math.random() * 10));
		entity.setRenderYawOffset(entity.rotationYaw);
		entity.prevRotationYaw = entity.rotationYaw;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
			((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
			((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
		}
		entity.rotationPitch = (float) ((Math.random() * 10));
	}
}
