package com.ohno.ohnomod;

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

    @SidedProxy(clientSide = "com.ohno.ohnomod.proxy.ClientProxy", serverSide = "com.ohno.ohnomod.proxy.CommonProxy")
    public static CommonProxy proxy;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        
        net.minecraftforge.fml.common.registry.GameRegistry.addSmelting(
            com.ohno.ohnomod.init.ModBlocks.LEAD_ORE, 
            new net.minecraft.item.ItemStack(com.ohno.ohnomod.init.ModItems.LEAD_INGOT, 1), 
            0.7F
        );
    }
}