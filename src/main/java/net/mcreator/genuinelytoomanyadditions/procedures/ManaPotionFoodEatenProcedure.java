package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.SoeModVariables;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;

@SoeModElements.ModElement.Tag
public class ManaPotionFoodEatenProcedure extends SoeModElements.ModElement {
	public ManaPotionFoodEatenProcedure(SoeModElements instance) {
		super(instance, 966);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure ManaPotionFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			double _setval = (double) (((entity.getCapability(SoeModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new SoeModVariables.PlayerVariables())).mana) + 25);
			entity.getCapability(SoeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.mana = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
