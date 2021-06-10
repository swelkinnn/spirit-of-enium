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

import net.mcreator.genuinelytoomanyadditions.entity.WendigoEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WendigoRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WendigoEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelwendigo_2(), 1f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("soe:textures/wendigo_2_texture_test2.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.2
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelwendigo_2 extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer jaw;
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer righthand;
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer LeftArm;
		private final ModelRenderer lefthand;
		public Modelwendigo_2() {
			textureWidth = 128;
			textureHeight = 128;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, -10.0F, -6.0F);
			setRotationAngle(Head, 0.0873F, 0.0F, 0.0F);
			Head.setTextureOffset(0, 41).addBox(-4.0F, -4.0F, -2.0F, 8.0F, 7.0F, 9.0F, 0.0F, false);
			Head.setTextureOffset(44, 9).addBox(-3.0F, -1.0F, -8.0F, 6.0F, 4.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(21, 0).addBox(-9.0F, -11.0F, 2.0F, 7.0F, 8.0F, 0.0F, 0.0F, false);
			Head.setTextureOffset(21, 16).addBox(-3.0F, 3.0F, -8.0F, 6.0F, 1.0F, 0.0F, 0.0F, false);
			Head.setTextureOffset(0, 10).addBox(3.0F, 3.0F, -8.0F, 0.0F, 1.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(0, 9).addBox(-3.0F, 3.0F, -8.0F, 0.0F, 1.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(21, 8).addBox(2.0F, -11.0F, 2.0F, 7.0F, 8.0F, 0.0F, 0.0F, false);
			jaw = new ModelRenderer(this);
			jaw.setRotationPoint(0.0F, -10.0F, -6.0F);
			setRotationAngle(jaw, 0.48F, 0.0F, 0.0F);
			jaw.setTextureOffset(44, 0).addBox(-2.5F, 3.0F, -8.0F, 5.0F, 1.0F, 8.0F, 0.0F, false);
			jaw.setTextureOffset(0, 1).addBox(2.5F, 2.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F, false);
			jaw.setTextureOffset(0, 0).addBox(-2.5F, 2.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F, false);
			jaw.setTextureOffset(0, 33).addBox(-2.5F, 2.0F, -8.0F, 5.0F, 1.0F, 0.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, -7.0F, -2.0F);
			setRotationAngle(Body, 0.9163F, 0.0F, 0.0F);
			Body.setTextureOffset(34, 41).addBox(-4.0F, -1.0F, 4.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(0, 10).addBox(-2.0F, 13.0F, 4.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(44, 29).addBox(-3.0F, 11.0F, 4.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(44, 22).addBox(-3.0F, 14.0F, 4.0F, 6.0F, 3.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(0, 19).addBox(4.0F, -1.0F, 4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(0, 0).addBox(-8.0F, -1.0F, 4.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(28, 57).addBox(-1.0F, -1.0F, 8.0F, 2.0F, 17.0F, 1.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-4.0F, -10.5F, 3.0F);
			setRotationAngle(RightArm, 0.3927F, 0.0F, 0.0F);
			RightArm.setTextureOffset(0, 19).addBox(-2.0F, 13.5F, -18.0F, 2.0F, 2.0F, 17.0F, 0.0F, false);
			RightArm.setTextureOffset(20, 57).addBox(-2.0F, -1.5F, -1.0F, 2.0F, 17.0F, 2.0F, 0.0F, false);
			RightArm.setTextureOffset(0, 27).addBox(-3.0F, 0.0F, -1.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			righthand = new ModelRenderer(this);
			righthand.setRotationPoint(-5.5F, 9.5F, -7.5F);
			righthand.setTextureOffset(34, 57).addBox(-1.5F, -1.5F, -3.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-2.0F, 4.0F, 7.0F);
			RightLeg.setTextureOffset(0, 57).addBox(-2.0F, -5.0F, 5.0F, 3.0F, 22.0F, 3.0F, 0.0F, false);
			RightLeg.setTextureOffset(22, 22).addBox(-2.0F, 14.0F, 8.0F, 3.0F, 3.0F, 16.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(2.0F, 4.0F, 7.0F);
			LeftLeg.setTextureOffset(55, 55).addBox(-1.0F, -5.0F, 5.0F, 3.0F, 22.0F, 3.0F, 0.0F, false);
			LeftLeg.setTextureOffset(22, 3).addBox(-1.0F, 14.0F, 8.0F, 3.0F, 3.0F, 16.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(4.0F, -10.5F, 3.0F);
			setRotationAngle(LeftArm, 0.3927F, 0.0F, 0.0F);
			LeftArm.setTextureOffset(12, 57).addBox(0.0F, -1.5F, -1.0F, 2.0F, 17.0F, 2.0F, 0.0F, false);
			LeftArm.setTextureOffset(0, 0).addBox(0.0F, 13.5F, -18.0F, 2.0F, 2.0F, 17.0F, 0.0F, false);
			LeftArm.setTextureOffset(21, 22).addBox(0.0F, 0.0F, -1.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			lefthand = new ModelRenderer(this);
			lefthand.setRotationPoint(5.5F, 9.5F, -7.5F);
			lefthand.setTextureOffset(21, 28).addBox(-1.5F, -1.5F, -3.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			jaw.render(matrixStack, buffer, packedLight, packedOverlay);
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			righthand.render(matrixStack, buffer, packedLight, packedOverlay);
			RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			lefthand.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.lefthand.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.jaw.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.jaw.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.righthand.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}
}
