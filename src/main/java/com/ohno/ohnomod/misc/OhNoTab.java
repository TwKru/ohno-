package com.ohno.ohnomod.misc;

import java.util.Iterator;

import com.ohno.ohnomod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class OhNoTab extends CreativeTabs {

    public OhNoTab(String label) 
    {
        super(label);
    }

    @Override
    public ItemStack  getTabIconItem(){
        return new ItemStack(ModItems.URETHRAN_INGOT);
}
}


