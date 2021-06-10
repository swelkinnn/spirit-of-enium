package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.RegistryKey;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.network.play.server.SPlayerAbilitiesPacket;
import net.minecraft.network.play.server.SPlaySoundEventPacket;
import net.minecraft.network.play.server.SPlayEntityEffectPacket;
import net.minecraft.network.play.server.SChangeGameStatePacket;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.world.DimesionStackGameRule;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;
import java.util.HashMap;

@SoeModElements.ModElement.Tag
public class DimensionstackProcedure extends SoeModElements.ModElement {
	public DimensionstackProcedure(SoeModElements instance) {
		super(instance, 923);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure Dimensionstack!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				SoeMod.LOGGER.warn("Failed to load dependency y for procedure Dimensionstack!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SoeMod.LOGGER.warn("Failed to load dependency world for procedure Dimensionstack!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world.getWorldInfo().getGameRulesInstance().getBoolean(DimesionStackGameRule.gamerule)) == (true))) {
			if (((entity.world.getDimensionKey()) == (RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("soe:tainted_end"))))) {
				if ((y <= (-5))) {
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
							RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY,
									new ResourceLocation("soe:tainted_end"));
							ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
							if (nextWorld != null) {
								((ServerPlayerEntity) _ent).connection
										.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
								((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(),
										nextWorld.getSpawnPoint().getY() + 1, nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw, _ent.rotationPitch);
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
								for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent).getActivePotionEffects()) {
									((ServerPlayerEntity) _ent).connection
											.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
								}
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
							}
						}
					}
				} else if ((y >= 240)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LEVITATION, (int) 60, (int) 1));
				} else if ((y >= 256)) {
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
							RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY,
									new ResourceLocation("soe:tainted_nowhere_d"));
							ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
							if (nextWorld != null) {
								((ServerPlayerEntity) _ent).connection
										.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
								((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(),
										nextWorld.getSpawnPoint().getY() + 1, nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw, _ent.rotationPitch);
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
								for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent).getActivePotionEffects()) {
									((ServerPlayerEntity) _ent).connection
											.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
								}
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
							}
						}
					}
				}
			}
			if (((entity.world.getDimensionKey()) == (RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("soe:tainted_end"))))) {
				if ((y <= (-5))) {
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
							RegistryKey<World> destinationType = World.OVERWORLD;
							ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
							if (nextWorld != null) {
								((ServerPlayerEntity) _ent).connection
										.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
								((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(),
										nextWorld.getSpawnPoint().getY() + 1, nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw, _ent.rotationPitch);
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
								for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent).getActivePotionEffects()) {
									((ServerPlayerEntity) _ent).connection
											.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
								}
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
							}
						}
					}
				} else if ((y >= 240)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LEVITATION, (int) 60, (int) 1));
				} else if ((y >= 256)) {
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
							RegistryKey<World> destinationType = World.THE_END;
							ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
							if (nextWorld != null) {
								((ServerPlayerEntity) _ent).connection
										.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
								((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(),
										nextWorld.getSpawnPoint().getY() + 1, nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw, _ent.rotationPitch);
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
								for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent).getActivePotionEffects()) {
									((ServerPlayerEntity) _ent).connection
											.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
								}
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
							}
						}
					}
				}
			}
			if (((entity.world.getDimensionKey()) == (World.OVERWORLD))) {
				if ((y <= (-5))) {
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
							RegistryKey<World> destinationType = World.THE_NETHER;
							ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
							if (nextWorld != null) {
								((ServerPlayerEntity) _ent).connection
										.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
								((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(),
										nextWorld.getSpawnPoint().getY() + 1, nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw, _ent.rotationPitch);
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
								for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent).getActivePotionEffects()) {
									((ServerPlayerEntity) _ent).connection
											.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
								}
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
							}
						}
					}
				} else if ((y >= 240)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LEVITATION, (int) 60, (int) 1));
				} else if ((y >= 256)) {
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
							RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY,
									new ResourceLocation("soe:tainted_end"));
							ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
							if (nextWorld != null) {
								((ServerPlayerEntity) _ent).connection
										.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
								((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(),
										nextWorld.getSpawnPoint().getY() + 1, nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw, _ent.rotationPitch);
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
								for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent).getActivePotionEffects()) {
									((ServerPlayerEntity) _ent).connection
											.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
								}
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
							}
						}
					}
				}
			}
			if (((entity.world.getDimensionKey()) == (World.THE_NETHER))) {
				if ((y <= (-5))) {
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
							RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("soe:nowhere"));
							ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
							if (nextWorld != null) {
								((ServerPlayerEntity) _ent).connection
										.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
								((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(),
										nextWorld.getSpawnPoint().getY() + 1, nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw, _ent.rotationPitch);
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
								for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent).getActivePotionEffects()) {
									((ServerPlayerEntity) _ent).connection
											.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
								}
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
							}
						}
					}
				} else if ((y >= 240)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LEVITATION, (int) 60, (int) 1));
				} else if ((y >= 256)) {
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
							RegistryKey<World> destinationType = World.OVERWORLD;
							ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
							if (nextWorld != null) {
								((ServerPlayerEntity) _ent).connection
										.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
								((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(),
										nextWorld.getSpawnPoint().getY() + 1, nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw, _ent.rotationPitch);
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
								for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent).getActivePotionEffects()) {
									((ServerPlayerEntity) _ent).connection
											.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
								}
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
							}
						}
					}
				}
			}
			if (((entity.world.getDimensionKey()) == (RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("soe:nowhere"))))) {
				if ((y <= (-5))) {
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
							RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY,
									new ResourceLocation("soe:tainted_nowhere_d"));
							ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
							if (nextWorld != null) {
								((ServerPlayerEntity) _ent).connection
										.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
								((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(),
										nextWorld.getSpawnPoint().getY() + 1, nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw, _ent.rotationPitch);
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
								for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent).getActivePotionEffects()) {
									((ServerPlayerEntity) _ent).connection
											.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
								}
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
							}
						}
					}
				} else if ((y >= 240)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LEVITATION, (int) 60, (int) 1));
				} else if ((y >= 256)) {
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
							RegistryKey<World> destinationType = World.THE_NETHER;
							ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
							if (nextWorld != null) {
								((ServerPlayerEntity) _ent).connection
										.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
								((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(),
										nextWorld.getSpawnPoint().getY() + 1, nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw, _ent.rotationPitch);
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
								for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent).getActivePotionEffects()) {
									((ServerPlayerEntity) _ent).connection
											.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
								}
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
							}
						}
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
