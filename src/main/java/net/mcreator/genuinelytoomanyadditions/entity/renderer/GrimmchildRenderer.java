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

import net.mcreator.genuinelytoomanyadditions.entity.GrimmchildEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GrimmchildRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GrimmchildEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelgrimmchild(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("soe:textures/grimmchild.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.6.6
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelgrimmchild extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer bone;
		private final ModelRenderer leftwing;
		private final ModelRenderer rightwing;
		private final ModelRenderer body;
		private final ModelRenderer lowerbody;
		private final ModelRenderer bottommostbody;
		public Modelgrimmchild() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -0.9438F, -5.9022F);
			setRotationAngle(head, -0.1309F, 0.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, 1.3889F, -4.8889F, 8.0F, 7.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(38, 0).addBox(1.0F, 0.3889F, -4.8889F, 3.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(32, 35).addBox(-4.0F, 0.3889F, -4.8889F, 3.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(10, 35).addBox(-4.0F, -0.6111F, -3.8889F, 3.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(24, 7).addBox(1.0F, -0.6111F, -3.8889F, 3.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(18, 44).addBox(1.0F, -1.6111F, -2.8889F, 3.0F, 1.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(39, 9).addBox(-4.0F, -1.6111F, -2.8889F, 3.0F, 1.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(44, 17).addBox(-2.5F, -2.6111F, -2.8889F, 2.0F, 1.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(38, 44).addBox(0.5F, -2.6111F, -2.8889F, 2.0F, 1.0F, 7.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(2.0F, 13.0F, 8.0F);
			setRotationAngle(bone, 0.2618F, 0.0F, 0.0F);
			leftwing = new ModelRenderer(this);
			leftwing.setRotationPoint(6.5F, -15.5F, -5.0F);
			bone.addChild(leftwing);
			setRotationAngle(leftwing, 0.2182F, -0.0436F, 0.1309F);
			leftwing.setTextureOffset(22, 22).addBox(-4.3715F, 0.564F, -4.7264F, 11.0F, 13.0F, 0.0F, 0.0F, false);
			rightwing = new ModelRenderer(this);
			rightwing.setRotationPoint(-10.5F, -14.7235F, -2.1022F);
			bone.addChild(rightwing);
			setRotationAngle(rightwing, 0.2182F, 0.0436F, -0.1309F);
			rightwing.setTextureOffset(0, 15).addBox(-6.2285F, -1.2125F, -7.6242F, 11.0F, 13.0F, 0.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.7263F, 2.4874F);
			setRotationAngle(body, 0.7854F, 0.0F, 0.0F);
			body.setTextureOffset(0, 28).addBox(-2.5F, -1.4645F, -11.1924F, 5.0F, 10.0F, 4.0F, 0.0F, false);
			lowerbody = new ModelRenderer(this);
			lowerbody.setRotationPoint(0.0F, 7.7426F, 7.7858F);
			setRotationAngle(lowerbody, 0.5236F, 0.0F, 0.0F);
			lowerbody.setTextureOffset(0, 44).addBox(-2.5F, 2.0516F, -9.7499F, 5.0F, 7.0F, 4.0F, 0.0F, false);
			bottommostbody = new ModelRenderer(this);
			bottommostbody.setRotationPoint(2.0F, 13.0F, 9.0F);
			setRotationAngle(bottommostbody, 0.4363F, 0.0F, 0.0F);
			bottommostbody.setTextureOffset(24, 0).addBox(-4.0F, 4.4663F, -7.4288F, 4.0F, 2.0F, 5.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			lowerbody.render(matrixStack, buffer, packedLight, packedOverlay);
			bottommostbody.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}
}
