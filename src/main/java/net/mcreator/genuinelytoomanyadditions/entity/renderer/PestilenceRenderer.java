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

import net.mcreator.genuinelytoomanyadditions.entity.PestilenceEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PestilenceRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PestilenceEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelhorse(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("soe:textures/pestilence.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.3
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelhorse extends EntityModel<Entity> {
		private final ModelRenderer Body;
		private final ModelRenderer TailA;
		private final ModelRenderer Bag1;
		private final ModelRenderer Bag2;
		private final ModelRenderer Leg1A;
		private final ModelRenderer Leg2A;
		private final ModelRenderer Leg3A;
		private final ModelRenderer Leg4A;
		private final ModelRenderer Head;
		private final ModelRenderer HeadSaddle;
		private final ModelRenderer Ear1;
		private final ModelRenderer Ear2;
		private final ModelRenderer Neck;
		private final ModelRenderer harbingerbody;
		private final ModelRenderer harbingerleftleg;
		private final ModelRenderer harbingerrightleg;
		private final ModelRenderer harbingerleftarm;
		private final ModelRenderer harbingerrightarm;
		private final ModelRenderer harbingerhead;
		public Modelhorse() {
			textureWidth = 128;
			textureHeight = 128;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 11.0F, 9.0F);
			Body.setTextureOffset(0, 0).addBox(-5.0F, -8.0F, -20.0F, 10.0F, 10.0F, 22.0F, 0.0F, false);
			Body.setTextureOffset(39, 36).addBox(-5.0F, -8.0F, -12.5F, 10.0F, 9.0F, 9.0F, 0.5F, false);
			TailA = new ModelRenderer(this);
			TailA.setRotationPoint(0.0F, -7.0F, 2.0F);
			Body.addChild(TailA);
			setRotationAngle(TailA, 0.5236F, 0.0F, 0.0F);
			TailA.setTextureOffset(0, 73).addBox(-1.5F, 0.0F, -2.0F, 3.0F, 14.0F, 4.0F, 0.0F, false);
			Bag1 = new ModelRenderer(this);
			Bag1.setRotationPoint(-5.0F, -8.0F, 2.0F);
			Body.addChild(Bag1);
			setRotationAngle(Bag1, 0.0F, -1.5708F, 0.0F);
			Bag1.setTextureOffset(48, 70).addBox(-9.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, 0.0F, false);
			Bag2 = new ModelRenderer(this);
			Bag2.setRotationPoint(5.0F, 3.0F, 11.0F);
			setRotationAngle(Bag2, 0.0F, 1.5708F, 0.0F);
			Bag2.setTextureOffset(26, 65).addBox(1.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, 0.0F, false);
			Leg1A = new ModelRenderer(this);
			Leg1A.setRotationPoint(3.0F, 13.0F, 9.0F);
			Leg1A.setTextureOffset(80, 51).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
			Leg2A = new ModelRenderer(this);
			Leg2A.setRotationPoint(-3.0F, 13.0F, 9.0F);
			Leg2A.setTextureOffset(77, 36).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
			Leg3A = new ModelRenderer(this);
			Leg3A.setRotationPoint(3.0F, 13.0F, -9.0F);
			Leg3A.setTextureOffset(30, 76).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
			Leg4A = new ModelRenderer(this);
			Leg4A.setRotationPoint(-3.0F, 13.0F, -9.0F);
			Leg4A.setTextureOffset(14, 73).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, -4.0F, -11.0F);
			setRotationAngle(Head, 0.5236F, 0.0F, 0.0F);
			Head.setTextureOffset(74, 0).addBox(-2.0F, -5.0F, -11.0F, 4.0F, 5.0F, 5.0F, 0.0F, false);
			HeadSaddle = new ModelRenderer(this);
			HeadSaddle.setRotationPoint(0.0F, 7.0F, -8.0F);
			setRotationAngle(HeadSaddle, 0.5236F, 0.0F, 0.0F);
			HeadSaddle.setTextureOffset(0, 61).addBox(-3.0F, -16.0F, -3.0F, 6.0F, 5.0F, 7.0F, 0.25F, false);
			Ear1 = new ModelRenderer(this);
			Ear1.setRotationPoint(0.0F, 7.0F, -8.0F);
			setRotationAngle(Ear1, 0.5236F, 0.0F, 0.0873F);
			Ear1.setTextureOffset(15, 0).addBox(-0.5F, -18.0F, 2.99F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			Ear2 = new ModelRenderer(this);
			Ear2.setRotationPoint(0.0F, 7.0F, -8.0F);
			setRotationAngle(Ear2, 0.5236F, 0.0F, -0.0873F);
			Ear2.setTextureOffset(0, 0).addBox(-1.5F, -18.0F, 2.99F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			Neck = new ModelRenderer(this);
			Neck.setRotationPoint(0.0F, 7.0F, -8.0F);
			setRotationAngle(Neck, 0.5236F, 0.0F, 0.0F);
			Neck.setTextureOffset(0, 0).addBox(-2.0F, -11.0F, -3.0F, 4.0F, 12.0F, 7.0F, 0.0F, false);
			Neck.setTextureOffset(46, 81).addBox(-1.0F, -16.0F, 4.0F, 2.0F, 16.0F, 2.0F, 0.0F, false);
			harbingerbody = new ModelRenderer(this);
			harbingerbody.setRotationPoint(0.0F, -3.0F, 1.0F);
			setRotationAngle(harbingerbody, 0.0873F, 0.0F, 0.0F);
			harbingerbody.setTextureOffset(56, 54).addBox(-4.0F, -6.0F, -3.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			harbingerleftleg = new ModelRenderer(this);
			harbingerleftleg.setRotationPoint(-2.0F, 0.0F, 0.0F);
			setRotationAngle(harbingerleftleg, 0.0F, 0.7418F, 0.0F);
			harbingerleftleg.setTextureOffset(52, 20).addBox(-1.0F, 0.0F, -13.0F, 4.0F, 4.0F, 12.0F, 0.0F, false);
			harbingerrightleg = new ModelRenderer(this);
			harbingerrightleg.setRotationPoint(2.0F, 0.0F, 0.0F);
			setRotationAngle(harbingerrightleg, 0.0F, -0.7418F, 0.0F);
			harbingerrightleg.setTextureOffset(0, 45).addBox(-3.0F, 0.0F, -13.0F, 4.0F, 4.0F, 12.0F, 0.0F, false);
			harbingerleftarm = new ModelRenderer(this);
			harbingerleftarm.setRotationPoint(4.0F, -9.0F, 0.0F);
			setRotationAngle(harbingerleftarm, -0.0873F, -0.1745F, 0.0F);
			harbingerleftarm.setTextureOffset(72, 12).addBox(0.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			harbingerrightarm = new ModelRenderer(this);
			harbingerrightarm.setRotationPoint(-4.0F, -9.0F, 0.0F);
			setRotationAngle(harbingerrightarm, -0.0873F, 0.1745F, 0.0F);
			harbingerrightarm.setTextureOffset(70, 70).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			harbingerhead = new ModelRenderer(this);
			harbingerhead.setRotationPoint(0.0F, -13.0F, -1.0F);
			setRotationAngle(harbingerhead, 0.0F, -0.2618F, 0.1309F);
			harbingerhead.setTextureOffset(42, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			harbingerhead.setTextureOffset(36, 32).addBox(-2.0F, 0.0F, -6.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
			harbingerhead.setTextureOffset(36, 38).addBox(-1.5F, 1.0F, -8.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			harbingerhead.setTextureOffset(0, 4).addBox(-1.0F, 2.5F, -9.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			harbingerhead.setTextureOffset(0, 32).addBox(-6.0F, -4.0F, -6.0F, 12.0F, 1.0F, 12.0F, 0.0F, false);
			harbingerhead.setTextureOffset(24, 54).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 3.0F, 8.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
			Bag2.render(matrixStack, buffer, packedLight, packedOverlay);
			Leg1A.render(matrixStack, buffer, packedLight, packedOverlay);
			Leg2A.render(matrixStack, buffer, packedLight, packedOverlay);
			Leg3A.render(matrixStack, buffer, packedLight, packedOverlay);
			Leg4A.render(matrixStack, buffer, packedLight, packedOverlay);
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			HeadSaddle.render(matrixStack, buffer, packedLight, packedOverlay);
			Ear1.render(matrixStack, buffer, packedLight, packedOverlay);
			Ear2.render(matrixStack, buffer, packedLight, packedOverlay);
			Neck.render(matrixStack, buffer, packedLight, packedOverlay);
			harbingerbody.render(matrixStack, buffer, packedLight, packedOverlay);
			harbingerleftleg.render(matrixStack, buffer, packedLight, packedOverlay);
			harbingerrightleg.render(matrixStack, buffer, packedLight, packedOverlay);
			harbingerleftarm.render(matrixStack, buffer, packedLight, packedOverlay);
			harbingerrightarm.render(matrixStack, buffer, packedLight, packedOverlay);
			harbingerhead.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Leg1A.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Leg3A.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.harbingerhead.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.harbingerhead.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.Leg2A.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.Leg4A.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
