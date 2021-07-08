package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.SoeModVariables;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;

@SoeModElements.ModElement.Tag
public class ManatestProcedure extends SoeModElements.ModElement {
	public ManatestProcedure(SoeModElements instance) {
		super(instance, 968);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure Manatest!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		System.out.println(
				((entity.getCapability(SoeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new SoeModVariables.PlayerVariables())).mana));
	}
}
