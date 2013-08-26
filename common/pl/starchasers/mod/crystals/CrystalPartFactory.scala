package pl.starchasers.mod.crystals

import codechicken.multipart.TMultiPart
import codechicken.multipart.MultiPartRegistry.IPartFactory
import scala.collection.mutable.HashMap
import pl.starchasers.mod.crystals.parts.PartSeedCrystal

class CrystalPartFactory extends IPartFactory {
    
    
    override def createPart(name: String, client: Boolean): TMultiPart = name match {
        case "seedcrystal" => new PartSeedCrystal()
    }
}