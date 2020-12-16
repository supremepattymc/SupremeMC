package source.suprememc.init.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import source.suprememc.blocks.BlockSMC;

public class SMCBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BURNING_DIAMOND_BLOCK = new BlockSMC(SMCBlockColors.RED.BLOCK_DIAMOND, "burning_diamond_block");
}
