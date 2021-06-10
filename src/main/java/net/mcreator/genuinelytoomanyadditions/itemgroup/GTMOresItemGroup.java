
package net.mcreator.genuinelytoomanyadditions.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.genuinelytoomanyadditions.block.LithiumOreBlock;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;

@SoeModElements.ModElement.Tag
public class GTMOresItemGroup extends SoeModElements.ModElement {
	public GTMOresItemGroup(SoeModElements instance) {
		super(instance, 161);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabgtm_ores") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(LithiumOreBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
