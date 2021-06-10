package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.item.VengefulSoulItem;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Random;
import java.util.Map;

@SoeModElements.ModElement.Tag
public class NailRightClickedInAirProcedure extends SoeModElements.ModElement {
	public NailRightClickedInAirProcedure(SoeModElements instance) {
		super(instance, 276);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure NailRightClickedInAir!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				SoeMod.LOGGER.warn("Failed to load dependency itemstack for procedure NailRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).experienceLevel : 0) >= 3)) {
			if (entity instanceof LivingEntity) {
				Entity _ent = entity;
				if (!_ent.world.isRemote()) {
					VengefulSoulItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 3.5, (float) 5, (int) 0);
				}
			}
			{
				ItemStack _ist = (itemstack);
				if (_ist.attemptDamageItem((int) 25, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamage(0);
				}
			}
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).addExperienceLevel(-((int) 3));
		}
	}
}
