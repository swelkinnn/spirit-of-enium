// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelwendigo_skull_wearing extends EntityModel<Entity> {
	private final ModelRenderer Head;

	public Modelwendigo_skull_wearing() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(4.0F, -7.0F, -9.0F);
		Head.setTextureOffset(0, 0).addBox(-7.0F, -1.0F, 5.5F, 7.0F, 8.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(20, 16).addBox(-5.5F, 5.0F, 4.5F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(-5.0F, 5.0F, 3.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(4, 4).addBox(0.0F, 1.0F, 5.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 3).addBox(-8.0F, 1.0F, 5.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(46, 7).addBox(-1.0F, -8.0F, 9.5F, 6.0F, 7.0F, 0.0F, 0.0F, false);
		Head.setTextureOffset(46, 0).addBox(-12.0F, -8.0F, 9.5F, 6.0F, 7.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}