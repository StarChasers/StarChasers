package pl.starchasers.mod.crystals.client

import scala.collection.mutable.HashMap
import net.minecraftforge.client.model.IModelCustom
import net.minecraftforge.client.model.AdvancedModelLoader

object ModelsLibrary {
    protected val models = HashMap[String, IModelCustom]()

    def loadModels() {
        models += ("seedcrystal" -> AdvancedModelLoader.loadModel("/assets/starchasers/models/seedCrystal.obj"))
    }

    def getModel(name: String): IModelCustom = models.get(name).getOrElse(throw new RuntimeException("Model for: " + name + " hadn't been found"))

}
