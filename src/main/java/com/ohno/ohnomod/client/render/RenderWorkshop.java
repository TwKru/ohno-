package com.ohno.ohnomod.client.render;

import com.ohno.ohnomod.tileentity.TileEntityWorkshop;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderWorkshop extends TileEntitySpecialRenderer<TileEntityWorkshop> {

    // Путь к нашей временной текстуре
    private static final ResourceLocation TEXTURE = new ResourceLocation("ohnomod", "textures/blocks/workshop_placeholder.png");

    @Override
    public void render(TileEntityWorkshop te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        this.bindTexture(TEXTURE);

        GlStateManager.pushMatrix();
        GlStateManager.translate(x, y, z);
        GlStateManager.disableLighting();

        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder buffer = tessellator.getBuffer();

        // Начинаем рисовать кастомный куб размером 2x3x2 по вершинам
        buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);

        // Размеры куба
        double minX = 0, maxX = 2.0;
        double minY = 0, maxY = 3.0;
        double minZ = 0, maxZ = 2.0;

        // Северная сторона
        buffer.pos(minX, minY, minZ).tex(0, 3).endVertex();
        buffer.pos(minX, maxY, minZ).tex(0, 0).endVertex();
        buffer.pos(maxX, maxY, minZ).tex(2, 0).endVertex();
        buffer.pos(maxX, minY, minZ).tex(2, 3).endVertex();

        // Южная сторона
        buffer.pos(minX, minY, maxZ).tex(0, 3).endVertex();
        buffer.pos(maxX, minY, maxZ).tex(2, 3).endVertex();
        buffer.pos(maxX, maxY, maxZ).tex(2, 0).endVertex();
        buffer.pos(minX, maxY, maxZ).tex(0, 0).endVertex();

        // Восточная сторона
        buffer.pos(maxX, minY, minZ).tex(0, 3).endVertex();
        buffer.pos(maxX, maxY, minZ).tex(0, 0).endVertex();
        buffer.pos(maxX, maxY, maxZ).tex(2, 0).endVertex();
        buffer.pos(maxX, minY, maxZ).tex(2, 3).endVertex();

        // Западная сторона
        buffer.pos(minX, minY, minZ).tex(0, 3).endVertex();
        buffer.pos(minX, minY, maxZ).tex(2, 3).endVertex();
        buffer.pos(minX, maxY, maxZ).tex(2, 0).endVertex();
        buffer.pos(minX, maxY, minZ).tex(0, 0).endVertex();

        // Верхняя сторона
        buffer.pos(minX, maxY, minZ).tex(0, 0).endVertex();
        buffer.pos(minX, maxY, maxZ).tex(0, 2).endVertex();
        buffer.pos(maxX, maxY, maxZ).tex(2, 2).endVertex();
        buffer.pos(maxX, maxY, minZ).tex(2, 0).endVertex();

        // Нижняя сторона
        buffer.pos(minX, minY, minZ).tex(0, 0).endVertex();
        buffer.pos(maxX, minY, minZ).tex(2, 0).endVertex();
        buffer.pos(maxX, minY, maxZ).tex(2, 2).endVertex();
        buffer.pos(minX, minY, maxZ).tex(0, 2).endVertex();

        tessellator.draw();

        GlStateManager.enableLighting();
        GlStateManager.popMatrix();
    }
}