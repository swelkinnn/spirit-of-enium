package net.mcreator.genuinelytoomanyadditions.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.genuinelytoomanyadditions.entity.PigclopsEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PigclopsRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PigclopsEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelpigclops(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("soe:textures/pigclops2.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelpigclops extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer head2;
		private final ModelRenderer head3;
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		public Modelpigclops() {
			textureWidth = 128;
			textureHeight = 128;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head2 = new ModelRenderer(this);
			head2.setRotationPoint(5.0F, -4.5F, 0.0F);
			Head.addChild(head2);
			setRotationAngle(head2, 0.0F, 0.0F, -0.1309F);
			head2.setTextureOffset(44, 17).addBox(-1.0F, -3.5F, -3.0F, 1.0F, 7.0F, 6.0F, 0.0F, false);
			head3 = new ModelRenderer(this);
			head3.setRotationPoint(-5.5F, -4.5F, 0.0F);
			Head.addChild(head3);
			setRotationAngle(head3, 0.0F, 0.0F, 0.1309F);
			head3.setTextureOffset(20, 41).addBox(0.5F, -3.5F, -3.0F, 1.0F, 7.0F, 6.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(44, 30).addBox(-4.0F, 8.0F, -4.0F, 8.0F, 4.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(24, 17).addBox(-4.0F, 8.0F, 2.0F, 8.0F, 4.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(30, 52).addBox(4.0F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(14, 50).addBox(-5.0F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(0, 49).addBox(-4.0F, 4.0F, -3.0F, 8.0F, 4.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(47, 0).addBox(-4.0F, 4.0F, 2.0F, 8.0F, 4.0F, 1.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			setRotationAngle(RightArm, 0.0F, 0.0F, 0.1745F);
			RightArm.setTextureOffset(39, 39).addBox(-4.0F, -2.0F, -2.0F, 5.0F, 12.0F, 5.0F, 0.0F, false);
			RightArm.setTextureOffset(98, 32).addBox(0.0F, -6.0F, -1.0F, 0.0F, 16.0F, -16.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			setRotationAngle(LeftArm, 0.0F, 0.0F, -0.1745F);
			LeftArm.setTextureOffset(32, 0).addBox(-1.0F, -2.0F, -2.0F, 5.0F, 12.0F, 5.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightLeg.setTextureOffset(0, 32).addBox(-3.1F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.setTextureOffset(24, 24).addBox(-1.9F, 0.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.0F, false);
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
			this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
