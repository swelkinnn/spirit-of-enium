
package net.mcreator.genuinelytoomanyadditions;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.genuinelytoomanyadditions.item.MercuryBottleItem;
import net.mcreator.genuinelytoomanyadditions.item.AlchemicalMercuryItem;

@SoeModElements.ModElement.Tag
public class MercuryBottleAlchemisizingBrewingRecipe extends SoeModElements.ModElement {
	public MercuryBottleAlchemisizingBrewingRecipe(SoeModElements instance) {
		super(instance, 852);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(new ItemStack(MercuryBottleItem.block, (int) (1))),
				Ingredient.fromStacks(new ItemStack(Items.GOLD_INGOT, (int) (1))), new ItemStack(AlchemicalMercuryItem.block, (int) (1)));
	}
}
