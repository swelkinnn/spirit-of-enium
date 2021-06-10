// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelgrimmkinm extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer LeftArm;
	private final ModelRenderer tail;

	public Modelgrimmkinm() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -4.9F, 0.0F);
		Head.setTextureOffset(24, 24).addBox(-4.0F, -1.1F, -4.0F, 8.0F, 15.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(-5.0F, -3.1F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(4.0F, -3.1F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(10, 3).addBox(3.0F, -2.1F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(10, 3).addBox(-4.0F, -2.1F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-4.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(0, 0).addBox(-2.0F, -11.0F, -18.0F, 0.0F, 16.0F, 16.0F, 0.0F, false);

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setRotationPoint(-1.8659F, 2.7425F, -0.5F);
		RightArm.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, -0.5672F, 0.0F, 0.3491F);
		RightArm_r1.setTextureOffset(29, 6).addBox(-1.1341F, -2.7425F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(4.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.0F, 0.0F, -0.3491F);
		LeftArm.setTextureOffset(20, 0).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 9.5F, -1.0F);
		setRotationAngle(tail, 0.0F, 0.0F, -0.3491F);
		tail.setTextureOffset(0, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.RightArm_r1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}