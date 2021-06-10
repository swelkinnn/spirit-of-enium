
package net.mcreator.genuinelytoomanyadditions.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.network.IPacket;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.block.material.Material;

import net.mcreator.genuinelytoomanyadditions.itemgroup.GTMMobsItemGroup;
import net.mcreator.genuinelytoomanyadditions.entity.renderer.PigmanWarriorRenderer;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;

@SoeModElements.ModElement.Tag
public class PigmanWarriorEntity extends SoeModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new)
			.size(0.6f, 1.8f)).build("pigman_warrior").setRegistryName("pigman_warrior");
	public PigmanWarriorEntity(SoeModElements instance) {
		super(instance, 124);
		FMLJavaModLoadingContext.get().getModEventBus().register(new PigmanWarriorRenderer.ModelRegisterHandler());
		FMLJavaModLoadingContext.get().getModEventBus().register(new EntityAttributesRegisterHandler());
		MinecraftForge.EVENT_BUS.register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -13108, -3407872, new Item.Properties().group(GTMMobsItemGroup.tab))
				.setRegistryName("pigman_warrior_spawn_egg"));
	}

	@SubscribeEvent
	public void addFeatureToBiomes(BiomeLoadingEvent event) {
		boolean biomeCriteria = false;
		if (new ResourceLocation("soe:resting_grounds").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("plains").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("desert").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("mountains").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("forest").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("taiga").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("swamp").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("snowy_tundra").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("snowy_mountains").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("beach").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("desert_hills").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("wooded_hills").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("taiga_hills").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("mountain_edge").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("jungle").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("jungle_hills").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("jungle_edge").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("stone_shore").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("birch_forest").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("birch_forest_hills").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("dark_forest").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("snowy_taiga").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("snowy_taiga_hills").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("giant_tree_taiga").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("giant_tree_taiga_hills").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("wooded_mountains").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("savanna").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("savanna_plateau").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("badlands").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("wooded_badlands_plateau").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("badlands_plateau").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("sunflower_plains").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("desert_lakes").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("gravelly_mountains").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("flower_forest").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("taiga_mountains").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("swamp_hills").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("ice_spikes").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("modified_jungle").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("modified_jungle_edge").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("tall_birch_forest").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("tall_birch_hills").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("dark_forest_hills").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("snowy_taiga_mountains").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("giant_spruce_taiga").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("giant_spruce_taiga_hills").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("modified_gravelly_mountains").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("shattered_savanna").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("shattered_savanna_plateau").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("eroded_badlands").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("modified_wooded_badlands_plateau").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("modified_badlands_plateau").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("bamboo_jungle").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("bamboo_jungle_hills").equals(event.getName()))
			biomeCriteria = true;
		if (!biomeCriteria)
			return;
		event.getSpawns().getSpawner(EntityClassification.CREATURE).add(new MobSpawnInfo.Spawners(entity, 2, 1, 1));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		EntitySpawnPlacementRegistry.register(entity, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos,
						random) -> (world.getBlockState(pos.down()).getMaterial() == Material.ORGANIC && world.getLightSubtracted(pos, 0) > 8));
	}
	private static class EntityAttributesRegisterHandler {
		@SubscribeEvent
		public void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
			AttributeModifierMap.MutableAttribute ammma = MobEntity.func_233666_p_();
			ammma = ammma.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.5);
			ammma = ammma.createMutableAttribute(Attributes.MAX_HEALTH, 10);
			ammma = ammma.createMutableAttribute(Attributes.ARMOR, 0);
			ammma = ammma.createMutableAttribute(Attributes.ATTACK_DAMAGE, 5);
			event.put(entity, ammma.create());
		}
	}

	public static class CustomEntity extends CreatureEntity {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 0;
			setNoAI(false);
			this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.IRON_SWORD, (int) (1)));
			this.setItemStackToSlot(EquipmentSlotType.HEAD, new ItemStack(Items.LEATHER_HELMET, (int) (1)));
			this.setItemStackToSlot(EquipmentSlotType.CHEST, new ItemStack(Items.LEATHER_CHESTPLATE, (int) (1)));
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false));
			this.goalSelector.addGoal(2, new RandomWalkingGoal(this, 1));
			this.targetSelector.addGoal(3, new HurtByTargetGoal(this).setCallsForHelp(this.getClass()));
			this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
			this.goalSelector.addGoal(5, new SwimGoal(this));
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEFINED;
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.pig.ambient"));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.pig.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.pig.death"));
		}
	}
}
