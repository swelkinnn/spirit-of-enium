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

import net.mcreator.genuinelytoomanyadditions.entity.ArchSkeletonEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ArchSkeletonRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ArchSkeletonEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelskeleton(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("soe:textures/hard_skeleton.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.3
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelskeleton extends EntityModel<Entity> {
		private final ModelRenderer leftLeg;
		private final ModelRenderer rightLeg;
		private final ModelRenderer leftArm;
		private final ModelRenderer rightArm;
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer bb_main;
		public Modelskeleton() {
			textureWidth = 64;
			textureHeight = 64;
			leftLeg = new ModelRenderer(this);
			leftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
			leftLeg.setTextureOffset(16, 32).addBox(0.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F, 0.0F, false);
			rightLeg = new ModelRenderer(this);
			rightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
			rightLeg.setTextureOffset(0, 40).addBox(-2.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F, 0.0F, false);
			leftArm = new ModelRenderer(this);
			leftArm.setRotationPoint(5.0F, -1.0F, 0.0F);
			setRotationAngle(leftArm, 0.2182F, 0.3054F, 0.0F);
			leftArm.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -13.0F, 2.0F, 2.0F, 14.0F, 0.0F, false);
			rightArm = new ModelRenderer(this);
			rightArm.setRotationPoint(-4.5F, -0.5F, 1.0F);
			setRotationAngle(rightArm, 0.2182F, -0.3491F, 0.0F);
			rightArm.setTextureOffset(0, 16).addBox(-1.5F, -1.5F, -14.0F, 2.0F, 2.0F, 14.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(24, 8).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(18, 0).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(42, 0).addBox(-5.0F, -11.0F, 1.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(28, 28).addBox(-4.0F, -2.1F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.setTextureOffset(0, 24).addBox(0.5F, -28.5F, -15.0F, 0.0F, 8.0F, 8.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}
}
