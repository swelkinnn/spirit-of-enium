package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.SoeModVariables;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;
import java.util.Collections;

@SoeModElements.ModElement.Tag
public class FoolcardtpProcedure extends SoeModElements.ModElement {
	public FoolcardtpProcedure(SoeModElements instance) {
		super(instance, 953);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure Foolcardtp!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				SoeMod.LOGGER.warn("Failed to load dependency itemstack for procedure Foolcardtp!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		{
			Entity _ent = entity;
			_ent.setPositionAndUpdate(
					((entity.getCapability(SoeModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new SoeModVariables.PlayerVariables())).spawnpointx),
					((entity.getCapability(SoeModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new SoeModVariables.PlayerVariables())).spawnpointy),
					((entity.getCapability(SoeModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new SoeModVariables.PlayerVariables())).spawnpointz));
			if (_ent instanceof ServerPlayerEntity) {
				((ServerPlayerEntity) _ent).connection.setPlayerLocation(
						((entity.getCapability(SoeModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new SoeModVariables.PlayerVariables())).spawnpointx),
						((entity.getCapability(SoeModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new SoeModVariables.PlayerVariables())).spawnpointy),
						((entity.getCapability(SoeModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new SoeModVariables.PlayerVariables())).spawnpointz),
						_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
			}
		}
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getCooldownTracker().setCooldown(((itemstack)).getItem(), (int) 6000);
	}
}
