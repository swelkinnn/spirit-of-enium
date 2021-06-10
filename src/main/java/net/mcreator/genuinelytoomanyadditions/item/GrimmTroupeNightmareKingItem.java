
package net.mcreator.genuinelytoomanyadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.genuinelytoomanyadditions.itemgroup.GTMMiscItemGroup;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;

@SoeModElements.ModElement.Tag
public class GrimmTroupeNightmareKingItem extends SoeModElements.ModElement {
	@ObjectHolder("soe:grimm_troupe_nightmare_king")
	public static final Item block = null;
	public GrimmTroupeNightmareKingItem(SoeModElements instance) {
		super(instance, 153);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, SoeModElements.sounds.get(new ResourceLocation("soe:grimmtrouperecord")),
					new Item.Properties().group(GTMMiscItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("grimm_troupe_nightmare_king");
		}
	}
}
