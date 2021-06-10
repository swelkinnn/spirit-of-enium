package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;

@SoeModElements.ModElement.Tag
public class ChokingOnPotionActiveTickProcedure extends SoeModElements.ModElement {
	public ChokingOnPotionActiveTickProcedure(SoeModElements instance) {
		super(instance, 718);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure ChokingOnPotionActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getFoodStats().setFoodLevel((int) 3);
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).attackEntityFrom(new DamageSource("choke").setDamageBypassesArmor(), (float) 1);
		}
		if (((entity.isSneaking()) == (false))) {
			entity.setSneaking((true));
		}
	}
}
