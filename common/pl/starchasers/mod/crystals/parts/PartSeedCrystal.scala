package pl.starchasers.mod.crystals.parts

import codechicken.multipart.TSlottedPart
import codechicken.lib.vec.Vector3
import codechicken.lib.lighting.LazyLightMatrix
import codechicken.lib.render.CCRenderState
import codechicken.multipart.TCuboidPart
import codechicken.lib.vec.Cuboid6
import codechicken.lib.render.RenderUtils
import codechicken.lib.vec.Translation
import codechicken.lib.render.IconTransformation
import net.minecraft.client.renderer.RenderBlocks
import net.minecraft.block.Block
import codechicken.lib.vec.Scale
import codechicken.lib.render.UV
import codechicken.lib.render.CCModel
import java.util.Arrays
import codechicken.lib.render.Vertex5
import cpw.mods.fml.client.FMLClientHandler
import net.minecraft.util.ResourceLocation
import org.lwjgl.opengl.GL11

class PartSeedCrystal extends TSlottedPart with TCuboidPart {

    override def getBounds: Cuboid6 = new Cuboid6(0.2, 0.2, 0.2, 0.8, 0.8, 0.8)
    override def getSlotMask: Int = 1 << 6

    override def getType() = "seedcrystal"

    override def renderStatic(pos: Vector3, olm: LazyLightMatrix, pass: Int) {
        	GL11.glPushMatrix();
        	CCRenderState.reset()

			val model = CCModel.quadModel(100);
			model.generateBlock(0, getBounds);
			model.verts = model.verts take (model.verts.indexOf(null))	
			//FMLClientHandler.instance().getClient().renderEngine.func_110577_a(new ResourceLocation("textures/blocks/iron_ore.png"));
			model.render(pos.x, pos.y, pos.z, 1, 1)
			GL11.glPopMatrix()
			
			    

    }
//    override def drawBreaking(renderBlocks: RenderBlocks) {
//        CCRenderState.reset()
//        RenderUtils.renderBlock(getBounds, 0, new Translation(x, y, z).`with`(new Scale(0.8, 0.8, 0.8)), new IconTransformation(renderBlocks.overrideBlockTexture), null)
//    }

}