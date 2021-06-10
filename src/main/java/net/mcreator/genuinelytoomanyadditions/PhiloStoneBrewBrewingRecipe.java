
package net.mcreator.genuinelytoomanyadditions;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;

import net.mcreator.genuinelytoomanyadditions.item.PhilosophersStoneItem;
import net.mcreator.genuinelytoomanyadditions.item.CitrinitasStoneItem;
import net.mcreator.genuinelytoomanyadditions.item.AlchemicalMercuryItem;

@SoeModElements.ModElement.Tag
public class PhiloStoneBrewBrewingRecipe extends SoeModElements.ModElement {
	public PhiloStoneBrewBrewingRecipe(SoeModElements instance) {
		super(instance, 857);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(new ItemStack(CitrinitasStoneItem.block, (int) (1))),
				Ingredient.fromStacks(new ItemStack(AlchemicalMercuryItem.block, (int) (1))), new ItemStack(PhilosophersStoneItem.block, (int) (1)));
	}
}
