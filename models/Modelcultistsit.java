// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelcultistsit extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public Modelcultistsit() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, 0.5672F, 0.3491F, -0.1309F);
		Head.setTextureOffset(0, 0).addBox(-7.279F, 3.1512F, -4.9481F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(20, 16).addBox(-6.279F, 2.1512F, 1.0519F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(24, 20).addBox(-6.279F, 3.1512F, 3.0519F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(24, 0).addBox(-5.279F, 5.1512F, 3.0519F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(-4.279F, 5.1512F, 4.0519F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 2).addBox(-3.279F, 4.1512F, 5.0519F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(0, 16).addBox(-4.0F, 10.0F, 4.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RightArm, -0.0436F, 0.3927F, 0.1047F);
		RightArm.setTextureOffset(36, 36).addBox(-4.3304F, 7.6765F, 4.3714F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(LeftArm, 0.0436F, -0.1745F, -0.0436F);
		LeftArm.setTextureOffset(32, 0).addBox(-0.3879F, 8.2418F, 3.5435F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		setRotationAngle(RightLeg, -1.5708F, 0.3927F, -0.1309F);
		RightLeg.setTextureOffset(0, 32).addBox(-5.602F, -5.0438F, 7.9144F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		setRotationAngle(LeftLeg, -1.5708F, -0.1745F, -0.0873F);
		LeftLeg.setTextureOffset(24, 24).addBox(-1.717F, -6.0603F, 7.9619F, 4.0F, 12.0F, 4.0F, 0.0F, false);
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
	}
}