package net.minecello.drone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@Mod(modid = "Drone", name = "Drone", version = "0.0")
public class Drone
{
	
	public static Block test;
	
	@Init
	public void load(FMLInitializationEvent event)
	{
		//TODO initialization code
		
		{
			test = new Block(0, Material.wood).setBlockName("Test").setHardness(40F).setResistance(20F);
		}
		
		{
			GameRegistry.registerBlock(test, "Test");
		}
		
		{
			LanguageRegistry.addName(test, "Test");
		}
	}
	
}