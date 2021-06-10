package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.Util;
import net.minecraft.server.MinecraftServer;

import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;

@SoeModElements.ModElement.Tag
public class VGKGrimmOnInitialEntitySpawnProcedure extends SoeModElements.ModElement {
	public VGKGrimmOnInitialEntitySpawnProcedure(SoeModElements instance) {
		super(instance, 433);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				SoeMod.LOGGER.warn("Failed to load dependency world for procedure VGKGrimmOnInitialEntitySpawn!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent("The Violet GodKing has awoken. May mercy be upon all."),
						ChatType.SYSTEM, Util.DUMMY_UUID);
		}
	}
}
