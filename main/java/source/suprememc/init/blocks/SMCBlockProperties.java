package source.suprememc.init.blocks;

import net.minecraft.block.AbstractBlock.Properties;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;


public class SMCBlockProperties 
{
	private MaterialColor color1;
	//private MaterialColor color2;
	public SMCBlockProperties() {}
	public SMCBlockProperties(MaterialColor color)
	{
		this.color1 = color;
	}
	public SMCBlockProperties(MaterialColor sideColor, MaterialColor topColor)
	{
		this.color1 = sideColor;
		//this.color2 = topColor;
	}
	
	final Properties BLOCK_DIAMOND = Properties.create(Material.IRON, this.color1).setRequiresTool().harvestLevel(2).harvestTool(ToolType.PICKAXE).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL);
}
