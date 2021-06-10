
package net.mcreator.genuinelytoomanyadditions.world.biome;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.biome.SoundAdditionsAmbience;
import net.minecraft.world.biome.ParticleEffectAmbience;
import net.minecraft.world.biome.MoodSoundAmbience;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.RegistryKey;
import net.minecraft.client.audio.BackgroundMusicSelector;

import net.mcreator.genuinelytoomanyadditions.particle.NowhereSoulParticle;
import net.mcreator.genuinelytoomanyadditions.block.AbyssBlock;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;

@SoeModElements.ModElement.Tag
public class TaintedNowhereBiome extends SoeModElements.ModElement {
	public static Biome biome;
	public TaintedNowhereBiome(SoeModElements instance) {
		super(instance, 909);
		FMLJavaModLoadingContext.get().getModEventBus().register(new BiomeRegisterHandler());
	}
	private static class BiomeRegisterHandler {
		@SubscribeEvent
		public void registerBiomes(RegistryEvent.Register<Biome> event) {
			if (biome == null) {
				BiomeAmbience effects = new BiomeAmbience.Builder().setFogColor(-16777216).setWaterColor(-16777216).setWaterFogColor(-16777216)
						.withSkyColor(-16777216).withFoliageColor(-16777216).withGrassColor(-16777216)
						.setAmbientSound((net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("soe:abysswind")))
						.setMoodSound(new MoodSoundAmbience(
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("soe:abysswind")), 6000, 8,
								2))
						.setAdditionsSound(new SoundAdditionsAmbience(
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("soe:abysswind")),
								0.0111D))
						.setMusic(new BackgroundMusicSelector(
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("soe:abysswind")), 12000,
								24000, true))
						.setParticle(new ParticleEffectAmbience(NowhereSoulParticle.particle, 0.005f)).build();
				BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder()
						.withSurfaceBuilder(SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(AbyssBlock.block.getDefaultState(),
								AbyssBlock.block.getDefaultState(), AbyssBlock.block.getDefaultState())));
				DefaultBiomeFeatures.withCavesAndCanyons(biomeGenerationSettings);
				MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder().isValidSpawnBiomeForPlayer();
				biome = new Biome.Builder().precipitation(Biome.RainType.RAIN).category(Biome.Category.ICY).depth(0.1f).scale(0.2f).temperature(0.5f)
						.downfall(0.5f).setEffects(effects).withMobSpawnSettings(mobSpawnInfo.copy())
						.withGenerationSettings(biomeGenerationSettings.build()).build();
				event.getRegistry().register(biome.setRegistryName("soe:tainted_nowhere"));
			}
		}
	}
	@Override
	public void init(FMLCommonSetupEvent event) {
		BiomeDictionary.addTypes(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, WorldGenRegistries.BIOME.getKey(biome)),
				BiomeDictionary.Type.WASTELAND, BiomeDictionary.Type.VOID, BiomeDictionary.Type.COLD, BiomeDictionary.Type.SPARSE,
				BiomeDictionary.Type.SPOOKY, BiomeDictionary.Type.DEAD, BiomeDictionary.Type.MAGICAL);
	}
}
