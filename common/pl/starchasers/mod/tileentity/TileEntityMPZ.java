package pl.starchasers.mod.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntityMPZ extends TileEntity{
	int click = 0;
	long tick = 0;
	public void onBlockActivated(World par1World, int par2, int par3, int par4,
			EntityPlayer par5EntityPlayer, int par6, float par7, float par8,
			float par9) {
		click++;
		
	}

	@Override
	public void updateEntity() {
		if(tick>=Long.MAX_VALUE) tick = 0;
		if(tick%20 == 0)System.out.println(click);
		tick++;
		super.updateEntity();
		
	}

}
