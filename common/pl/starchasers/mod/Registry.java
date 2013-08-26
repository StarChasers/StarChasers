package pl.starchasers.mod;

import codechicken.lib.config.ConfigTag;
import net.minecraft.item.ItemStack;

public class Registry {
	
	private static ConfigTag itemsIds = null;
	private static ConfigTag blocksIds = null;
	
	private static boolean inited = false;
	
	
	public static int getItemID(String name){
		return itemsIds.getId(name);
	}
	
	public static int getBlockID(String name){
		return blocksIds.getId(name);
	}
	
	public static void init(){
		itemsIds = StarChasers.config.getTag("ItemsIDs", true);
		itemsIds.setComment("Items IDs").useBraces();
		itemsIds.setBaseID(10000);
		
		blocksIds = StarChasers.config.getTag("BlocksIDs", true);
		blocksIds.setComment("Blocks IDs").useBraces();
		blocksIds.setBaseID(1000);
		
	}

	
	
	
}
