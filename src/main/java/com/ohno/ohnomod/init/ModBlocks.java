package com.ohno.ohnomod.init;

import com.ohno.ohnomod.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    // Просто создаем блок
    public static final Block LEAD_ORE = new BlockBase("lead_ore", Material.ROCK);
    public static final Block TUNGSTEN_ORE = new BlockBase("tungsten_ore", Material.ROCK);

    static {
        //ORES
        LEAD_ORE.setHardness(3.0F);
        LEAD_ORE.setResistance(5.0F);
        LEAD_ORE.setHarvestLevel("pickaxe", 1);
        TUNGSTEN_ORE.setHardness(3.0F);
        TUNGSTEN_ORE.setResistance(5.0F);
        TUNGSTEN_ORE.setHarvestLevel("pickaxe", 2);

        //Создаём
        BLOCKS.add(LEAD_ORE);
    }
}