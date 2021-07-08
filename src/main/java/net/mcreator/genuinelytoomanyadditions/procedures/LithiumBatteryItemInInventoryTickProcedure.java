package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerDestroyItemEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;

import net.mcreator.genuinelytoomanyadditions.item.LithiumBatteryItem;
import net.mcreator.genuinelytoomanyadditions.item.BurntOutLithiumBatteryItem;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.Map;
import java.util.HashMap;

@SoeModElements.ModElement.Tag
public class LithiumBatteryItemInInventoryTickProcedure extends SoeModElements.ModElement {
	public LithiumBatteryItemInInventoryTickProcedure(SoeModElements instance) {
		super(instance, 977);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				SoeMod.LOGGER.warn("Failed to load dependency itemstack for procedure LithiumBatteryItemInInventoryTick!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (((itemstack).getItem() == new ItemStack(LithiumBatteryItem.block, (int) (1)).getItem())) {
			{
				ItemStack _isc = (itemstack);
				final ItemStack _setstack = new ItemStack(BurntOutLithiumBatteryItem.block, (int) (1));
				final int _sltid = (int) (0);
				_setstack.setCount((int) 1);
				_isc.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					if (capability instanceof IItemHandlerModifiable) {
						((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
					}
				});
			}
		}
	}

	@SubscribeEvent
	public void onItemDestroyed(PlayerDestroyItemEvent event) {
		Entity entity = event.getPlayer();
		double i = entity.getPosX();
		double j = entity.getPosY();
		double k = entity.getPosZ();
		ItemStack itemstack = event.getOriginal();
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", entity.world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		dependencies.put("itemstack", itemstack);
		this.executeProcedure(dependencies);
	}
}
