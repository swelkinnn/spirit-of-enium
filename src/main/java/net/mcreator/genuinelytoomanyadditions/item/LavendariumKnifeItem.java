
package net.mcreator.genuinelytoomanyadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.genuinelytoomanyadditions.itemgroup.GMTToolsAndWeaponsItemGroup;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;

@SoeModElements.ModElement.Tag
public class LavendariumKnifeItem extends SoeModElements.ModElement {
	@ObjectHolder("soe:lavendarium_knife")
	public static final Item block = null;
	public LavendariumKnifeItem(SoeModElements instance) {
		super(instance, 21);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 200;
			}

			public float getEfficiency() {
				return 6.5f;
			}

			public float getAttackDamage() {
				return -1.5f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(LavendariumIngotItem.block, (int) (1)),
						new ItemStack(LavendariumMeshItem.block, (int) (1)));
			}
		}, 3, 16f, new Item.Properties().group(GMTToolsAndWeaponsItemGroup.tab)) {
		}.setRegistryName("lavendarium_knife"));
	}
}
