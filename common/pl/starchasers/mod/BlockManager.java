package pl.starchasers.mod;

import pl.starchasers.mod.block.BlockWitillitiChest;
import pl.starchasers.mod.tileentity.TileEntityWitillitiChest;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BlockManager {
	
	public static BlockManager instance;
	public final BlockWitillitiChest witillitiChestBlock = new BlockWitillitiChest(Config.instance.witillitichestID);
	public BlockManager(){
		instance = this;
	}
	public void registerBlocks(){
		GameRegistry.registerBlock(witillitiChestBlock, "Witilliti Chest");
		GameRegistry.registerTileEntity(TileEntityWitillitiChest.class, "Witilliti Chest");
		LanguageRegistry.addName(witillitiChestBlock, "Witilliti Chest");
		
	}

}
