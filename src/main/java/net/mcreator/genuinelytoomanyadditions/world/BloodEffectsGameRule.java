package net.mcreator.genuinelytoomanyadditions.world;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.GameRules;

import net.mcreator.genuinelytoomanyadditions.SoeModElements;

import java.lang.reflect.Method;

@SoeModElements.ModElement.Tag
public class BloodEffectsGameRule extends SoeModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.BooleanValue> gamerule = GameRules.register("bloodEffects", GameRules.Category.MISC,
			create(true));
	public BloodEffectsGameRule(SoeModElements instance) {
		super(instance, 864);
	}

	public static GameRules.RuleType<GameRules.BooleanValue> create(boolean defaultValue) {
		try {
			Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.BooleanValue.class, "func_223568_b", boolean.class);
			createGameruleMethod.setAccessible(true);
			return (GameRules.RuleType<GameRules.BooleanValue>) createGameruleMethod.invoke(null, defaultValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
