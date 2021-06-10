
package net.mcreator.genuinelytoomanyadditions;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.genuinelytoomanyadditions.item.PlaguedTonicItem;
import net.mcreator.genuinelytoomanyadditions.item.EnvyShardItem;

@SoeModElements.ModElement.Tag
public class TestBrewingRecipe extends SoeModElements.ModElement {
	public TestBrewingRecipe(SoeModElements instance) {
		super(instance, 655);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(new ItemStack(Items.GLASS_BOTTLE, (int) (1))),
				Ingredient.fromStacks(new ItemStack(EnvyShardItem.block, (int) (1))), new ItemStack(PlaguedTonicItem.block, (int) (1)));
	}
}
