package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.passive.horse.SkeletonHorseEntity;
import net.minecraft.entity.passive.StriderEntity;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.entity.passive.SnowGolemEntity;
import net.minecraft.entity.passive.GolemEntity;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.entity.monster.WitherSkeletonEntity;
import net.minecraft.entity.monster.VexEntity;
import net.minecraft.entity.monster.SpiderEntity;
import net.minecraft.entity.monster.SlimeEntity;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.entity.monster.SilverfishEntity;
import net.minecraft.entity.monster.ShulkerEntity;
import net.minecraft.entity.monster.MagmaCubeEntity;
import net.minecraft.entity.monster.GuardianEntity;
import net.minecraft.entity.monster.GhastEntity;
import net.minecraft.entity.monster.EndermiteEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.monster.ElderGuardianEntity;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.monster.CaveSpiderEntity;
import net.minecraft.entity.monster.BlazeEntity;
import net.minecraft.entity.item.minecart.SpawnerMinecartEntity;
import net.minecraft.entity.item.minecart.MinecartEntity;
import net.minecraft.entity.item.minecart.HopperMinecartEntity;
import net.minecraft.entity.item.minecart.FurnaceMinecartEntity;
import net.minecraft.entity.item.minecart.CommandBlockMinecartEntity;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.entity.item.ArmorStandEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.AreaEffectCloudEntity;

import net.mcreator.genuinelytoomanyadditions.world.BloodEffectsGameRule;
import net.mcreator.genuinelytoomanyadditions.particle.SpiderBloodParticle;
import net.mcreator.genuinelytoomanyadditions.particle.NowhereSoulParticle;
import net.mcreator.genuinelytoomanyadditions.particle.InsectBloodParticle;
import net.mcreator.genuinelytoomanyadditions.particle.InfectedBloodParticle;
import net.mcreator.genuinelytoomanyadditions.particle.HemolyphBloodParticle;
import net.mcreator.genuinelytoomanyadditions.particle.GrimmfireParticle;
import net.mcreator.genuinelytoomanyadditions.particle.GhostbloodParticle;
import net.mcreator.genuinelytoomanyadditions.particle.BloodParticle;
import net.mcreator.genuinelytoomanyadditions.entity.WraithEntity;
import net.mcreator.genuinelytoomanyadditions.entity.VioletMothEntity;
import net.mcreator.genuinelytoomanyadditions.entity.VGKGrimmEntity;
import net.mcreator.genuinelytoomanyadditions.entity.TroupeMasterGrimmEntity;
import net.mcreator.genuinelytoomanyadditions.entity.TheLostEntity;
import net.mcreator.genuinelytoomanyadditions.entity.MothmanEntity;
import net.mcreator.genuinelytoomanyadditions.entity.HuskSentryEntity;
import net.mcreator.genuinelytoomanyadditions.entity.GrimmkinMasterEntity;
import net.mcreator.genuinelytoomanyadditions.entity.GrimmchildEntity;
import net.mcreator.genuinelytoomanyadditions.entity.GrimmatureEntity;
import net.mcreator.genuinelytoomanyadditions.entity.DingusEntity;
import net.mcreator.genuinelytoomanyadditions.entity.BombeEntity;
import net.mcreator.genuinelytoomanyadditions.entity.AsmodeusEntity;
import net.mcreator.genuinelytoomanyadditions.entity.AsmodeusCloneEntity;
import net.mcreator.genuinelytoomanyadditions.entity.ArchSkeletonEntity;
import net.mcreator.genuinelytoomanyadditions.entity.ArchHeadEntity;
import net.mcreator.genuinelytoomanyadditions.entity.AbyssalRemains3Entity;
import net.mcreator.genuinelytoomanyadditions.entity.AbyssalRemains2Entity;
import net.mcreator.genuinelytoomanyadditions.entity.AbyssalRemains1Entity;
import net.mcreator.genuinelytoomanyadditions.entity.AbyssalKnightEntity;
import net.mcreator.genuinelytoomanyadditions.entity.AbaddonEntity;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;
import java.util.HashMap;

