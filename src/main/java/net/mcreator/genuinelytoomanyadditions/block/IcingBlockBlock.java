
package net.mcreator.genuinelytoomanyadditions.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.entity.Entity;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.genuinelytoomanyadditions.procedures.IcingBlockEntityCollidesInTheBlockProcedure;
import net.mcreator.genuinelytoomanyadditions.itemgroup.GTMBlocksItemGroup;
import net.mcreator.genuinelytoomanyadditions.item.IcingballItem;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;

@SoeModElements.ModElement.Tag
public class IcingBlockBlock extends SoeModElements.ModElement {
	@ObjectHolder("soe:icing_block")
	public static final Block block = null;
	public IcingBlockBlock(SoeModElements instance) {
		super(instance, 95);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(GTMBlocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.CLAY).sound(SoundType.HONEY).hardnessAndResistance(0.1f, 0f).setLightLevel(s -> 0)
					.doesNotBlockMovement().slipperiness(1.2000000000000002f));
			setRegistryName("icing_block");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(IcingballItem.block, (int) (4)));
		}

		@Override
		public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
			super.onEntityCollision(state, world, pos, entity);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				IcingBlockEntityCollidesInTheBlockProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
