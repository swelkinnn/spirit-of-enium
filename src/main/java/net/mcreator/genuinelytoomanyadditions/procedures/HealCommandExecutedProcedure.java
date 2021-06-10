package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;

@SoeModElements.ModElement.Tag
public class HealCommandExecutedProcedure extends SoeModElements.ModElement {
	public HealCommandExecutedProcedure(SoeModElements instance) {
		super(instance, 265);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure HealCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).setHealth((float) 20);
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getFoodStats().setFoodLevel((int) 20);
	}
}
