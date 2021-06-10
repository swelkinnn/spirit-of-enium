package net.mcreator.genuinelytoomanyadditions.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.genuinelytoomanyadditions.item.RubyItem;
import net.mcreator.genuinelytoomanyadditions.item.RoastCarrotItem;
import net.mcreator.genuinelytoomanyadditions.item.RawSteelItem;
import net.mcreator.genuinelytoomanyadditions.block.RoseBlock;
import net.mcreator.genuinelytoomanyadditions.block.PebblesBlock;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;
import net.mcreator.genuinelytoomanyadditions.SoeMod;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

@SoeModElements.ModElement.Tag
public class PigmanTradesmanTradingProcedure extends SoeModElements.ModElement {
	public PigmanTradesmanTradingProcedure(SoeModElements instance) {
		super(instance, 949);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				SoeMod.LOGGER.warn("Failed to load dependency entity for procedure PigmanTradesmanTrading!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity.getPersistentData().getDouble("playertradepage")) == 1)) {
			if (((new Object() {
				public ItemStack getItemStack(int sltid) {
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								return ((Slot) ((Map) invobj).get(sltid)).getStack();
							}
						}
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) (0))).getItem() == new ItemStack(RubyItem.block, (int) (1)).getItem())) {
				if (((entity.getPersistentData().getDouble("playertradeitem1")) == 1)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Items.CARROT, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("randomtradecount1")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playertradeitem1")) == 2)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(PebblesBlock.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("randomtradecount1")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playertradeitem1")) == 3)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(RoastCarrotItem.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("randomtradecount1")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playertradeitem1")) == 4)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(RawSteelItem.block, (int) (1));
								_setstack.setCount((int) 1);
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playertradeitem1")) == 5)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(RoseBlock.block, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("randomtradecount1")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				} else if (((entity.getPersistentData().getDouble("playertradeitem1")) == 6)) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(Blocks.SUGAR_CANE, (int) (1));
								_setstack.setCount((int) (entity.getPersistentData().getDouble("randomtradecount1")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				}
			} else {
				{
					Entity _ent = entity;
					if (_ent instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) _ent).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								((Slot) ((Map) invobj).get((int) (1)))
										.decrStackSize((int) ((entity.getPersistentData().getDouble("randomtradecount1"))));
								_current.detectAndSendChanges();
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
