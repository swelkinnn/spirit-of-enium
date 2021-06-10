package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.item.ThrowingSpadeItem;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Random;
import java.util.Map;

@SoeModElements.ModElement.Tag
public class SpadeShotgunRangedItemUsedProcedure extends SoeModElements.ModElement {
	public SpadeShotgunRangedItemUsedProcedure(SoeModElements instance) {
		super(instance, 402);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure SpadeShotgunRangedItemUsed!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				SoeMod.LOGGER.warn("Failed to load dependency itemstack for procedure SpadeShotgunRangedItemUsed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		for (int index0 = 0; index0 < (int) ((Math.random() * 10)); index0++) {
			if (entity instanceof LivingEntity) {
				Entity _ent = entity;
				if (!_ent.world.isRemote()) {
					ThrowingSpadeItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) (Math.random() * 10),
							(float) (Math.random() * 10), (int) 1);
				}
			}
		}
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getCooldownTracker().setCooldown(((itemstack)).getItem(), (int) 30);
	}
}
