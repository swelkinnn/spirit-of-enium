
package net.mcreator.genuinelytoomanyadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.genuinelytoomanyadditions.itemgroup.GTMMaterialsItemGroup;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;

@SoeModElements.ModElement.Tag
public class SasquatchFurItem extends SoeModElements.ModElement {
	@ObjectHolder("soe:sasquatch_fur")
	public static final Item block = null;
	public SasquatchFurItem(SoeModElements instance) {
		super(instance, 108);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(GTMMaterialsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("sasquatch_fur");
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
	}
}
