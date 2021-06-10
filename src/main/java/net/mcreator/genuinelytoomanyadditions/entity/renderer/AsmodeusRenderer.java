package net.mcreator.genuinelytoomanyadditions.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.genuinelytoomanyadditions.entity.AsmodeusEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class AsmodeusRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(AsmodeusEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelasmodeus(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("soe:textures/asmodeus.png");
					}
				};
			});
		}
	}

	@OnlyIn(Dist.CLIENT)
	private static class GlowingLayer<T extends Entity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
		public GlowingLayer(IEntityRenderer<T, M> er) {
			super(er);
		}

		public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing,
				float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("soe:textures/asmodeus.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.7.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelasmodeus extends EntityModel<Entity> {
		private final ModelRenderer leftarm;
		private final ModelRenderer cube_r1;
		private final ModelRenderer body;
		private final ModelRenderer Head;
		private final ModelRenderer rightarm;
		private final ModelRenderer cube_r2;
		public Modelasmodeus() {
			textureWidth = 128;
			textureHeight = 128;
			leftarm = new ModelRenderer(this);
			leftarm.setRotationPoint(5.0F, -8.0F, -2.0F);
			leftarm.setTextureOffset(50, 50).addBox(1.0F, -1.0F, 1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
			leftarm.setTextureOffset(28, 39).addBox(15.0F, -12.0F, -1.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(9.0F, 0.0F, 2.0F);
			leftarm.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, -0.8727F);
			cube_r1.setTextureOffset(48, 20).addBox(0.0F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(3.0F, -1.0F, -5.0F);
			body.setTextureOffset(23, 0).addBox(-8.0F, -9.0F, 3.0F, 10.0F, 4.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(50, 24).addBox(-6.5F, -5.0F, 4.0F, 7.0F, 4.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 16).addBox(-4.0F, -1.0F, 5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, -10.0F, 0.0F);
			Head.setTextureOffset(0, 16).addBox(-4.0F, -12.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-3.5F, -11.5F, -4.5F, 7.0F, 7.0F, 9.0F, 0.0F, false);
			Head.setTextureOffset(25, 25).addBox(-4.5F, -11.5F, -3.5F, 9.0F, 7.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(0, 32).addBox(-3.5F, -12.5F, -3.5F, 7.0F, 9.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(0, 6).addBox(-1.0F, -5.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(20, 51).addBox(-2.0F, -14.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(52, 43).addBox(2.0F, -15.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(44, 52).addBox(-3.0F, -15.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(36, 51).addBox(-1.0F, -15.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(0, 20).addBox(-1.0F, -17.0F, -3.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(50, 8).addBox(-16.0F, -13.0F, 0.0F, 10.0F, 10.0F, 0.0F, 0.0F, false);
			Head.setTextureOffset(0, 48).addBox(6.0F, -13.0F, 0.0F, 10.0F, 10.0F, 0.0F, 0.0F, false);
			rightarm = new ModelRenderer(this);
			rightarm.setRotationPoint(-5.0F, -8.0F, -2.0F);
			rightarm.setTextureOffset(47, 0).addBox(-9.0F, -1.0F, 1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
			rightarm.setTextureOffset(26, 10).addBox(-21.0F, -12.0F, -1.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-9.0F, 0.0F, 2.0F);
			rightarm.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, -2.3126F);
			cube_r2.setTextureOffset(46, 39).addBox(0.0F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}
}
