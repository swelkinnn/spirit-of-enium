// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelvioletgolem extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer Body_r1;
	private final ModelRenderer Body_r2;
	private final ModelRenderer RightArm;
	private final ModelRenderer cube_r2;
	private final ModelRenderer LeftArm;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public Modelvioletgolem() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -11.0F, -24.0F);

		Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(-1.0F, 3.0F, -3.0F);
		Head.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.3491F, 0.0F, 0.0F);
		Head_r1.setTextureOffset(36, 8).addBox(-3.0F, -5.0F, -4.0F, 1.0F, 8.0F, 8.0F, 0.0F, false);
		Head_r1.setTextureOffset(36, 38).addBox(4.0F, -5.0F, -4.0F, 1.0F, 8.0F, 8.0F, 0.0F, false);
		Head_r1.setTextureOffset(20, 18).addBox(-2.0F, -2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Head_r1.setTextureOffset(24, 24).addBox(2.0F, -2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Head_r1.setTextureOffset(44, 28).addBox(0.0F, -2.0F, -4.0F, 2.0F, 2.0F, 8.0F, 0.0F, false);
		Head_r1.setTextureOffset(16, 36).addBox(-2.0F, -4.0F, -4.0F, 6.0F, 2.0F, 8.0F, 0.0F, false);
		Head_r1.setTextureOffset(24, 24).addBox(-2.0F, 0.0F, -4.0F, 6.0F, 4.0F, 8.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.5F, -5.5F, -10.0F);
		Body.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3491F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-1.5F, -1.5F, -15.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);

		Body_r1 = new ModelRenderer(this);
		Body_r1.setRotationPoint(0.0F, -1.0F, -6.0F);
		Body.addChild(Body_r1);
		setRotationAngle(Body_r1, -0.5672F, 0.0F, 0.0F);
		Body_r1.setTextureOffset(0, 18).addBox(-4.0F, -9.0F, 4.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		Body_r2 = new ModelRenderer(this);
		Body_r2.setRotationPoint(0.0F, -1.0F, -6.0F);
		Body.addChild(Body_r2);
		setRotationAngle(Body_r2, 0.6109F, 0.0F, 0.0F);
		Body_r2.setTextureOffset(20, 0).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, -3.0F, -9.0F);
		setRotationAngle(RightArm, -0.5236F, 0.0F, 0.0F);
		RightArm.setTextureOffset(0, 0).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 21.0F, 18.0F);
		RightArm.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.9163F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(16, 46).addBox(-1.0F, -23.0F, -3.0F, 2.0F, 22.0F, 2.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, -3.0F, -9.0F);
		setRotationAngle(LeftArm, -0.5236F, 0.0F, 0.0F);
		LeftArm.setTextureOffset(8, 0).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setRotationPoint(0.0F, -3.0F, 11.0F);
		LeftArm.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 0.9163F, 0.0F, 0.0F);
		LeftArm_r1.setTextureOffset(24, 46).addBox(-1.0F, -3.0F, -18.0F, 2.0F, 22.0F, 2.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-3.0F, -4.0F, 5.0F);
		RightLeg.setTextureOffset(8, 34).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 28.0F, 2.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(3.0F, -4.0F, 5.0F);
		LeftLeg.setTextureOffset(0, 34).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 28.0F, 2.0F, 0.0F, false);
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
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}