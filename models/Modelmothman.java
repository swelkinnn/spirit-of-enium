// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelmothman extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer wings;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer rightleg2;
	private final ModelRenderer LeftLeg;

	public Modelmothman() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-3.5F, -12.0F, -3.0F, 7.0F, 7.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(54, 30).addBox(-6.0F, -19.0F, 0.0F, 5.0F, 7.0F, 0.0F, 0.0F, false);
		Head.setTextureOffset(54, 10).addBox(1.5F, -19.0F, 0.0F, 5.0F, 7.0F, 0.0F, 0.0F, false);
		Head.setTextureOffset(21, 0).addBox(-5.0F, -11.0F, 4.0F, 10.0F, 6.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(48, 0).addBox(-4.5F, -9.0F, -2.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(48, 50).addBox(3.5F, -9.0F, -2.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -5.0F, 1.0F);
		setRotationAngle(Body, 0.3927F, 0.0F, 0.0F);
		Body.setTextureOffset(34, 34).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(22, 8).addBox(-5.0F, -1.0F, -3.0F, 10.0F, 2.0F, 6.0F, 0.0F, false);

		wings = new ModelRenderer(this);
		wings.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(wings);
		setRotationAngle(wings, -1.5708F, -1.3526F, 1.5708F);
		wings.setTextureOffset(0, 0).addBox(5.0F, -20.0F, 0.0F, 0.0F, 26.0F, 17.0F, 0.0F, false);
		wings.setTextureOffset(34, 34).addBox(5.0F, -20.0F, 0.0F, 0.0F, 26.0F, -17.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-7.0F, 1.0F, 0.0F);
		setRotationAngle(RightArm, -0.0873F, 0.1309F, 0.2618F);
		RightArm.setTextureOffset(24, 46).addBox(0.0F, -5.0F, -1.0F, 2.0F, 15.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(42, 47).addBox(1.0F, -4.0F, 3.0F, 0.0F, 19.0F, 3.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(4.0F, -3.0F, 0.0F);
		setRotationAngle(LeftArm, 0.0873F, -0.1309F, -0.2618F);
		LeftArm.setTextureOffset(12, 43).addBox(0.0F, -1.0F, -1.0F, 2.0F, 15.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(36, 47).addBox(1.0F, 0.0F, 3.0F, 0.0F, 19.0F, 3.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, -0.5672F, 0.0F, 0.0F);
		RightLeg.setTextureOffset(34, 16).addBox(-2.1F, -8.0F, 0.0F, 2.0F, 12.0F, 4.0F, 0.0F, false);

		rightleg2 = new ModelRenderer(this);
		rightleg2.setRotationPoint(1.9F, 6.1646F, 12.8821F);
		RightLeg.addChild(rightleg2);
		setRotationAngle(rightleg2, 1.309F, 0.0F, 0.0F);
		rightleg2.setTextureOffset(46, 16).addBox(-4.0F, -10.1646F, 0.1179F, 2.0F, 10.0F, 4.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 6.0F, 6.0F);
		setRotationAngle(LeftLeg, -0.5672F, 0.0F, 0.0F);
		LeftLeg.setTextureOffset(0, 43).addBox(0.1F, -1.4098F, -2.4559F, 2.0F, 22.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}