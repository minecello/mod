package net.minecello.drone.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

/**
 * 
 * The server-side proxy
 * 
 * @author minecello
 *
 */
public class CommonProxy implements IGuiHandler
{

	//TODO implement other classes to be extended by the client proxy
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if (ID == 0) //TODO check for actual gui id's
		{
			//TODO return the associated container
		}
		
		return null; //Default to null
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		
		if (ID == 0) //TODO check for actual gui id's
		{
			//TODO return the associated gui
		}
		
		return null; //Default to null
	}

	
	
}
