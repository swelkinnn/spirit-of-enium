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

import net.mcreator.genuinelytoomanyadditions.entity.VioletCorpseEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class VioletCorpseRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(VioletCorpseEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcultistcorpse(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("soe:textures/cultist.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelcultistcorpse extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		public Modelcultistcorpse() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 22.0F, -14.0F);
			setRotationAngle(Head, -0.0873F, -0.1745F, 0.0873F);
			Head.setTextureOffset(0, 0).addBox(-4.0F, -5.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			Head.setTextureOffset(20, 16).addBox(-3.0F, -6.0F, 2.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(24, 20).addBox(-3.0F, -5.0F, 4.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(24, 0).addBox(-2.0F, -3.0F, 4.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-1.0F, -3.0F, 5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 2).addBox(0.0F, -4.0F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 22.0F, -5.0F);
			setRotationAngle(Body, 1.5708F, 0.0F, 0.0F);
			Body.setTextureOffset(0, 16).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-7.0F, 16.0F, -13.0F);
			setRotationAngle(RightArm, -1.5708F, 0.0873F, -0.1309F);
			RightArm.setTextureOffset(36, 36).addBox(-2.0F, -5.0F, 5.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(6.0F, 22.0F, -14.0F);
			setRotationAngle(LeftArm, -1.309F, -0.7854F, -0.3054F);
			LeftArm.setTextureOffset(32, 0).addBox(0.0F, -5.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-2.0F, 18.0F, 3.0F);
			setRotationAngle(RightLeg, 2.0071F, 0.3054F, -2.5307F);
			RightLeg.setTextureOffset(0, 32).addBox(-2.0F, -2.0F, 3.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 22.0F, 0.0F);
			setRotationAngle(LeftLeg, 1.5708F, -0.3491F, -0.0873F);
			LeftLeg.setTextureOffset(24, 24).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
