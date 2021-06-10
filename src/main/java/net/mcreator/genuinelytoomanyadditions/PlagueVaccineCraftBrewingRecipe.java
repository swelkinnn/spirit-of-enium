
package net.mcreator.genuinelytoomanyadditions;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.genuinelytoomanyadditions.item.PlagueFleshItem;
import net.mcreator.genuinelytoomanyadditions.item.PlagueCureItem;

@SoeModElements.ModElement.Tag
public class PlagueVaccineCraftBrewingRecipe extends SoeModElements.ModElement {
	public PlagueVaccineCraftBrewingRecipe(SoeModElements instance) {
		super(instance, 824);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(new ItemStack(Items.EXPERIENCE_BOTTLE, (int) (1))),
				Ingredient.fromStacks(new ItemStack(PlagueFleshItem.block, (int) (1))), new ItemStack(PlagueCureItem.block, (int) (1)));
	}
}
