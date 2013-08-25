package pl.starchasers.mod.client.gui;

import org.lwjgl.opengl.GL11;

import pl.starchasers.mod.inventory.ContainerWitillitiChest;
import pl.starchasers.mod.tileentity.TileEntityWitillitiChest;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class GuiWitillitiChest extends GuiContainer{
	
	private static final ResourceLocation field_110421_t = new ResourceLocation("minecraft", "textures/gui/container/generic_54.png");
	private int inventoryRows;
	
	
	public GuiWitillitiChest(InventoryPlayer inventoryPlayer, TileEntityWitillitiChest tileentity){
		super(new ContainerWitillitiChest(inventoryPlayer, tileentity));
		
        short short1 = 222;
        int i = short1 - 108;
        this.inventoryRows = tileentity.getSizeInventory() / 9;
        this.ySize = i + this.inventoryRows * 18;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.func_110434_K().func_110577_a(field_110421_t);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.inventoryRows * 18 + 17);
        this.drawTexturedModalRect(k, l + this.inventoryRows * 18 + 17, 0, 126, this.xSize, 96);
        
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		this.fontRenderer.drawString("Witilliti Chest", 8, 6, 4210752);
	}
	
}
