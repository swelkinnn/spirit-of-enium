
package net.mcreator.genuinelytoomanyadditions;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

@SoeModElements.ModElement.Tag
public class Xpbottlecraft2BrewingRecipe extends SoeModElements.ModElement {
	public Xpbottlecraft2BrewingRecipe(SoeModElements instance) {
		super(instance, 663);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(new ItemStack(Items.GLASS_BOTTLE, (int) (1))),
				Ingredient.fromStacks(new ItemStack(Items.LAPIS_LAZULI, (int) (1))), new ItemStack(Items.EXPERIENCE_BOTTLE, (int) (1)));
	}
}
