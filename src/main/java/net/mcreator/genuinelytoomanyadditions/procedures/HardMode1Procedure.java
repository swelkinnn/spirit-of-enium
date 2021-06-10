package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.AdvancementEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.Util;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.advancements.Advancement;

import net.mcreator.genuinelytoomanyadditions.SoeModVariables;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;
import java.util.HashMap;

@SoeModElements.ModElement.Tag
public class HardMode1Procedure extends SoeModElements.ModElement {
	public HardMode1Procedure(SoeModElements instance) {
		super(instance, 724);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("advancement") == null) {
			if (!dependencies.containsKey("advancement"))
				SoeMod.LOGGER.warn("Failed to load dependency advancement for procedure HardMode1!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SoeMod.LOGGER.warn("Failed to load dependency world for procedure HardMode1!");
			return;
		}
		Advancement advancement = (Advancement) dependencies.get("advancement");
		IWorld world = (IWorld) dependencies.get("world");
		if (((world instanceof World && ((World) world).getServer() != null
				? ((World) world).getServer().getAdvancementManager().getAdvancement(new ResourceLocation("minecraft:story/enter_the_nether"))
						.equals(advancement)
				: false) && ((SoeModVariables.MapVariables.get(world).HardMode) == (false)))) {
			SoeModVariables.MapVariables.get(world).HardMode = (boolean) (true);
			SoeModVariables.MapVariables.get(world).syncData(world);
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(
							new StringTextComponent("\u00A7cThe Gate to Nether has been opened, and with it so has its influence..."),
							ChatType.SYSTEM, Util.DUMMY_UUID);
			}
		}
	}

	@SubscribeEvent
	public void onAdvancement(AdvancementEvent event) {
		PlayerEntity entity = event.getPlayer();
		double i = entity.getPosX();
		double j = entity.getPosY();
		double k = entity.getPosZ();
		Advancement advancement = event.getAdvancement();
		World world = entity.world;
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("advancement", advancement);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
