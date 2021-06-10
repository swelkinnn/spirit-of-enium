// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modeldingus extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer RightArm;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer LeftArm;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public Modeldingus() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 8.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(22, 16).addBox(-4.5F, -10.0F, 0.0F, 5.0F, 6.0F, 0.0F, 0.0F, false);
		Head.setTextureOffset(0, 16).addBox(-4.0F, 0.0F, -5.0F, 8.0F, 13.0F, 1.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(0, 4).addBox(-3.5F, 17.0F, -2.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setRotationPoint(1.5F, 7.0F, -1.5F);
		RightArm.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0F, 0.0F, 0.2618F);
		RightArm_r1.setTextureOffset(0, 30).addBox(-1.5F, 0.0F, -0.5F, 1.0F, 12.0F, 1.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(0, 0).addBox(1.5F, 17.0F, -2.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setRotationPoint(-1.5F, 7.0F, -1.5F);
		LeftArm.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 0.0F, 0.0F, -0.2618F);
		LeftArm_r1.setTextureOffset(18, 18).addBox(0.5F, 0.0F, -0.5F, 1.0F, 12.0F, 1.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(26, 26).addBox(-1.1F, 0.0F, -1.0F, 1.0F, 12.0F, 1.0F, 0.0F, false);
		RightLeg.setTextureOffset(24, 3).addBox(-1.1F, 11.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(22, 22).addBox(0.1F, 0.0F, -1.0F, 1.0F, 12.0F, 1.0F, 0.0F, false);
		LeftLeg.setTextureOffset(24, 0).addBox(0.1F, 11.0F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
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

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.LeftArm.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}