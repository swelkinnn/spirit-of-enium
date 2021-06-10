
package net.mcreator.genuinelytoomanyadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.LivingEntity;
import net.minecraft.block.BlockState;

import net.mcreator.genuinelytoomanyadditions.procedures.PlagueCureLivingEntityIsHitWithItemProcedure;
import net.mcreator.genuinelytoomanyadditions.itemgroup.GMTToolsAndWeaponsItemGroup;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;

import java.util.Map;
import java.util.HashMap;

@SoeModElements.ModElement.Tag
public class PlagueCureItem extends SoeModElements.ModElement {
	@ObjectHolder("soe:plague_cure")
	public static final Item block = null;
	public PlagueCureItem(SoeModElements instance) {
		super(instance, 770);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(GMTToolsAndWeaponsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("plague_cure");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
			boolean retval = super.hitEntity(itemstack, entity, sourceentity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			World world = entity.world;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("itemstack", itemstack);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				PlagueCureLivingEntityIsHitWithItemProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
