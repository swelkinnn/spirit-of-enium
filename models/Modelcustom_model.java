// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;

	public Modelcustom_model() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.0F, 0.0F);
		setRotationAngle(head, -0.0436F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -6.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(26, 16).addBox(-4.0F, -6.0F, 4.0F, 8.0F, 7.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(38, 18).addBox(4.0F, -2.0F, -2.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(32, 36).addBox(-5.0F, -2.0F, -2.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(0, 4).addBox(-4.0F, -3.0F, -5.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(1.0F, -3.0F, -5.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(38, 28).addBox(-3.0F, -8.0F, -3.0F, 6.0F, 2.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(44, 3).addBox(-2.0F, -9.0F, -2.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(44, 6).addBox(-1.5F, -11.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(24, 0).addBox(-0.5F, -12.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(40, 38).addBox(0.0F, -7.0F, 1.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(40, 38).addBox(-3.0F, -7.0F, 1.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(43, 15).addBox(0.5F, -8.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(43, 15).addBox(-2.5F, -8.0F, 2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(41, 0).addBox(1.0F, -9.0F, 3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(41, 0).addBox(-2.0F, -9.0F, 3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 4.0F, 0.0F);
		setRotationAngle(body, -0.0436F, 0.0F, 0.0F);
		body.setTextureOffset(0, 16).addBox(-4.0F, -4.0F, -2.0F, 8.0F, 11.0F, 5.0F, 0.0F, false);

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(leftarm, 0.0436F, 0.0F, 0.0F);
		leftarm.setTextureOffset(0, 32).addBox(-7.0F, 1.0F, -1.5F, 3.0F, 13.0F, 3.0F, 0.0F, false);
		leftarm.setTextureOffset(42, 42).addBox(-9.0F, 0.0F, -2.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);
		leftarm.setTextureOffset(24, 60).addBox(-6.5F, 12.0F, 3.0F, 2.0F, 2.0F, -8.0F, 0.0F, false);
		leftarm.setTextureOffset(0, 48).addBox(-9.0F, 9.1213F, -6.0F, 7.0F, 7.0F, 2.0F, 0.0F, false);
		leftarm.setTextureOffset(0, 48).addBox(-8.5F, 9.5F, -8.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);
		leftarm.setTextureOffset(0, 48).addBox(-8.0F, 10.0F, -10.0F, 5.0F, 5.0F, 2.0F, 0.0F, false);
		leftarm.setTextureOffset(0, 48).addBox(-7.5F, 10.5F, -12.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
		leftarm.setTextureOffset(0, 48).addBox(-7.0F, 11.0F, -14.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		leftarm.setTextureOffset(0, 48).addBox(-6.5F, 11.5F, -16.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		leftarm.setTextureOffset(0, 48).addBox(-6.0F, 12.0F, -18.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(rightarm, 0.0436F, 0.0F, 0.0F);
		rightarm.setTextureOffset(26, 26).addBox(4.0F, 1.0F, -1.5F, 3.0F, 13.0F, 3.0F, 0.0F, false);
		rightarm.setTextureOffset(40, 33).addBox(4.0F, 0.0F, -2.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(0.0F, 11.0F, 0.0F);
		leftleg.setTextureOffset(32, 0).addBox(-3.5F, 0.0F, -1.5F, 3.0F, 13.0F, 3.0F, 0.0F, false);

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(0.0F, 11.0F, 0.0F);
		rightleg.setTextureOffset(12, 32).addBox(0.5F, 0.0F, -1.5F, 3.0F, 13.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leftarm.render(matrixStack, buffer, packedLight, packedOverlay);
		rightarm.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}