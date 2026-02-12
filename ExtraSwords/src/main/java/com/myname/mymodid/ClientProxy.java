package com.myname.mymodid;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.Item;

public class ClientProxy extends CommonProxy {
    
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }
    
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }
    
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
    
    public void registerItemRender(Item item, int meta, String id) {
        // Não usado no 1.7.10
    }
}