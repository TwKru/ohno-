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

    static {
        // А здесь настраиваем его свойства отдельно, чтобы не ломать типы данных
        LEAD_ORE.setHardness(3.0F);
        LEAD_ORE.setResistance(5.0F);
        LEAD_ORE.setHarvestLevel("pickaxe", 2);

        // Добавляем в список
        BLOCKS.add(LEAD_ORE);
    }
}