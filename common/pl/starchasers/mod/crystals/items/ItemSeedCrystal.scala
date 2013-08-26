package pl.starchasers.mod.crystals.items

import net.minecraft.world.World
import codechicken.multipart.TItemMultiPart
import codechicken.lib.vec.BlockCoord
import net.minecraft.item.ItemStack
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.item.Item
import codechicken.lib.vec.Vector3
import codechicken.multipart.TMultiPart
import net.minecraft.creativetab.CreativeTabBlock
import net.minecraft.creativetab.CreativeTabs
import pl.starchasers.mod.crystals.parts.PartSeedCrystal

class ItemSeedCrystal(id:Int) extends Item (id) with TItemMultiPart {
	
    override def newPart(item:ItemStack, player:EntityPlayer, world:World, pos:BlockCoord, side:Int, vhit:Vector3):TMultiPart = new PartSeedCrystal
    
    this.setCreativeTab(CreativeTabs.tabDecorations);
    this.setUnlocalizedName("item.crystal.seed")
    
}