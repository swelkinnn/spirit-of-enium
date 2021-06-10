
package net.mcreator.genuinelytoomanyadditions.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.genuinelytoomanyadditions.item.LavendariumArmorItem;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;

@SoeModElements.ModElement.Tag
public class GTMArmorsItemGroup extends SoeModElements.ModElement {
	public GTMArmorsItemGroup(SoeModElements instance) {
		super(instance, 181);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabgtm_armors") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(LavendariumArmorItem.body, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
