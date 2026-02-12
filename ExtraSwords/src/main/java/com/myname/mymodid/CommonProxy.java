package com.myname.mymodid;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import com.myname.mymodid.items.ModItems;
import com.myname.mymodid.Config;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        ModItems.registerItems();
        Config.LOG.info("ExtraSwords loading!");
    }

    public void init(FMLInitializationEvent event) {
        ModItems.registerRecipes();
    }

    public void postInit(FMLPostInitializationEvent event) {}

    public void serverStarting(FMLServerStartingEvent event) {}
}