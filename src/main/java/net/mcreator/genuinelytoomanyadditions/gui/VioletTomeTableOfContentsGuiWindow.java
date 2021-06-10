
package net.mcreator.genuinelytoomanyadditions.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.genuinelytoomanyadditions.SoeMod;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class VioletTomeTableOfContentsGuiWindow extends ContainerScreen<VioletTomeTableOfContentsGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	public VioletTomeTableOfContentsGuiWindow(VioletTomeTableOfContentsGui.GuiContainerMod container, PlayerInventory inventory,
			ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 1;
		this.ySize = 150;
	}
	private static final ResourceLocation texture = new ResourceLocation("soe:textures/violet_tome_table_of_contents.png");
	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("soe:textures/table_of_contents.png"));
		this.blit(ms, this.guiLeft + -144, this.guiTop + -19, 0, 0, 286, 184, 286, 184);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("soe:textures/pigclops_icon.png"));
		this.blit(ms, this.guiLeft + -126, this.guiTop + 8, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("soe:textures/wendigo_icon_2.png"));
		this.blit(ms, this.guiLeft + -126, this.guiTop + 35, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("soe:textures/mothman_icon.png"));
		this.blit(ms, this.guiLeft + -126, this.guiTop + 62, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("soe:textures/grimm_icon.png"));
		this.blit(ms, this.guiLeft + -126, this.guiTop + 89, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("soe:textures/violet_boar_icon.png"));
		this.blit(ms, this.guiLeft + 108, this.guiTop + 8, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("soe:textures/violet_wendigo_icon_2.png"));
		this.blit(ms, this.guiLeft + 108, this.guiTop + 35, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("soe:textures/violet_moth_icon.png"));
		this.blit(ms, this.guiLeft + 108, this.guiTop + 62, 0, 0, 16, 16, 16, 16);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("soe:textures/vgk_grimm_icon.png"));
		this.blit(ms, this.guiLeft + 108, this.guiTop + 89, 0, 0, 16, 16, 16, 16);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Table Of Contents", -108, -10, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + -99, this.guiTop + 8, 65, 20, new StringTextComponent("Pigclops"), e -> {
			if (true) {
				SoeMod.PACKET_HANDLER.sendToServer(new VioletTomeTableOfContentsGui.ButtonPressedMessage(0, x, y, z));
				VioletTomeTableOfContentsGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -99, this.guiTop + 35, 60, 20, new StringTextComponent("Wendigo"), e -> {
			if (true) {
				SoeMod.PACKET_HANDLER.sendToServer(new VioletTomeTableOfContentsGui.ButtonPressedMessage(1, x, y, z));
				VioletTomeTableOfContentsGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -99, this.guiTop + 62, 60, 20, new StringTextComponent("Mothman"), e -> {
			if (true) {
				SoeMod.PACKET_HANDLER.sendToServer(new VioletTomeTableOfContentsGui.ButtonPressedMessage(2, x, y, z));
				VioletTomeTableOfContentsGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -99, this.guiTop + 89, 70, 20, new StringTextComponent("T.M Grimm"), e -> {
			if (true) {
				SoeMod.PACKET_HANDLER.sendToServer(new VioletTomeTableOfContentsGui.ButtonPressedMessage(3, x, y, z));
				VioletTomeTableOfContentsGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 18, this.guiTop + 8, 80, 20, new StringTextComponent("Violet Boar"), e -> {
			if (true) {
				SoeMod.PACKET_HANDLER.sendToServer(new VioletTomeTableOfContentsGui.ButtonPressedMessage(4, x, y, z));
				VioletTomeTableOfContentsGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 9, this.guiTop + 35, 95, 20, new StringTextComponent("Violet Winding"), e -> {
			if (true) {
				SoeMod.PACKET_HANDLER.sendToServer(new VioletTomeTableOfContentsGui.ButtonPressedMessage(5, x, y, z));
				VioletTomeTableOfContentsGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 18, this.guiTop + 62, 80, 20, new StringTextComponent("Violet Moth"), e -> {
			if (true) {
				SoeMod.PACKET_HANDLER.sendToServer(new VioletTomeTableOfContentsGui.ButtonPressedMessage(6, x, y, z));
				VioletTomeTableOfContentsGui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 18, this.guiTop + 89, 80, 20, new StringTextComponent("The Godking"), e -> {
			if (true) {
				SoeMod.PACKET_HANDLER.sendToServer(new VioletTomeTableOfContentsGui.ButtonPressedMessage(7, x, y, z));
				VioletTomeTableOfContentsGui.handleButtonAction(entity, 7, x, y, z);
			}
		}));
	}
}
