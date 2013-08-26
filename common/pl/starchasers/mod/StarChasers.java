package pl.starchasers.mod;

import codechicken.lib.config.ConfigFile;
import pl.starchasers.mod.client.gui.GuiHandler;
import pl.starchasers.mod.crystals.CrystalProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.SidedProxy;

@Mod(modid = "Starchasers", name = "StarchasersMOD", version = "0.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class StarChasers {
	
	@Instance("Starchasers")
	public static StarChasers instance;
	
	@SidedProxy(modId = "Starchasers", clientSide = "pl.starchasers.mod.client.ClientProxy", serverSide = "pl.starchasers.mod.CommonProxy")
	public static CommonProxy proxy;
	
	public static ConfigFile config = null;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit();
		config = new ConfigFile(event.getSuggestedConfigurationFile());
		Registry.init();

	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		new BlockManager();
		BlockManager.instance.registerBlocks();
		NetworkRegistry.instance().registerGuiHandler(this, new GuiHandler());
		proxy.load();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("Mod Starchasers Loaded");

	}

}
