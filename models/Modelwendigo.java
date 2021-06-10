// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelwendigo extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer rightleg2;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer leftleg2;

	public Modelwendigo() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -7.0F, -6.0F);
		Head.setTextureOffset(0, 0).addBox(-3.5F, -8.0F, -4.0F, 7.0F, 8.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(20, 16).addBox(-2.0F, -2.0F, -5.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(-1.5F, -2.0F, -6.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(4, 4).addBox(-4.5F, -6.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 3).addBox(3.5F, -6.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(46, 7).addBox(2.0F, -15.0F, 0.0F, 6.0F, 7.0F, 0.0F, 0.0F, false);
		Head.setTextureOffset(46, 0).addBox(-8.0F, -15.0F, 0.0F, 6.0F, 7.0F, 0.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -7.0F, -2.0F);
		setRotationAngle(Body, 0.48F, 0.0F, 0.0F);
		Body.setTextureOffset(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(30, 0).addBox(-3.0F, -10.0F, -3.0F, 4.0F, 17.0F, 4.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(24, 24).addBox(-1.0F, -10.0F, -4.0F, 4.0F, 17.0F, 4.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 4.0F, 7.0F);
		setRotationAngle(RightLeg, -1.1345F, 0.0F, 0.0F);
		RightLeg.setTextureOffset(16, 45).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		rightleg2 = new ModelRenderer(this);
		rightleg2.setRotationPoint(-0.1F, 10.6869F, 4.7262F);
		RightLeg.addChild(rightleg2);
		setRotationAngle(rightleg2, 1.4835F, 0.0F, 0.0F);
		rightleg2.setTextureOffset(0, 32).addBox(-2.0F, -2.6869F, -2.2262F, 4.0F, 15.0F, 4.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(2.0F, 7.0F, 1.0F);
		setRotationAngle(LeftLeg, -1.1345F, 0.0F, 0.0F);
		LeftLeg.setTextureOffset(40, 21).addBox(-2.0F, -5.68F, -2.2F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		leftleg2 = new ModelRenderer(this);
		leftleg2.setRotationPoint(0.0F, 6.5F, 8.0F);
		LeftLeg.addChild(leftleg2);
		setRotationAngle(leftleg2, 1.4835F, 0.0F, 0.0F);
		leftleg2.setTextureOffset(40, 40).addBox(-2.0F, -6.5F, 0.0F, 4.0F, 15.0F, 4.0F, 0.0F, false);
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
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}