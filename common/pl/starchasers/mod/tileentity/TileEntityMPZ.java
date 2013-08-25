package pl.starchasers.mod.tileentity;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntityMPZ extends TileEntity{
	ItemStack item =  null;
	int click;
	long tick = 0;
	public void onBlockActivated(World par1World, int par2, int par3, int par4,
			EntityPlayer par5EntityPlayer, int par6, float par7, float par8,
			float par9) {
		click++;
		System.out.println(click);
	}
	@Override
	public void readFromNBT(NBTTagCompound par1nbtTagCompound) {
		super.readFromNBT(par1nbtTagCompound);
	    NBTTagCompound tag = par1nbtTagCompound.getCompoundTag("inv");
                        item = ItemStack.loadItemStackFromNBT(tag);
	}
	@Override
	public void writeToNBT(NBTTagCompound par1nbtTagCompound) {
		super.writeToNBT(par1nbtTagCompound);
		if(item != null){
            NBTTagCompound tag = new NBTTagCompound();
            item.writeToNBT(tag);
            par1nbtTagCompound.setCompoundTag("inv", tag);
		}	
	}
	public void activated(World par1World, EntityPlayer par5EntityPlayer) {
		if (item == null){
			ItemStack tmp = par5EntityPlayer.getHeldItem();
			if(tmp != null){
				item = tmp.splitStack(tmp.getMaxStackSize());
			}
		}else{
			par1World.spawnEntityInWorld(
					new EntityItem(par1World,par5EntityPlayer.posX,par5EntityPlayer.posY,par5EntityPlayer.posZ,item));
			item = null;
		}
		
		
	}
	
/*
	@Override
	public void updateEntity() {
		if(tick>=Long.MAX_VALUE) tick = 0;
		if(tick%20 == 0)
		tick++;
		super.updateEntity();
		
	}
*/
}
