package com.ohno.ohnomod.init;

import com.ohno.ohnomod.ohno;
import com.ohno.ohnomod.init.ModItems;
import com.ohno.ohnomod.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = ohno.MODID)
public class RegistryHandler {

    // 1. Регистрируем сами БЛОКИ
    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
    }

    // 2. Регистрируем ПРЕДМЕТЫ
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        // Регистрируем обычные предметы
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));

        for (Block block : ModBlocks.BLOCKS) {
            event.getRegistry().register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
        }
    }

    // 3. Регистрируем МОДЕЛИ (и для предметов, и для блоков)
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        // Модели предметов
        for (Item item : ModItems.ITEMS) {
            com.ohno.ohnomod.ohno.proxy.registerItemRenderer(item, 0, "inventory");
        }

        // Модели блоков
        for (Block block : ModBlocks.BLOCKS) {
            com.ohno.ohnomod.ohno.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
        }
    }
}

