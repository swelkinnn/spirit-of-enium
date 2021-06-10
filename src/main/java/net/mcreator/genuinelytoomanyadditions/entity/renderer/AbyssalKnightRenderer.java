package net.mcreator.genuinelytoomanyadditions.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.genuinelytoomanyadditions.entity.AbyssalKnightEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class AbyssalKnightRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(AbyssalKnightEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelabyssalknight(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("soe:textures/abyssal_knight.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelabyssalknight extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer Head;
		public Modelabyssalknight() {
			textureWidth = 64;
			textureHeight = 64;
			body = new ModelRenderer(this);
			body.setRotationPoint(3.0F, -1.0F, -5.0F);
			body.setTextureOffset(23, 0).addBox(-7.0F, 5.0F, 3.0F, 8.0F, 4.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(24, 16).addBox(-6.5F, 9.0F, 4.0F, 7.0F, 4.0F, 2.0F, 0.0F, false);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 4.0F, 0.0F);
			Head.setTextureOffset(0, 16).addBox(-4.0F, -12.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-3.5F, -11.5F, -4.5F, 7.0F, 7.0F, 9.0F, 0.0F, false);
			Head.setTextureOffset(25, 25).addBox(-4.5F, -11.5F, -3.5F, 9.0F, 7.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(0, 32).addBox(-3.5F, -12.5F, -3.5F, 7.0F, 9.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(0, 6).addBox(-1.0F, -5.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}
}
