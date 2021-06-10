package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;

@SoeModElements.ModElement.Tag
public class AiujfkcfjseidProcedure extends SoeModElements.ModElement {
	public AiujfkcfjseidProcedure(SoeModElements instance) {
		super(instance, 860);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure Aiujfkcfjseid!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putString("hello future en yes can you make that item like a ",
				"magic apple or something that when you eat it at");
		entity.getPersistentData().putString("positive buiild heiight in ascendia it sends you to",
				"a \"true heaven\" dimension for 1.1 and if you eat it");
		entity.getPersistentData().putString("it at negative build height in nowhere it sends yo", "u to a \"true hell\" dimension for 1.1");
		entity.getPersistentData().putString("as well as some way to get to a \"moon\"/planet", "dimension bc it'd be cool lol");
	}
}
