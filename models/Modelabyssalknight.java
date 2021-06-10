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
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}