package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;

@SoeModElements.ModElement.Tag
public class SharpenedCandyCaneLivingEntityIsHitWithToolProcedure extends SoeModElements.ModElement {
	public SharpenedCandyCaneLivingEntityIsHitWithToolProcedure(SoeModElements instance) {
		super(instance, 612);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure SharpenedCandyCaneLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).attackEntityFrom(new DamageSource("candycane").setDamageBypassesArmor(), (float) 1);
		}
	}
}
