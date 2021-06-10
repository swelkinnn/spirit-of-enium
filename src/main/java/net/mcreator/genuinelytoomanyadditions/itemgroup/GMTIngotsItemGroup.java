
package net.mcreator.genuinelytoomanyadditions.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.genuinelytoomanyadditions.item.LithiumIngotItem;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;

@SoeModElements.ModElement.Tag
public class GMTIngotsItemGroup extends SoeModElements.ModElement {
	public GMTIngotsItemGroup(SoeModElements instance) {
		super(instance, 162);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabgmt_ingots") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(LithiumIngotItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
