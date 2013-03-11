package net.minecello.drone;

import net.minecello.drone.block.Block;
import net.minecello.drone.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.ServerStarting;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;

/**
 * 
 * Drone
 * 
 * @author minecello
 *
 */
@NetworkMod(channels = {ReferenceVars.CHANNEL_NAME}, clientSideRequired = true, serverSideRequired = false)
@Mod(modid = ReferenceVars.MOD_ID, name = ReferenceVars.MOD_NAME, version = ReferenceVars.VERSION)
public class Drone
{
	
	@Instance(ReferenceVars.MOD_ID)
	public static Drone instance;
	
	@SidedProxy(clientSide = ReferenceVars.CLIENT_PROXY_CLASS, serverSide = ReferenceVars.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@ServerStarting
	public void serverStarting(FMLServerStartingEvent event)
	{
		//TODO server start-up code
	}
	
	@PreInit
	public void preLoad(FMLPreInitializationEvent event)
	{
		//TODO pre-initialization code
		
		Block.init(); //Initialize all blocks
	}
	
	@Init
	public void load(FMLInitializationEvent event)
	{
		//TODO initialization code
	}
	
	@PostInit
	public void postLoad(FMLPostInitializationEvent event)
	{
		//TODO post-initialization code
	}
	
}