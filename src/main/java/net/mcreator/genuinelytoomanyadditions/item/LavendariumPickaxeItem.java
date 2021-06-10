
package net.mcreator.genuinelytoomanyadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.genuinelytoomanyadditions.itemgroup.GMTToolsAndWeaponsItemGroup;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;

import java.util.List;

@SoeModElements.ModElement.Tag
public class LavendariumPickaxeItem extends SoeModElements.ModElement {
	@ObjectHolder("soe:lavendarium_pickaxe")
	public static final Item block = null;
	public LavendariumPickaxeItem(SoeModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 300;
			}

			public float getEfficiency() {
				return 7.5f;
			}

			public float getAttackDamage() {
				return 3.5f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(LavendariumMeshItem.block, (int) (1)),
						new ItemStack(LavendariumNuggetItem.block, (int) (1)), new ItemStack(LavendariumIngotItem.block, (int) (1)));
			}
		}, 1, -2.5999999999999999f, new Item.Properties().group(GMTToolsAndWeaponsItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("\u00A77Lightweight mining"));
			}
		}.setRegistryName("lavendarium_pickaxe"));
	}
}
