package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;

@SoeModElements.ModElement.Tag
public class GrimmchildEntityIsHurtProcedure extends SoeModElements.ModElement {
	public GrimmchildEntityIsHurtProcedure(SoeModElements instance) {
		super(instance, 359);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure GrimmchildEntityIsHurt!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.isBurning()) || (entity.isInLava()))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 60, (int) 1, (false), (false)));
		}
	}
}
