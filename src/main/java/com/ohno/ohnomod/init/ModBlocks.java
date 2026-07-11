package com.ohno.ohnomod.init;

import com.ohno.ohnomod.blocks.BlockBase;
import com.ohno.ohnomod.blocks.BlockWorkshop;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    //ORES
    public static final Block LEAD_ORE = new BlockBase("lead_ore", Material.ROCK);
    public static final Block TUNGSTEN_ORE = new BlockBase("tungsten_ore", Material.ROCK);
    public static final Block ALUMINIUM_ORE = new BlockBase("aluminium_ore", Material.ROCK);
    public static final Block URANIUM_ORE = new BlockBase("uranium_ore", Material.ROCK);
    public static final Block THORIUM_ORE = new BlockBase("thorium_ore", Material.ROCK);
    public static final Block TITANIUM_ORE = new BlockBase("titanium_ore", Material.ROCK);
    public static final Block BERRYLIUM_ORE = new BlockBase("berrylium_ore", Material.ROCK);
    public static final Block BAUXITE_ORE = new BlockBase("bauxite_ore", Material.ROCK);
    public static final Block COBALT_ORE = new BlockBase("cobalt_ore", Material.ROCK);
    public static final Block WORKSHOP = new BlockWorkshop("workshop", Material.IRON);

    static {
        //ORES
        LEAD_ORE.setHardness(3.0F);
        LEAD_ORE.setResistance(5.0F);
        LEAD_ORE.setHarvestLevel("pickaxe", 1);
        TUNGSTEN_ORE.setHardness(4.0F);
        TUNGSTEN_ORE.setResistance(5.0F);
        TUNGSTEN_ORE.setHarvestLevel("pickaxe", 2);
        ALUMINIUM_ORE.setHardness(3.0F);
        ALUMINIUM_ORE.setResistance(5.0F);
        ALUMINIUM_ORE.setHarvestLevel("pickaxe", 2);
        URANIUM_ORE.setHardness(5.0F);
        URANIUM_ORE.setResistance(5.0F);
        URANIUM_ORE.setHarvestLevel("pickaxe", 3);
        THORIUM_ORE.setHardness(5.0F);
        THORIUM_ORE.setResistance(5.0F);
        THORIUM_ORE.setHarvestLevel("pickaxe", 3);
        TITANIUM_ORE.setHardness(4.0F);
        TITANIUM_ORE.setResistance(5.0F);
        TITANIUM_ORE.setHarvestLevel("pickaxe", 3);
        BERRYLIUM_ORE.setHardness(3.0F);
        BERRYLIUM_ORE.setResistance(5.0F);
        BERRYLIUM_ORE.setHarvestLevel("pickaxe", 2);
        BAUXITE_ORE.setHardness(3.0F);
        BAUXITE_ORE.setResistance(5.0F);
        BAUXITE_ORE.setHarvestLevel("pickaxe", 2);
        COBALT_ORE.setHardness(6.0F);
        COBALT_ORE.setResistance(5.0F);
        COBALT_ORE.setHarvestLevel("pickaxe", 4);

        //Создаём
        BLOCKS.add(LEAD_ORE);
        BLOCKS.add(TUNGSTEN_ORE);
        BLOCKS.add(URANIUM_ORE);
        BLOCKS.add(THORIUM_ORE);
        BLOCKS.add(TITANIUM_ORE);
        BLOCKS.add(BERRYLIUM_ORE);
        BLOCKS.add(BAUXITE_ORE);
        BLOCKS.add(COBALT_ORE);
        BLOCKS.add(WORKSHOP);
    }
}