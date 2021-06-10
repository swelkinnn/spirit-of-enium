package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;

@SoeModElements.ModElement.Tag
public class PigmanTradesmanOnInitialEntitySpawnProcedure extends SoeModElements.ModElement {
	public PigmanTradesmanOnInitialEntitySpawnProcedure(SoeModElements instance) {
		super(instance, 947);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure PigmanTradesmanOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SoeMod.LOGGER.warn("Failed to load dependency world for procedure PigmanTradesmanOnInitialEntitySpawn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if ((!(world.isRemote()))) {
			entity.getPersistentData().putDouble("randomitemtrade1", Math.random());
			if (((entity.getPersistentData().getDouble("tradeitem1")) >= 0.83)) {
				entity.getPersistentData().putDouble("tradeitem1", 1);
			} else if (((entity.getPersistentData().getDouble("tradeitem1")) >= 0.664)) {
				entity.getPersistentData().putDouble("tradeitem1", 2);
			} else if (((entity.getPersistentData().getDouble("tradeitem1")) >= 0.498)) {
				entity.getPersistentData().putDouble("tradeitem1", 3);
			} else if (((entity.getPersistentData().getDouble("tradeitem1")) >= 0.332)) {
				entity.getPersistentData().putDouble("tradeitem1", 4);
			} else if (((entity.getPersistentData().getDouble("tradeitem1")) >= 0.664)) {
				entity.getPersistentData().putDouble("tradeitem1", 5);
			} else if (((entity.getPersistentData().getDouble("tradeitem1")) >= 0.166)) {
				entity.getPersistentData().putDouble("tradeitem1", 6);
			}
			entity.getPersistentData().putDouble("randomitemtrade2", Math.random());
			if (((entity.getPersistentData().getDouble("tradeitem2")) >= 0.83)) {
				entity.getPersistentData().putDouble("tradeitem2", 1);
			} else if (((entity.getPersistentData().getDouble("tradeitem2")) >= 0.664)) {
				entity.getPersistentData().putDouble("tradeitem2", 2);
			} else if (((entity.getPersistentData().getDouble("tradeitem2")) >= 0.498)) {
				entity.getPersistentData().putDouble("tradeitem2", 3);
			} else if (((entity.getPersistentData().getDouble("tradeitem2")) >= 0.332)) {
				entity.getPersistentData().putDouble("tradeitem2", 4);
			} else if (((entity.getPersistentData().getDouble("tradeitem1")) >= 0.664)) {
				entity.getPersistentData().putDouble("tradeitem2", 5);
			} else if (((entity.getPersistentData().getDouble("tradeitem2")) >= 0.166)) {
				entity.getPersistentData().putDouble("tradeitem2", 6);
			}
			entity.getPersistentData().putDouble("randomitemtrade2", Math.random());
			if (((entity.getPersistentData().getDouble("tradeitem3")) >= 0.83)) {
				entity.getPersistentData().putDouble("tradeitem3", 1);
			} else if (((entity.getPersistentData().getDouble("tradeitem3")) >= 0.664)) {
				entity.getPersistentData().putDouble("tradeitem3", 2);
			} else if (((entity.getPersistentData().getDouble("tradeitem3")) >= 0.498)) {
				entity.getPersistentData().putDouble("tradeitem3", 3);
			} else if (((entity.getPersistentData().getDouble("tradeitem3")) >= 0.332)) {
				entity.getPersistentData().putDouble("tradeitem3", 4);
			} else if (((entity.getPersistentData().getDouble("tradeitem3")) >= 0.664)) {
				entity.getPersistentData().putDouble("tradeitem3", 5);
			} else if (((entity.getPersistentData().getDouble("tradeitem3")) >= 0.166)) {
				entity.getPersistentData().putDouble("tradeitem3", 6);
			}
			entity.getPersistentData().putDouble("randomtradecount1", Math.random());
			if (((entity.getPersistentData().getDouble("tradecount1")) >= 0.75)) {
				entity.getPersistentData().putDouble("tradecount1", 2);
			} else if (((entity.getPersistentData().getDouble("tradecount1")) >= 0.5)) {
				entity.getPersistentData().putDouble("tradecount1", 4);
			} else if (((entity.getPersistentData().getDouble("tradecount1")) >= 0.25)) {
				entity.getPersistentData().putDouble("tradecount1", 8);
			} else if (((entity.getPersistentData().getDouble("tradecount1")) >= 0)) {
				entity.getPersistentData().putDouble("tradecount1", 16);
			}
			entity.getPersistentData().putDouble("randomtradecount2", Math.random());
			if (((entity.getPersistentData().getDouble("tradecount2")) >= 0.75)) {
				entity.getPersistentData().putDouble("tradecount2", 2);
			} else if (((entity.getPersistentData().getDouble("tradecount2")) >= 0.5)) {
				entity.getPersistentData().putDouble("tradecount2", 4);
			} else if (((entity.getPersistentData().getDouble("tradecount2")) >= 0.25)) {
				entity.getPersistentData().putDouble("tradecount2", 8);
			} else if (((entity.getPersistentData().getDouble("tradecount2")) >= 0)) {
				entity.getPersistentData().putDouble("tradecount2", 16);
			}
			entity.getPersistentData().putDouble("randomtradecount3", Math.random());
			if (((entity.getPersistentData().getDouble("tradecount3")) >= 0.75)) {
				entity.getPersistentData().putDouble("tradecount3", 2);
			} else if (((entity.getPersistentData().getDouble("tradecount3")) >= 0.5)) {
				entity.getPersistentData().putDouble("tradecount3", 4);
			} else if (((entity.getPersistentData().getDouble("tradecount3")) >= 0.25)) {
				entity.getPersistentData().putDouble("tradecount3", 8);
			} else if (((entity.getPersistentData().getDouble("tradecount3")) >= 0)) {
				entity.getPersistentData().putDouble("tradecount3", 16);
			}
		}
	}
}