@SoeModElements.ModElement.Tag
public class BloodeffectProcedure extends SoeModElements.ModElement {
	public BloodeffectProcedure(SoeModElements instance) {
		super(instance, 797);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure Bloodeffect!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				SoeMod.LOGGER.warn("Failed to load dependency x for procedure Bloodeffect!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SoeMod.LOGGER.warn("Failed to load dependency y for procedure Bloodeffect!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				SoeMod.LOGGER.warn("Failed to load dependency z for procedure Bloodeffect!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SoeMod.LOGGER.warn("Failed to load dependency world for procedure Bloodeffect!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((world.getWorldInfo().getGameRulesInstance().getBoolean(BloodEffectsGameRule.gamerule)) == (true))
				&& (!((entity instanceof WraithEntity.CustomEntity) || ((entity instanceof HuskSentryEntity.CustomEntity)
						|| ((entity instanceof TroupeMasterGrimmEntity.CustomEntity) || ((entity instanceof GrimmchildEntity.CustomEntity)
								|| ((entity instanceof TheLostEntity.CustomEntity) || ((entity instanceof GrimmkinMasterEntity.CustomEntity)
										|| ((entity instanceof DingusEntity.CustomEntity) || ((entity instanceof VGKGrimmEntity.CustomEntity)
												|| ((entity instanceof GrimmatureEntity.CustomEntity)
														|| ((entity instanceof MothmanEntity.CustomEntity)
																|| ((entity instanceof VioletMothEntity.CustomEntity)
																		|| ((entity instanceof AbyssalKnightEntity.CustomEntity)
																				|| ((entity instanceof AsmodeusEntity.CustomEntity)
																						|| ((entity instanceof AsmodeusCloneEntity.CustomEntity)
																								|| ((entity instanceof WraithEntity.CustomEntity)
																										|| ((entity instanceof AbaddonEntity.CustomEntity)
																												|| ((entity instanceof AbyssalRemains1Entity.CustomEntity)
																														|| ((entity instanceof AbyssalRemains2Entity.CustomEntity)
																																|| ((entity instanceof AbyssalRemains3Entity.CustomEntity)
																																		|| ((entity instanceof BombeEntity.CustomEntity)
																																				|| ((entity instanceof ArchSkeletonEntity.CustomEntity)
																																						|| ((entity instanceof ArchHeadEntity.CustomEntity)
																																								|| ((entity instanceof AreaEffectCloudEntity)
																																										|| ((entity instanceof ArmorStandEntity)
																																												|| ((entity instanceof ArrowEntity)
																																														|| ((entity instanceof BeeEntity)
																																																|| ((entity instanceof BlazeEntity)
																																																		|| ((entity instanceof BoatEntity)
																																																				|| ((entity instanceof CaveSpiderEntity)
																																																						|| ((entity instanceof CreeperEntity)
																																																								|| ((entity instanceof WraithEntity.CustomEntity)
																																																										|| ((entity instanceof EndermanEntity)
																																																												|| ((entity instanceof EndermiteEntity)
																																																														|| ((entity instanceof GolemEntity)
																																																																|| ((entity instanceof GhastEntity)
																																																																		|| ((entity instanceof ElderGuardianEntity)
																																																																				|| ((entity instanceof GuardianEntity)
																																																																						|| ((entity instanceof WraithEntity.CustomEntity)
																																																																								|| ((entity instanceof MagmaCubeEntity)
																																																																										|| ((entity instanceof MinecartEntity)
																																																																												|| ((entity instanceof CommandBlockMinecartEntity)
																																																																														|| ((entity instanceof WraithEntity.CustomEntity)
																																																																																|| ((entity instanceof FurnaceMinecartEntity)
																																																																																		|| ((entity instanceof HopperMinecartEntity)
																																																																																				|| ((entity instanceof SpawnerMinecartEntity)
																																																																																						|| ((entity instanceof WraithEntity.CustomEntity)
																																																																																								|| ((entity instanceof ShulkerEntity)
																																																																																										|| ((entity instanceof WraithEntity.CustomEntity)
																																																																																												|| ((entity instanceof SilverfishEntity)
																																																																																														|| ((entity instanceof SkeletonEntity)
																																																																																																|| ((entity instanceof SkeletonHorseEntity)
																																																																																																		|| ((entity instanceof SlimeEntity)
																																																																																																				|| ((entity instanceof SnowGolemEntity)
																																																																																																						|| ((entity instanceof SpiderEntity)
																																																																																																								|| ((entity instanceof SquidEntity)
																																																																																																										|| ((entity instanceof WraithEntity.CustomEntity)
																																																																																																												|| ((entity instanceof VexEntity)
																																																																																																														|| ((entity instanceof WraithEntity.CustomEntity)
																																																																																																																|| ((entity instanceof WitherSkeletonEntity)
																																																																																																																		|| (entity instanceof StriderEntity))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(BloodParticle.particle, x, y, z, (int) 15, 0.5, 0.5, 0.5, 0);
			}
		}
		if ((entity instanceof HuskSentryEntity.CustomEntity)) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(InfectedBloodParticle.particle, x, y, z, (int) 15, 0.5, 0.5, 0.5, 0);
			}
		}
		if (((entity instanceof CaveSpiderEntity) || (entity instanceof SpiderEntity))) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(SpiderBloodParticle.particle, x, y, z, (int) 15, 0.5, 0.5, 0.5, 0);
			}
		}
		if ((entity instanceof SilverfishEntity)) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(InsectBloodParticle.particle, x, y, z, (int) 15, 0.5, 0.5, 0.5, 0);
			}
		}
		if (((entity instanceof MothmanEntity.CustomEntity) || (entity instanceof VioletMothEntity.CustomEntity))) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(HemolyphBloodParticle.particle, x, y, z, (int) 15, 0.5, 0.5, 0.5, 0);
			}
		}
		if (((entity instanceof TheLostEntity.CustomEntity)
				|| ((entity instanceof WraithEntity.CustomEntity) || (entity instanceof AsmodeusCloneEntity.CustomEntity)))) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(GhostbloodParticle.particle, x, y, z, (int) 15, 0.5, 0.5, 0.5, 0);
			}
		}
		if (((entity instanceof GrimmkinMasterEntity.CustomEntity)
				|| ((entity instanceof GrimmchildEntity.CustomEntity) || (entity instanceof TroupeMasterGrimmEntity.CustomEntity)))) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(GrimmfireParticle.particle, x, y, z, (int) 15, 0.5, 0.5, 0.5, 0);
			}
		}
		if (((entity instanceof AbyssalKnightEntity.CustomEntity) || ((entity instanceof AbyssalRemains1Entity.CustomEntity)
				|| ((entity instanceof AbyssalRemains2Entity.CustomEntity) || ((entity instanceof AbyssalRemains3Entity.CustomEntity)
						|| ((entity instanceof AsmodeusEntity.CustomEntity) || (entity instanceof AbaddonEntity.CustomEntity))))))) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(NowhereSoulParticle.particle, x, y, z, (int) 15, 0.5, 0.5, 0.5, 0);
			}
		}
	}

	@SubscribeEvent
	public void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			Entity sourceentity = event.getSource().getTrueSource();
			Entity imediatesourceentity = event.getSource().getImmediateSource();
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			double amount = event.getAmount();
			World world = entity.world;
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("amount", amount);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("sourceentity", sourceentity);
			dependencies.put("imediatesourceentity", imediatesourceentity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
