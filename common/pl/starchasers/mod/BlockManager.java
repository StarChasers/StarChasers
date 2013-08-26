package pl.starchasers.mod;

import pl.starchasers.mod.block.BlockMPZ;
import pl.starchasers.mod.block.BlockWitillitiChest;
import pl.starchasers.mod.tileentity.TileEntityMPZ;
import pl.starchasers.mod.tileentity.TileEntityWitillitiChest;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockManager {
	
	public static BlockManager instance;
	public final BlockWitillitiChest witillitiChestBlock = new BlockWitillitiChest(Registry.getBlockID("WitillitiChest"));
	public final BlockMPZ mpz = new BlockMPZ(Registry.getBlockID("MPZ"));
	public BlockManager(){
		instance = this;
	}
	public void registerBlocks(){
		

		
		GameRegistry.registerBlock(witillitiChestBlock, "WitillitiChest");
		GameRegistry.registerTileEntity(TileEntityWitillitiChest.class, "WitillitiChest");
		LanguageRegistry.addName(witillitiChestBlock, "Witilliti Chest");	
		
		GameRegistry.registerBlock(mpz, "MPZ");
		GameRegistry.registerTileEntity(TileEntityMPZ.class, "MPZ");
		LanguageRegistry.addName(mpz, "MPZ");
		
		
	}

}
