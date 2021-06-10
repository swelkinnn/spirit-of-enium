package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;

@SoeModElements.ModElement.Tag
public class EnWhipLivingEntityIsHitWithToolProcedure extends SoeModElements.ModElement {
	public EnWhipLivingEntityIsHitWithToolProcedure(SoeModElements instance) {
		super(instance, 391);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure EnWhipLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 60, (int) 1, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LEVITATION, (int) 20, (int) 1, (false), (false)));
		entity.setMotionMultiplier(null, new Vector3d(0.25D, (double) 0.05F, 0.25D));
	}
}
