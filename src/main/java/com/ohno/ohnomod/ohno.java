package com.ohno.ohnomod;

import net.minecraft.creativetab.CreativeTabs; 
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import com.ohno.ohnomod.proxy.CommonProxy;

@Mod(modid = ohno.MODID, name = ohno.NAME, version = ohno.VERSION)
public class ohno 
{
    public static final String MODID = "ohnomod"; 
    public static final String NAME = "OhNo!";
    public static final String VERSION = "1.0";

    @Mod.Instance
    public static ohno instance;

    @SidedProxy(clientSide = "com.ohno.ohnomod.proxy.ClientProxy", serverSide = "com.ohno.ohnomod.proxy.CommonProxy")
    public static CommonProxy proxy;

    private static Logger logger;
    public static final CreativeTabs OhNoTab = new com.ohno.ohnomod.misc.OhNoTab("OhNoTab");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        
        //SMELTING ORES
        net.minecraftforge.fml.common.registry.GameRegistry.addSmelting(
            com.ohno.ohnomod.init.ModBlocks.LEAD_ORE, 
            new net.minecraft.item.ItemStack(com.ohno.ohnomod.init.ModItems.LEAD_INGOT, 1), 
            0.7F
        );
        net.minecraftforge.fml.common.registry.GameRegistry.addSmelting(
            com.ohno.ohnomod.init.ModBlocks.ALUMINIUM_ORE, 
            new net.minecraft.item.ItemStack(com.ohno.ohnomod.init.ModItems.ALUMINIUM_INGOT, 1), 
            0.7F
        );
        net.minecraftforge.fml.common.registry.GameRegistry.addSmelting(
            com.ohno.ohnomod.init.ModBlocks.BERRYLIUM_ORE, 
            new net.minecraft.item.ItemStack(com.ohno.ohnomod.init.ModItems.BERRYLIUM_INGOT, 1), 
            0.7F
        );
        net.minecraftforge.fml.common.registry.GameRegistry.addSmelting(
            com.ohno.ohnomod.init.ModBlocks.THORIUM_ORE, 
            new net.minecraft.item.ItemStack(com.ohno.ohnomod.init.ModItems.THORIUM_INGOT, 1), 
            1.0F
        );
        net.minecraftforge.fml.common.registry.GameRegistry.addSmelting(
            com.ohno.ohnomod.init.ModBlocks.TITANIUM_ORE, 
            new net.minecraft.item.ItemStack(com.ohno.ohnomod.init.ModItems.TITANIUM_INGOT, 1), 
            0.7F
        );
        net.minecraftforge.fml.common.registry.GameRegistry.addSmelting(
            com.ohno.ohnomod.init.ModBlocks.URANIUM_ORE, 
            new net.minecraft.item.ItemStack(com.ohno.ohnomod.init.ModItems.URANIUM_INGOT, 1), 
            1.0F
        );
        net.minecraftforge.fml.common.registry.GameRegistry.addSmelting(
            com.ohno.ohnomod.init.ModBlocks.TUNGSTEN_ORE, 
            new net.minecraft.item.ItemStack(com.ohno.ohnomod.init.ModItems.TUNGSTEN_INGOT, 1), 
            0.7F
        );

        //SMELTING DUSTS
        net.minecraftforge.fml.common.registry.GameRegistry.addSmelting(
            com.ohno.ohnomod.init.ModItems.LEAD_DUST, 
            new net.minecraft.item.ItemStack(com.ohno.ohnomod.init.ModItems.LEAD_INGOT, 1), 
            0.7F
        );
        net.minecraftforge.fml.common.registry.GameRegistry.addSmelting(
            com.ohno.ohnomod.init.ModItems.IRON_DUST, 
            new net.minecraft.item.ItemStack(net.minecraft.init.Items.IRON_INGOT, 1), 
            0.7F
        );
        net.minecraftforge.fml.common.registry.GameRegistry.addSmelting(
            com.ohno.ohnomod.init.ModItems.URANIUM_DUST, 
            new net.minecraft.item.ItemStack(com.ohno.ohnomod.init.ModItems.URANIUM_INGOT, 1), 
            0.7F
        );
        net.minecraftforge.fml.common.registry.GameRegistry.addSmelting(
            com.ohno.ohnomod.init.ModItems.GOLD_DUST, 
            new net.minecraft.item.ItemStack(net.minecraft.init.Items.GOLD_INGOT, 1), 
            0.7F
        );
        net.minecraftforge.fml.common.registry.GameRegistry.addSmelting(
            com.ohno.ohnomod.init.ModItems.THORIUM_DUST, 
            new net.minecraft.item.ItemStack(com.ohno.ohnomod.init.ModItems.THORIUM_INGOT, 1), 
            0.7F
        );
        net.minecraftforge.fml.common.registry.GameRegistry.addSmelting(
            com.ohno.ohnomod.init.ModItems.TITANIUM_DUST, 
            new net.minecraft.item.ItemStack(com.ohno.ohnomod.init.ModItems.TITANIUM_INGOT, 1), 
            0.7F
        );
        net.minecraftforge.fml.common.registry.GameRegistry.addSmelting(
            com.ohno.ohnomod.init.ModItems.STEEL_DUST, 
            new net.minecraft.item.ItemStack(com.ohno.ohnomod.init.ModItems.STEEL_INGOT, 1), 
            0.7F
        );
        net.minecraftforge.fml.common.registry.GameRegistry.addSmelting(
            com.ohno.ohnomod.init.ModItems.DARKSTEEL_DUST, 
            new net.minecraft.item.ItemStack(com.ohno.ohnomod.init.ModItems.DARKSTEEL_INGOT, 1), 
            0.7F
        );
        net.minecraftforge.fml.common.registry.GameRegistry.addSmelting(
            com.ohno.ohnomod.init.ModItems.TUNGSTEN_DUST, 
            new net.minecraft.item.ItemStack(com.ohno.ohnomod.init.ModItems.TUNGSTEN_INGOT, 1), 
            0.7F
        );
        net.minecraftforge.fml.common.registry.GameRegistry.addSmelting(
            com.ohno.ohnomod.init.ModItems.ALUMINIUM_DUST, 
            new net.minecraft.item.ItemStack(com.ohno.ohnomod.init.ModItems.ALUMINIUM_INGOT, 1), 
            0.7F
        );
    }
}