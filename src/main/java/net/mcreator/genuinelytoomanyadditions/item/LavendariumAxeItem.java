
package net.mcreator.genuinelytoomanyadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.genuinelytoomanyadditions.itemgroup.GMTToolsAndWeaponsItemGroup;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;

@SoeModElements.ModElement.Tag
public class LavendariumAxeItem extends SoeModElements.ModElement {
	@ObjectHolder("soe:lavendarium_axe")
	public static final Item block = null;
	public LavendariumAxeItem(SoeModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 300;
			}

			public float getEfficiency() {
				return 7.5f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(LavendariumMeshItem.block, (int) (1)),
						new ItemStack(LavendariumIngotItem.block, (int) (1)), new ItemStack(LavendariumNuggetItem.block, (int) (1)));
			}
		}, 1, -3.25f, new Item.Properties().group(GMTToolsAndWeaponsItemGroup.tab)) {
		}.setRegistryName("lavendarium_axe"));
	}
}
