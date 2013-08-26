package pl.starchasers.mod.crystals

import pl.starchasers.mod.Proxy
import cpw.mods.fml.relauncher.SideOnly
import cpw.mods.fml.relauncher.Side
import cpw.mods.fml.common.registry.GameRegistry
import pl.starchasers.mod.crystals.items.ItemSeedCrystal
import pl.starchasers.mod.Registry
import cpw.mods.fml.common.registry.LanguageRegistry
import pl.starchasers.mod.BlockManager
import codechicken.multipart.MultiPartRegistry
import pl.starchasers.mod.crystals.client.ModelsLibrary

class CrystalProxyCommon extends Proxy {
	
	
    override def preInit() = {

    }
    override def load() = {
        val itemSeedCrystal = new ItemSeedCrystal(Registry.getItemID("seedCrystal"));
        
        GameRegistry.registerItem(itemSeedCrystal, "item.crystal.seed")
        LanguageRegistry.addName(itemSeedCrystal, "Crystal Seed")
        
        MultiPartRegistry.registerParts(Crystals.partFactory, Array("seedcrystal"))
    }

    override def postInit() = {}

}

class CrystalProxyClient extends CrystalProxyCommon {
    @SideOnly(Side.CLIENT)
    override def preInit() = {
        super.preInit()
        
        ModelsLibrary.loadModels()
        
    }
    @SideOnly(Side.CLIENT)
    override def load() = {
        super.load()
        
        
    }

    @SideOnly(Side.CLIENT)
    override def postInit() = {
        super.postInit()
        
        
    }
}

object CrystalProxy extends CrystalProxyClient {

    
}

