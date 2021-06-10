package net.mcreator.genuinelytoomanyadditions.world;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.GameRules;

import net.mcreator.genuinelytoomanyadditions.SoeModElements;

import java.lang.reflect.Method;

@SoeModElements.ModElement.Tag
public class AncientForestLostGameRule extends SoeModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.BooleanValue> gamerule = GameRules.register("ancientForestLost", GameRules.Category.SPAWNING,
			create(true));
	public AncientForestLostGameRule(SoeModElements instance) {
		super(instance, 916);
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
