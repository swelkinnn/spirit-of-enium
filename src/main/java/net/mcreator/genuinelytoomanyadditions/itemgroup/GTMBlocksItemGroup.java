
package net.mcreator.genuinelytoomanyadditions.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.genuinelytoomanyadditions.block.LithiumBlockBlock;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;

@SoeModElements.ModElement.Tag
public class GTMBlocksItemGroup extends SoeModElements.ModElement {
	public GTMBlocksItemGroup(SoeModElements instance) {
		super(instance, 163);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabgtm_blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(LithiumBlockBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
