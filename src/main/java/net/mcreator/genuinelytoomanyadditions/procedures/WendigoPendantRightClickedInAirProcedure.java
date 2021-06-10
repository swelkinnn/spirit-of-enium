package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.item.WendigoPendantOffItem;
import net.mcreator.genuinelytoomanyadditions.item.WendigoPendantItem;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;

@SoeModElements.ModElement.Tag
public class WendigoPendantRightClickedInAirProcedure extends SoeModElements.ModElement {
	public WendigoPendantRightClickedInAirProcedure(SoeModElements instance) {
		super(instance, 906);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure WendigoPendantRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(WendigoPendantOffItem.block, (int) (1)).getItem())) {
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = new ItemStack(WendigoPendantItem.block, (int) (1));
				_setstack.setCount((int) 1);
				((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
		}
	}
}
