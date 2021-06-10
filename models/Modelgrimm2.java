// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelgrimm2 extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;
	private final ModelRenderer body;
	private final ModelRenderer collarleft;
	private final ModelRenderer collarright;
	private final ModelRenderer robebottomright;
	private final ModelRenderer robebottomleft;

	public Modelgrimm2() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -3.0F, 0.0F);
		setRotationAngle(head, 0.1309F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 7.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(1.0F, -8.0F, -4.0F, 3.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 3.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-4.0F, -9.0F, -3.0F, 3.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(1.0F, -9.0F, -3.0F, 3.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(1.0F, -10.0F, -2.0F, 3.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-4.0F, -10.0F, -2.0F, 3.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-2.5F, -11.0F, -2.0F, 2.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(0.5F, -11.0F, -2.0F, 2.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(-1.0F, 9.0F, -2.0F);
		setRotationAngle(leftleg, 0.0F, 0.0F, -0.0436F);
		leftleg.setTextureOffset(10, 49).addBox(-2.0F, 0.0F, 0.5F, 2.0F, 15.0F, 3.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(1.0F, 9.0F, 0.0F);
		setRotationAngle(rightleg, 0.0F, 0.0F, 0.0436F);
		rightleg.setTextureOffset(0, 41).addBox(0.0F, 0.0F, -1.5F, 2.0F, 15.0F, 3.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(2.0F, 7.0F, -2.0F);
		setRotationAngle(body, -0.1309F, 0.0F, 0.0F);
		body.setTextureOffset(36, 36).addBox(-5.0F, -10.0F, 0.0F, 6.0F, 12.0F, 4.0F, 0.0F, false);

		collarleft = new ModelRenderer(this);
		collarleft.setRotationPoint(-7.0F, -8.0F, 1.0F);
		setRotationAngle(collarleft, 0.1745F, 0.0436F, -0.5672F);
		collarleft.setTextureOffset(2, 59).addBox(0.0F, -3.0F, -5.0F, 0.0F, 10.0F, 10.0F, 0.0F, false);
		collarleft.setTextureOffset(20, 5).addBox(-0.1F, -3.0F, -5.0F, 0.0F, 10.0F, 10.0F, 0.0F, false);

		collarright = new ModelRenderer(this);
		collarright.setRotationPoint(5.0F, -6.0F, 3.0F);
		setRotationAngle(collarright, 0.1745F, 0.0436F, 0.5672F);
		collarright.setTextureOffset(2, 59).addBox(1.0F, -6.0F, -7.0F, 0.0F, 10.0F, 10.0F, 0.0F, false);
		collarright.setTextureOffset(20, 20).addBox(1.1F, -6.0F, -7.0F, 0.0F, 10.0F, 10.0F, 0.0F, false);

		robebottomright = new ModelRenderer(this);
		robebottomright.setRotationPoint(5.0F, 17.0F, 0.0F);
		setRotationAngle(robebottomright, 0.0F, 0.0F, -0.1745F);
		robebottomright.setTextureOffset(0, 91).addBox(-0.5F, -8.0F, -5.0F, 0.0F, 13.0F, 10.0F, 0.0F, false);
		robebottomright.setTextureOffset(0, 18).addBox(-0.4F, -8.0F, -5.0F, 0.0F, 13.0F, 10.0F, 0.0F, false);

		robebottomleft = new ModelRenderer(this);
		robebottomleft.setRotationPoint(-4.5F, 15.5F, 0.0F);
		setRotationAngle(robebottomleft, 0.0F, 0.0F, 0.1745F);
		robebottomleft.setTextureOffset(0, 91).addBox(0.0F, -6.5F, -5.0F, 0.0F, 13.0F, 10.0F, 0.0F, false);
		robebottomleft.setTextureOffset(0, 5).addBox(-0.1F, -6.5F, -5.0F, 0.0F, 13.0F, 10.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		collarleft.render(matrixStack, buffer, packedLight, packedOverlay);
		collarright.render(matrixStack, buffer, packedLight, packedOverlay);
		robebottomright.render(matrixStack, buffer, packedLight, packedOverlay);
		robebottomleft.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}