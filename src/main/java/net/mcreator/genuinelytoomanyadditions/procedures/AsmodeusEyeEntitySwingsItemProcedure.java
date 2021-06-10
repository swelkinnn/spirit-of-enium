package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.item.AsmodeuseyeshootItem;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Random;
import java.util.Map;

@SoeModElements.ModElement.Tag
public class AsmodeusEyeEntitySwingsItemProcedure extends SoeModElements.ModElement {
	public AsmodeusEyeEntitySwingsItemProcedure(SoeModElements instance) {
		super(instance, 632);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure AsmodeusEyeEntitySwingsItem!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				SoeMod.LOGGER.warn("Failed to load dependency itemstack for procedure AsmodeusEyeEntitySwingsItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).experienceLevel : 0) >= 2)) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).addExperienceLevel(-((int) 2));
			if (entity instanceof LivingEntity) {
				Entity _ent = entity;
				if (!_ent.world.isRemote()) {
					AsmodeuseyeshootItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 3, (float) 10, (int) 1);
				}
			}
			{
				ItemStack _ist = (itemstack);
				if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamage(0);
				}
			}
		}
	}
}
