package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.entity.VioletBoarEntity;
import net.mcreator.genuinelytoomanyadditions.entity.PigclopsEntity;
import net.mcreator.genuinelytoomanyadditions.SoeModVariables;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;
import java.util.HashMap;

@SoeModElements.ModElement.Tag
public class PigmanRep3Procedure extends SoeModElements.ModElement {
	public PigmanRep3Procedure(SoeModElements instance) {
		super(instance, 935);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure PigmanRep3!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				SoeMod.LOGGER.warn("Failed to load dependency sourceentity for procedure PigmanRep3!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SoeMod.LOGGER.warn("Failed to load dependency world for procedure PigmanRep3!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		IWorld world = (IWorld) dependencies.get("world");
		if (((sourceentity instanceof PigclopsEntity.CustomEntity)
				|| ((sourceentity instanceof VioletBoarEntity.CustomEntity) && (entity instanceof PlayerEntity)))) {
			if (((SoeModVariables.MapVariables.get(world).HardMode) == (true))) {
				{
					double _setval = (double) (((entity.getCapability(SoeModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new SoeModVariables.PlayerVariables())).PigmanRep) - 15);
					entity.getCapability(SoeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PigmanRep = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = (double) (((entity.getCapability(SoeModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new SoeModVariables.PlayerVariables())).PigmanRep) - 10);
					entity.getCapability(SoeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PigmanRep = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (((entity instanceof PigclopsEntity.CustomEntity)
				|| ((entity instanceof VioletBoarEntity.CustomEntity) && (sourceentity instanceof PlayerEntity)))) {
			if (((SoeModVariables.MapVariables.get(world).HardMode) == (true))) {
				{
					double _setval = (double) (((entity.getCapability(SoeModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new SoeModVariables.PlayerVariables())).PigmanRep) + 15);
					entity.getCapability(SoeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PigmanRep = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else {
				{
					double _setval = (double) (((entity.getCapability(SoeModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new SoeModVariables.PlayerVariables())).PigmanRep) + 10);
					entity.getCapability(SoeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.PigmanRep = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}

	@SubscribeEvent
	public void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			Entity sourceentity = event.getSource().getTrueSource();
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			World world = entity.world;
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("sourceentity", sourceentity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
