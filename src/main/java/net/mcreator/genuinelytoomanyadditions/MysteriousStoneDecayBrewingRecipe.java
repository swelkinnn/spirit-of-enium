
package net.mcreator.genuinelytoomanyadditions;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.genuinelytoomanyadditions.item.NegradoStoneItem;
import net.mcreator.genuinelytoomanyadditions.block.MysteriousStoneBlock;

@SoeModElements.ModElement.Tag
public class MysteriousStoneDecayBrewingRecipe extends SoeModElements.ModElement {
	public MysteriousStoneDecayBrewingRecipe(SoeModElements instance) {
		super(instance, 853);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(Ingredient.fromStacks(new ItemStack(MysteriousStoneBlock.block, (int) (1))),
				Ingredient.fromStacks(new ItemStack(Items.ROTTEN_FLESH, (int) (1))), new ItemStack(NegradoStoneItem.block, (int) (1)));
	}
}
