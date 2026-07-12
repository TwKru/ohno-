package com.ohno.ohnomod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.creativetab.CreativeTabs;
import com.ohno.ohnomod.ohno;
import com.ohno.ohnomod.init.ModBlocks;
import com.ohno.ohnomod.init.ModItems;

public class BlockBase extends Block {

    public BlockBase(String name, Material material) {
        super(material);
        setUnlocalizedName("ohnomod." + name);
        setRegistryName(name);
        setCreativeTab(ohno.OhNoTab); 

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
}