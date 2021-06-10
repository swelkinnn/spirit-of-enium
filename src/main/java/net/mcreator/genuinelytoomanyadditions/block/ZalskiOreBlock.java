
package net.mcreator.genuinelytoomanyadditions.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.genuinelytoomanyadditions.itemgroup.GTMOresItemGroup;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;

@SoeModElements.ModElement.Tag
public class ZalskiOreBlock extends SoeModElements.ModElement {
	@ObjectHolder("soe:zalski_ore")
	public static final Block block = null;
	public ZalskiOreBlock(SoeModElements instance) {
		super(instance, 759);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(GTMOresItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(3.5f, 16f).setLightLevel(s -> 5));
			setRegistryName("zalski_ore");
		}
	}
}
