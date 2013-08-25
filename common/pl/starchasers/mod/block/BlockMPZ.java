package pl.starchasers.mod.block;

import pl.starchasers.mod.tileentity.TileEntityMPZ;
import pl.starchasers.mod.tileentity.TileEntityWitillitiChest;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockMPZ extends Block{

	public BlockMPZ(int id) {
		super(id, Material.iron);
		this.setHardness(5.0F);
		this.setUnlocalizedName("MPZ");
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3,
			int par4, EntityPlayer par5EntityPlayer, int par6, float par7,
			float par8, float par9) {
		par5EntityPlayer.addExperience(1000);
		TileEntity tmp = par1World.getBlockTileEntity(par2, par3, par4);
		if(tmp!=null && tmp instanceof TileEntityMPZ){
			((TileEntityMPZ)tmp).onBlockActivated(par1World,par2,par3,
					 par4, par5EntityPlayer,par6,par7,
					par8,par9);
		}
		return super.onBlockActivated(par1World, par2, par3, par4, par5EntityPlayer,
				par6, par7, par8, par9);
	}

	@Override
	public boolean hasTileEntity(int metadata) {
		return true;
	}

	@Override
	public TileEntity createTileEntity(World world, int metadata) {
		return new TileEntityMPZ();
	}


}
