package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.item.GrimmkinstaffbulletItem;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Random;
import java.util.Map;

@SoeModElements.ModElement.Tag
public class GrimmkinStaffCanUseRangedItemProcedure extends SoeModElements.ModElement {
	public GrimmkinStaffCanUseRangedItemProcedure(SoeModElements instance) {
		super(instance, 679);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure GrimmkinStaffCanUseRangedItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).experienceLevel : 0) >= 1)) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).addExperienceLevel(-((int) 1));
			if (entity instanceof LivingEntity) {
				Entity _ent = entity;
				if (!_ent.world.isRemote()) {
					GrimmkinstaffbulletItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 5, (int) 1);
				}
			}
		}
	}
}
