
package net.mcreator.genuinelytoomanyadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.genuinelytoomanyadditions.itemgroup.GTMFoodItemGroup;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;

@SoeModElements.ModElement.Tag
public class RoastCarrotItem extends SoeModElements.ModElement {
	@ObjectHolder("soe:roast_carrot")
	public static final Item block = null;
	public RoastCarrotItem(SoeModElements instance) {
		super(instance, 613);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(GTMFoodItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(5).saturation(5f).build()));
			setRegistryName("roast_carrot");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
