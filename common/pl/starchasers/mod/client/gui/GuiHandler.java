package pl.starchasers.mod.client.gui;

import pl.starchasers.mod.inventory.ContainerWitillitiChest;
import pl.starchasers.mod.tileentity.TileEntityWitillitiChest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		
		TileEntity te = world.getBlockTileEntity(x, y, z);
		
		if(te instanceof TileEntityWitillitiChest){
			return new ContainerWitillitiChest(player.inventory, (TileEntityWitillitiChest) te);
		}
		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity te = world.getBlockTileEntity(x, y, z);
		
		if(te instanceof TileEntityWitillitiChest){
			return new GuiWitillitiChest(player.inventory, (TileEntityWitillitiChest) te);
		}
		
		return null;
	}

}
