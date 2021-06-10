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

import net.mcreator.genuinelytoomanyadditions.entity.BombeEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BombeRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BombeEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelbomb_2(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("soe:textures/bomb_2.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.7.5
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelbomb_2 extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer cube_r1;
		public Modelbomb_2() {
			textureWidth = 32;
			textureHeight = 32;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 20.3333F, 0.0833F);
			bone.setTextureOffset(15, 14).addBox(-2.0F, 2.6667F, -2.0833F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(15, 8).addBox(-2.0F, -2.3333F, -2.0833F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(-3.0F, -0.3333F, -3.0833F, 6.0F, 2.0F, 6.0F, 0.0F, false);
			bone.setTextureOffset(0, 14).addBox(-2.5F, 1.6667F, -2.5833F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			bone.setTextureOffset(0, 8).addBox(-2.5F, -1.3333F, -2.5833F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.5F, -2.3333F, 0.4167F);
			bone.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
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
