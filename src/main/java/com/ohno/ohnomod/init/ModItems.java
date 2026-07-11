package com.ohno.ohnomod.init;

import com.ohno.ohnomod.items.ItemBase;
import net.minecraft.item.Item;
import java.util.ArrayList;
import java.util.List;

public class ModItems {

    //ДОБАВЛЕНИЕ ПРЕДМЕТОВ
    public static final List<Item> ITEMS = new ArrayList<Item>();
    //plates
    public static final Item GOLD_PLATE = new ItemBase("gold_plate");
    public static final Item LEAD_PLATE = new ItemBase("lead_plate");
    public static final Item IRON_PLATE = new ItemBase("iron_plate");
    public static final Item URAN_PLATE = new ItemBase("uranium_plate");
    public static final Item THORIUM_PLATE = new ItemBase("thorium_plate");
    public static final Item TUNGSTEN_PLATE = new ItemBase("tungsten_plate");
    public static final Item STEEL_PLATE = new ItemBase("steel_plate");
    public static final Item TITANIUM_PLATE = new ItemBase("titanium_plate");
    public static final Item DARKSTEEL_PLATE = new ItemBase("darksteel_plate");
    public static final Item ALUMINIUM_PLATE = new ItemBase("aluminium_plate");

    //dusts
    public static final Item LEAD_DUST = new ItemBase("lead_dust");
    public static final Item IRON_DUST = new ItemBase("iron_dust");
    public static final Item GOLD_DUST = new ItemBase("gold_dust");
    public static final Item URAN_DUST = new ItemBase("uran_dust");
    public static final Item TITANIUM_DUST = new ItemBase("titanium_dust");
    public static final Item THORIUM_DUST = new ItemBase("thorium_dust");
    public static final Item TUNGSTEN_DUST = new ItemBase("tungsten_dust");
    public static final Item OBSIDIAN_DUST = new ItemBase("obsidian_dust");
    public static final Item DIAMOND_DUST = new ItemBase("diamond_dust");
    public static final Item EMERALD_DUST = new ItemBase("emerald_dust");
    public static final Item STEEL_DUST = new ItemBase("steel_dust");
    public static final Item DARKSTEEL_DUST = new ItemBase("darksteel_dust");
    public static final Item ALUMINIUM_DUST = new ItemBase("aluminium_dust");


    //ingots
    public static final Item LEAD_INGOT = new ItemBase("lead_ingot");
    public static final Item THORIUM_INGOT = new ItemBase("thorium_ingot");
    public static final Item URANIUM_INGOT = new ItemBase("uranium_ingot");
    public static final Item URETHRA_INGOT = new ItemBase("urethra_ingot");
    public static final Item STEEL_INGOT = new ItemBase("steel_ingot");
    public static final Item DARKSTEEL_INGOT = new ItemBase("darksteel_ingot");
    public static final Item TITANIUM_INGOT = new ItemBase("titanium_ingot");
    public static final Item TUNGSTEN_INGOT = new ItemBase("tungsten_ingot");
    public static final Item ALUMINIUM_INGOT = new ItemBase("aluminium_ingot");
    public static final Item URETHRAN_INGOT = new ItemBase("urethran_ingot");
    public static final Item PURE_URETHRA_INGOT = new ItemBase("pure_urethra_ingot");

    //OTHER
    public static final Item FIRECLAY = new ItemBase("fireclay");
    public static final Item FIRECLAY_BRICK = new ItemBase("fireclay_brick");
    


    static {
        //PLATES
        ITEMS.add(GOLD_PLATE);
        ITEMS.add(LEAD_PLATE);
        ITEMS.add(IRON_PLATE);
        ITEMS.add(URAN_PLATE);
        ITEMS.add(THORIUM_PLATE);
        ITEMS.add(TUNGSTEN_PLATE);
        ITEMS.add(STEEL_PLATE);
        ITEMS.add(TITANIUM_PLATE);
        ITEMS.add(DARKSTEEL_PLATE);
        ITEMS.add(ALUMINIUM_PLATE);

        //DUSTS
        ITEMS.add(LEAD_DUST);
        ITEMS.add(IRON_DUST);
        ITEMS.add(GOLD_DUST);
        ITEMS.add(URAN_DUST);
        ITEMS.add(THORIUM_DUST);
        ITEMS.add(TITANIUM_DUST);
        ITEMS.add(STEEL_DUST);
        ITEMS.add(DARKSTEEL_DUST);
        ITEMS.add(TUNGSTEN_DUST);
        ITEMS.add(DIAMOND_DUST);
        ITEMS.add(EMERALD_DUST);
        ITEMS.add(OBSIDIAN_DUST);
        ITEMS.add(ALUMINIUM_DUST);

        //INGOTS
        ITEMS.add(LEAD_INGOT);
        ITEMS.add(URANIUM_INGOT);
        ITEMS.add(URETHRA_INGOT);
        ITEMS.add(THORIUM_INGOT);
        ITEMS.add(TITANIUM_INGOT);
        ITEMS.add(STEEL_INGOT);
        ITEMS.add(DARKSTEEL_INGOT);
        ITEMS.add(TUNGSTEN_INGOT);
        ITEMS.add(PURE_URETHRA_INGOT);
        ITEMS.add(URETHRAN_INGOT);
        ITEMS.add(ALUMINIUM_INGOT);

        //OTHER
        ITEMS.add(FIRECLAY);
        ITEMS.add(FIRECLAY_BRICK);
    }
}