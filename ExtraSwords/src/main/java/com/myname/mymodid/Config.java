package com.myname.mymodid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;

@Mod(modid = Config.MODID, version = "1.0.0", name = "ExtraSwords", acceptedMinecraftVersions = "[1.7.10]")
public class Config {
    public static final String MODID = "mymodid";
    public static final Logger LOG = LogManager.getLogger(MODID); // ← ISSO É OBRIGATÓRIO!
    
    @SidedProxy(clientSide = "com.myname.mymodid.ClientProxy", serverSide = "com.myname.mymodid.CommonProxy")
    public static CommonProxy proxy;
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) { proxy.preInit(event); }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) { proxy.init(event); }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) { proxy.postInit(event); }
    @Mod.EventHandler
    public void serverStarting(FMLServerStartingEvent event) { proxy.serverStarting(event); }
}