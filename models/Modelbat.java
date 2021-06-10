// Made with Blockbench 3.8.3
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelbat extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer rightEar;
	private final ModelRenderer leftEar;
	private final ModelRenderer body;
	private final ModelRenderer rightWing;
	private final ModelRenderer rightWingTip;
	private final ModelRenderer leftWing;
	private final ModelRenderer leftWingTip;

	public Modelbat() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		rightEar = new ModelRenderer(this);
		rightEar.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(rightEar);
		rightEar.setTextureOffset(24, 0).addBox(-4.0F, -6.0F, -2.0F, 3.0F, 4.0F, 1.0F, 0.0F, false);

		leftEar = new ModelRenderer(this);
		leftEar.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(leftEar);
		leftEar.setTextureOffset(24, 0).addBox(1.0F, -6.0F, -2.0F, 3.0F, 4.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(body, 0.5236F, 0.0F, 0.0F);
		body.setTextureOffset(0, 16).addBox(-3.0F, 4.0F, -3.0F, 6.0F, 12.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(1, 35).addBox(-5.0F, 16.0F, 0.0F, 10.0F, 16.0F, 0.0F, 0.0F, false);

		rightWing = new ModelRenderer(this);
		rightWing.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(rightWing);
		rightWing.setTextureOffset(43, 1).addBox(-12.0F, 1.0F, 1.5F, 10.0F, 16.0F, 0.0F, 0.0F, false);

		rightWingTip = new ModelRenderer(this);
		rightWingTip.setRotationPoint(-12.0F, 1.0F, 1.5F);
		rightWing.addChild(rightWingTip);
		rightWingTip.setTextureOffset(25, 17).addBox(-8.0F, 1.0F, 0.0F, 8.0F, 12.0F, 0.0F, 0.0F, false);

		leftWing = new ModelRenderer(this);
		leftWing.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(leftWing);
		leftWing.setTextureOffset(33, 1).addBox(2.0F, 1.0F, 1.5F, 10.0F, 16.0F, 0.0F, 0.0F, false);

		leftWingTip = new ModelRenderer(this);
		leftWingTip.setRotationPoint(12.0F, 1.0F, 1.5F);
		leftWing.addChild(leftWingTip);
		leftWingTip.setTextureOffset(24, 29).addBox(0.0F, 1.0F, 0.0F, 8.0F, 12.0F, 0.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightWingTip.rotateAngleY = f4 / (180F / (float) Math.PI);
		this.leftEar.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.leftEar.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leftWingTip.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.rightEar.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.rightEar.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.leftWing.rotateAngleY = f4 / (180F / (float) Math.PI);
		this.rightWing.rotateAngleY = f4 / (180F / (float) Math.PI);
	}
}