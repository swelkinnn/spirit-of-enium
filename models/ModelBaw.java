// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class ModelBaw extends EntityModel<Entity> {
	private final ModelRenderer Baw;
	private final ModelRenderer leg1;
	private final ModelRenderer leg0;
	private final ModelRenderer arm1;
	private final ModelRenderer body_r1;
	private final ModelRenderer arm0;
	private final ModelRenderer body_r2;
	private final ModelRenderer head;
	private final ModelRenderer Jaw;
	private final ModelRenderer body;
	private final ModelRenderer body_r3;
	private final ModelRenderer body_r4;
	private final ModelRenderer body_r5;

	public ModelBaw() {
		textureWidth = 128;
		textureHeight = 128;

		Baw = new ModelRenderer(this);
		Baw.setRotationPoint(0.0F, 24.0F, 0.0F);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-5.0F, -11.0F, 13.0F);
		Baw.addChild(leg1);
		leg1.setTextureOffset(0, 0).addBox(-3.5F, -5.0F, -3.0F, 6.0F, 16.0F, 6.0F, 0.0F, false);

		leg0 = new ModelRenderer(this);
		leg0.setRotationPoint(4.0F, -11.0F, 13.0F);
		Baw.addChild(leg0);
		leg0.setTextureOffset(72, 0).addBox(-1.5F, -5.0F, -3.0F, 6.0F, 16.0F, 6.0F, 0.0F, false);

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(-11.5F, -24.75F, -12.5F);
		Baw.addChild(arm1);
		arm1.setTextureOffset(0, 54).addBox(-3.5F, -5.75F, -3.5F, 6.0F, 30.0F, 8.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(11.5F, -2.25F, 12.0F);
		arm1.addChild(body_r1);
		setRotationAngle(body_r1, -1.5708F, 0.1309F, 0.0F);
		body_r1.setTextureOffset(0, 64).addBox(-11.0F, 3.0F, -2.5F, 0.0F, 8.0F, 28.0F, 0.0F, false);

		arm0 = new ModelRenderer(this);
		arm0.setRotationPoint(11.5F, -24.75F, -12.5F);
		Baw.addChild(arm0);
		arm0.setTextureOffset(28, 54).addBox(-2.5F, -5.75F, -3.5F, 6.0F, 30.0F, 8.0F, 0.0F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(-11.5F, -2.25F, 12.0F);
		arm0.addChild(body_r2);
		setRotationAngle(body_r2, -1.5708F, -0.1309F, 0.0F);
		body_r2.setTextureOffset(0, 64).addBox(11.0F, 3.0F, -2.5F, 0.0F, 8.0F, 28.0F, 0.0F, true);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -24.0F, -17.0F);
		Baw.addChild(head);
		head.setTextureOffset(56, 54).addBox(-7.0F, -5.0F, -3.5F, 14.0F, 10.0F, 8.0F, 0.0F, false);

		Jaw = new ModelRenderer(this);
		Jaw.setRotationPoint(0.0F, 6.5F, 3.5F);
		head.addChild(Jaw);
		Jaw.setTextureOffset(56, 76).addBox(-7.0F, -0.5F, -7.0F, 14.0F, 3.0F, 8.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -18.0F, 1.0F);
		Baw.addChild(body);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(0.0F, -9.0F, -1.5F);
		body.addChild(body_r3);
		setRotationAngle(body_r3, -0.0873F, 0.0F, 0.0F);
		body_r3.setTextureOffset(0, 56).addBox(0.0F, -10.0F, -16.5F, 0.0F, 8.0F, 36.0F, 0.0F, false);
		body_r3.setTextureOffset(0, 0).addBox(-9.0F, -2.0F, -16.5F, 18.0F, 18.0F, 36.0F, 0.0F, false);

		body_r4 = new ModelRenderer(this);
		body_r4.setRotationPoint(0.0F, -9.0F, -1.5F);
		body.addChild(body_r4);
		setRotationAngle(body_r4, -0.0873F, 0.0873F, 0.2618F);
		body_r4.setTextureOffset(0, 56).addBox(4.0F, -10.0F, -16.5F, 0.0F, 8.0F, 36.0F, 0.0F, false);

		body_r5 = new ModelRenderer(this);
		body_r5.setRotationPoint(0.0F, -9.0F, -1.5F);
		body.addChild(body_r5);
		setRotationAngle(body_r5, -0.0873F, -0.0873F, -0.2618F);
		body_r5.setTextureOffset(0, 56).addBox(-4.0F, -10.0F, -16.5F, 0.0F, 8.0F, 36.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Baw.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.leg0.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.arm1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.arm0.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}