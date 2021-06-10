
package net.mcreator.genuinelytoomanyadditions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.Entity;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.genuinelytoomanyadditions.procedures.DonkeysJawboneToolInHandTickProcedure;
import net.mcreator.genuinelytoomanyadditions.itemgroup.GMTToolsAndWeaponsItemGroup;
import net.mcreator.genuinelytoomanyadditions.SoeModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@SoeModElements.ModElement.Tag
public class DonkeysJawboneItem extends SoeModElements.ModElement {
	@ObjectHolder("soe:donkeys_jawbone")
	public static final Item block = null;
	public DonkeysJawboneItem(SoeModElements instance) {
		super(instance, 944);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 0;
			}

			public float getEfficiency() {
				return 0f;
			}

			public float getAttackDamage() {
				return 4.5f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.4f, new Item.Properties().group(GMTToolsAndWeaponsItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("\u00A77Slay a Thousand!"));
			}

			@Override
			public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
				super.inventoryTick(itemstack, world, entity, slot, selected);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				if (selected) {
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					DonkeysJawboneToolInHandTickProcedure.executeProcedure($_dependencies);
				}
			}
		}.setRegistryName("donkeys_jawbone"));
	}
}
