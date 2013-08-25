package pl.starchasers.mod.block;

import java.text.BreakIterator;

import javax.tools.Tool;

import pl.starchasers.mod.WitillitiChest;
import pl.starchasers.mod.tileentity.TileEntityWitillitiChest;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.DestroyBlockProgress;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent.BreakSpeed;

public class BlockWitillitiChest extends BlockContainer {

	public BlockWitillitiChest(int id) {
		super(id, Material.wood);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setHardness(3.0F);
	}

	@Override
	public boolean onBlockActivated(World par1World, int par2, int par3,
			int par4, EntityPlayer par5EntityPlayer, int par6, float par7,
			float par8, float par9) {
		// TODO Auto-generated method stub
		par5EntityPlayer.openGui(WitillitiChest.instance, 0, par1World, par2, par3, par4);
		return true;
	}


	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityWitillitiChest();
	}

}
