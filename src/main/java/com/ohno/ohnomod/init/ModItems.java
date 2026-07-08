package com.ohno.ohnomod.init;

import com.ohno.ohnomod.items.ItemBase;
import net.minecraft.item.Item;
import java.util.ArrayList;
import java.util.List;

public class ModItems {

    // Список, куда автоматически собираются все предметы мода
    public static final List<Item> ITEMS = new ArrayList<Item>();

    // Твой предмет
    public static final Item RUBY_INGOT = new ItemBase("ruby_ingot");
    
    static {
        ITEMS.add(RUBY_INGOT);
    }
}