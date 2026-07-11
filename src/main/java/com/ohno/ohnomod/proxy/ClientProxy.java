package com.ohno.ohnomod.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.ohno.ohnomod.tileentity.TileEntityWorkshop;
import com.ohno.ohnomod.client.render.RenderWorkshop;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
    }

    public void preInit(FMLPreInitializationEvent event) {
        // Включаем поддержку загрузки OBJ моделей
        OBJLoader.INSTANCE.addDomain("ohnomod");
    }

    public void init(FMLInitializationEvent event) {
        // Связываем наш рендер с тайлом мастерской
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWorkshop.class, new RenderWorkshop());
    }
}