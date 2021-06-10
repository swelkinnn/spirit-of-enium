package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.potion.VoidSicknessPotion;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;
import java.util.Collection;

@SoeModElements.ModElement.Tag
public class VoidTempDisplayOverlayIngameProcedure extends SoeModElements.ModElement {
	public VoidTempDisplayOverlayIngameProcedure(SoeModElements instance) {
		super(instance, 921);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure VoidTempDisplayOverlayIngame!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		return (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == VoidSicknessPotion.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity));
	}
}
