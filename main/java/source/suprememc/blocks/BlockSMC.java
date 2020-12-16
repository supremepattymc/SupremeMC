package source.suprememc.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import source.suprememc.SupremeMC;
import source.suprememc.init.SMCItems;
import source.suprememc.init.SMCTabs;
import source.suprememc.init.blocks.SMCBlocks;

public class BlockSMC extends Block implements IItemProvider
{
	public BlockSMC(Properties properties, String name) 
	{
		super(properties);
		setRegistryName(new ResourceLocation(SupremeMC.MOD_ID, name));
		SMCBlocks.BLOCKS.add(this);
		SMCItems.ITEMS.add(new BlockItem(this, new Item.Properties().group(SMCTabs.BLOCKS)).setRegistryName(this.getRegistryName()));
	}
}
