package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.item.DynamightythrownItem;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Random;
import java.util.Map;

@SoeModElements.ModElement.Tag
public class DynamightyRightClickedInAirProcedure extends SoeModElements.ModElement {
	public DynamightyRightClickedInAirProcedure(SoeModElements instance) {
		super(instance, 596);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure DynamightyRightClickedInAir!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				SoeMod.LOGGER.warn("Failed to load dependency itemstack for procedure DynamightyRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).shrink((int) 1);
		if (entity instanceof LivingEntity) {
			Entity _ent = entity;
			if (!_ent.world.isRemote()) {
				DynamightythrownItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 1, (float) 0, (int) 0);
			}
		}
	}
}
