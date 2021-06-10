// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelsiren_head extends EntityModel<Entity> {
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;
	private final ModelRenderer pelvis;
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer sirenmouth;
	private final ModelRenderer head2;
	private final ModelRenderer sirenmouth2;
	private final ModelRenderer leftarm;
	private final ModelRenderer upper;
	private final ModelRenderer lower;
	private final ModelRenderer rightarm;
	private final ModelRenderer upper2;
	private final ModelRenderer lower2;

	public Modelsiren_head() {
		textureWidth = 64;
		textureHeight = 64;

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(-3.1667F, 16.5F, 0.5F);
		leftleg.setTextureOffset(18, 32).addBox(-0.8333F, -13.5F, -0.5F, 1.0F, 20.0F, 1.0F, 0.0F, false);
		leftleg.setTextureOffset(14, 28).addBox(0.1667F, -13.5F, 0.5F, 1.0F, 20.0F, 1.0F, 0.0F, false);
		leftleg.setTextureOffset(28, 20).addBox(-1.8333F, 6.5F, -3.5F, 3.0F, 1.0F, 5.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(3.1667F, 16.5F, 0.5F);
		rightleg.setTextureOffset(10, 28).addBox(-0.1667F, -13.5F, -0.5F, 1.0F, 20.0F, 1.0F, 0.0F, false);
		rightleg.setTextureOffset(6, 28).addBox(-1.1667F, -13.5F, 0.5F, 1.0F, 20.0F, 1.0F, 0.0F, false);
		rightleg.setTextureOffset(22, 7).addBox(-1.1667F, 6.5F, -3.5F, 3.0F, 1.0F, 5.0F, 0.0F, false);

		pelvis = new ModelRenderer(this);
		pelvis.setRotationPoint(0.0F, 0.6667F, 1.0F);
		setRotationAngle(pelvis, 0.1309F, 0.0F, 0.0F);
		pelvis.setTextureOffset(22, 0).addBox(-4.5F, 0.3333F, -1.5F, 9.0F, 2.0F, 2.0F, 0.0F, false);
		pelvis.setTextureOffset(6, 13).addBox(-5.0F, -0.6667F, -1.5F, 10.0F, 1.0F, 2.0F, 0.0F, false);
		pelvis.setTextureOffset(22, 4).addBox(-4.5F, -1.6667F, -1.5F, 9.0F, 1.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(14, 16).addBox(-5.0F, -28.0F, -1.0F, 10.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-4.5F, -36.0F, 0.0F, 9.0F, 11.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(14, 51).addBox(4.5F, -36.0F, 0.0F, 1.0F, 6.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(50, 31).addBox(-5.5F, -36.0F, 0.0F, 1.0F, 6.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(30, 13).addBox(-3.5F, -37.0F, 0.0F, 7.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 13).addBox(-0.5F, -56.0F, 0.0F, 1.0F, 19.0F, 2.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(-2.125F, -14.75F, 0.75F);
		setRotationAngle(head, 0.0F, -0.3927F, 0.0F);
		head.setTextureOffset(52, 18).addBox(0.125F, -14.25F, -0.75F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(22, 34).addBox(-1.875F, -15.25F, -1.75F, 2.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(20, 20).addBox(-2.875F, -16.25F, -2.75F, 1.0F, 6.0F, 6.0F, 0.0F, false);

		sirenmouth = new ModelRenderer(this);
		sirenmouth.setRotationPoint(2.125F, 39.75F, -0.75F);
		head.addChild(sirenmouth);
		sirenmouth.setTextureOffset(32, 55).addBox(-6.0F, -51.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		sirenmouth.setTextureOffset(44, 55).addBox(-6.0F, -56.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		sirenmouth.setTextureOffset(26, 55).addBox(-6.0F, -55.0F, -3.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		sirenmouth.setTextureOffset(20, 55).addBox(-6.0F, -55.0F, 4.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		sirenmouth.setTextureOffset(46, 26).addBox(-6.0F, -57.0F, -1.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		sirenmouth.setTextureOffset(46, 46).addBox(-6.0F, -50.0F, -1.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		sirenmouth.setTextureOffset(38, 55).addBox(-6.0F, -56.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		sirenmouth.setTextureOffset(55, 0).addBox(-6.0F, -51.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		sirenmouth.setTextureOffset(54, 31).addBox(-8.0F, -51.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		sirenmouth.setTextureOffset(54, 28).addBox(-8.0F, -50.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		sirenmouth.setTextureOffset(54, 26).addBox(-8.0F, -50.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		sirenmouth.setTextureOffset(53, 14).addBox(-8.0F, -51.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		sirenmouth.setTextureOffset(53, 6).addBox(-8.0F, -56.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		sirenmouth.setTextureOffset(52, 51).addBox(-8.0F, -57.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		sirenmouth.setTextureOffset(52, 22).addBox(-8.0F, -57.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		sirenmouth.setTextureOffset(52, 12).addBox(-8.0F, -56.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		sirenmouth.setTextureOffset(44, 21).addBox(-8.0F, -49.0F, -1.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		sirenmouth.setTextureOffset(54, 44).addBox(-8.0F, -55.0F, 5.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		sirenmouth.setTextureOffset(54, 39).addBox(-8.0F, -55.0F, -4.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		sirenmouth.setTextureOffset(42, 35).addBox(-8.0F, -58.0F, -1.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		sirenmouth.setTextureOffset(8, 45).addBox(-7.0F, -52.0F, -1.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);
		sirenmouth.setTextureOffset(0, 45).addBox(-7.0F, -57.0F, -1.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);

		head2 = new ModelRenderer(this);
		head2.setRotationPoint(0.875F, -10.75F, 0.75F);
		setRotationAngle(head2, 0.0F, 3.1416F, 0.0F);
		head2.setTextureOffset(0, 52).addBox(-0.875F, -14.25F, -1.75F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head2.setTextureOffset(30, 30).addBox(-2.875F, -15.25F, -2.75F, 2.0F, 4.0F, 4.0F, 0.0F, false);
		head2.setTextureOffset(6, 16).addBox(-3.875F, -16.25F, -3.75F, 1.0F, 6.0F, 6.0F, 0.0F, false);

		sirenmouth2 = new ModelRenderer(this);
		sirenmouth2.setRotationPoint(2.125F, 39.75F, -0.75F);
		head2.addChild(sirenmouth2);
		sirenmouth2.setTextureOffset(49, 4).addBox(-7.0F, -51.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		sirenmouth2.setTextureOffset(47, 18).addBox(-7.0F, -56.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		sirenmouth2.setTextureOffset(53, 54).addBox(-7.0F, -55.0F, -4.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		sirenmouth2.setTextureOffset(8, 52).addBox(-7.0F, -55.0F, 3.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		sirenmouth2.setTextureOffset(41, 8).addBox(-7.0F, -57.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		sirenmouth2.setTextureOffset(41, 3).addBox(-7.0F, -50.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		sirenmouth2.setTextureOffset(0, 47).addBox(-7.0F, -56.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		sirenmouth2.setTextureOffset(46, 44).addBox(-7.0F, -51.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		sirenmouth2.setTextureOffset(46, 31).addBox(-9.0F, -51.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		sirenmouth2.setTextureOffset(42, 40).addBox(-9.0F, -50.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		sirenmouth2.setTextureOffset(42, 0).addBox(-9.0F, -50.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		sirenmouth2.setTextureOffset(36, 18).addBox(-9.0F, -51.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		sirenmouth2.setTextureOffset(36, 16).addBox(-9.0F, -56.0F, 3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		sirenmouth2.setTextureOffset(28, 32).addBox(-9.0F, -57.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		sirenmouth2.setTextureOffset(22, 32).addBox(-9.0F, -57.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		sirenmouth2.setTextureOffset(14, 20).addBox(-9.0F, -56.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		sirenmouth2.setTextureOffset(39, 16).addBox(-9.0F, -49.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		sirenmouth2.setTextureOffset(20, 20).addBox(-9.0F, -55.0F, 4.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		sirenmouth2.setTextureOffset(6, 16).addBox(-9.0F, -55.0F, -5.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		sirenmouth2.setTextureOffset(33, 7).addBox(-9.0F, -58.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		sirenmouth2.setTextureOffset(39, 17).addBox(-8.0F, -52.0F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);
		sirenmouth2.setTextureOffset(34, 22).addBox(-8.0F, -57.0F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(-5.0F, 9.25F, -5.5F);
		setRotationAngle(leftarm, 0.0F, 1.5708F, 0.0F);
		leftarm.setTextureOffset(46, 51).addBox(-7.0F, -22.25F, -2.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		leftarm.setTextureOffset(34, 51).addBox(-9.0F, -9.25F, -4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		upper = new ModelRenderer(this);
		upper.setRotationPoint(-5.0F, -20.25F, -2.5F);
		leftarm.addChild(upper);
		setRotationAngle(upper, -0.1309F, -0.1309F, 0.1745F);
		upper.setTextureOffset(42, 26).addBox(-1.8459F, 0.026F, 1.1331F, 1.0F, 12.0F, 1.0F, 0.0F, false);
		upper.setTextureOffset(42, 42).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 12.0F, 1.0F, 0.0F, false);

		lower = new ModelRenderer(this);
		lower.setRotationPoint(-7.0F, -7.25F, -4.5F);
		leftarm.addChild(lower);
		setRotationAngle(lower, 0.1309F, 0.1309F, -0.0436F);
		lower.setTextureOffset(30, 42).addBox(-1.8459F, 0.026F, 1.1331F, 1.0F, 12.0F, 1.0F, 0.0F, false);
		lower.setTextureOffset(26, 42).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 12.0F, 1.0F, 0.0F, false);
		lower.setTextureOffset(49, 8).addBox(-2.0F, 12.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		lower.setTextureOffset(0, 0).addBox(0.0F, 17.0F, 0.0F, 0.0F, -3.0F, 2.0F, 0.0F, false);
		lower.setTextureOffset(0, 0).addBox(-2.0F, 17.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(10.5F, 9.25F, 3.0F);
		setRotationAngle(rightarm, 0.0F, 3.1416F, 0.0F);
		rightarm.setTextureOffset(49, 0).addBox(3.5F, -22.25F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		rightarm.setTextureOffset(47, 14).addBox(1.5F, -9.25F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		upper2 = new ModelRenderer(this);
		upper2.setRotationPoint(-1.5F, -20.25F, 1.0F);
		rightarm.addChild(upper2);
		setRotationAngle(upper2, -0.1309F, -0.1309F, 0.1745F);
		upper2.setTextureOffset(22, 42).addBox(4.9888F, -1.0617F, 0.0823F, 1.0F, 12.0F, 1.0F, 0.0F, false);
		upper2.setTextureOffset(38, 38).addBox(5.8347F, -1.0877F, -1.0508F, 1.0F, 12.0F, 1.0F, 0.0F, false);

		lower2 = new ModelRenderer(this);
		lower2.setRotationPoint(-3.5F, -7.25F, -1.0F);
		rightarm.addChild(lower2);
		setRotationAngle(lower2, 0.1309F, 0.1309F, -0.0436F);
		lower2.setTextureOffset(34, 38).addBox(5.0877F, 0.4478F, 1.9982F, 1.0F, 12.0F, 1.0F, 0.0F, false);
		lower2.setTextureOffset(0, 34).addBox(5.9335F, 0.4219F, 0.8652F, 1.0F, 12.0F, 1.0F, 0.0F, false);
		lower2.setTextureOffset(46, 40).addBox(4.9335F, 12.4219F, 0.8652F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		lower2.setTextureOffset(0, 0).addBox(4.93F, 17.0F, 2.85F, 2.0F, -3.0F, 0.0F, 0.0F, false);
		lower2.setTextureOffset(0, 0).addBox(4.94F, 17.1F, 1.0F, 0.0F, -3.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		pelvis.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		head2.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}