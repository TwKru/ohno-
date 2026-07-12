package com.ohno.ohnomod.items;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import com.ohno.ohnomod.ohno;

public class ItemBase extends Item {

    public ItemBase(String name) {
        setUnlocalizedName("ohnomod." + name);
        setRegistryName(name);
        setCreativeTab(ohno.OhNoTab);
    }
}