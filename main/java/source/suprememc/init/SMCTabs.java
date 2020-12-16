package source.suprememc.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import source.suprememc.init.blocks.SMCBlocks;


public class SMCTabs 
{
	private static class Tab extends ItemGroup
	{
		private ItemStack tabIcon;
		
		Tab(ItemStack tabIcon, String name)
		{
			super(name);
			this.tabIcon = tabIcon;
		}
		
		// Bug #1
		@Override
		public ItemStack createIcon() { return tabIcon; }
	}
	
	public static final ItemGroup BLOCKS = new Tab(new ItemStack(SMCBlocks.BURNING_DIAMOND_BLOCK), "blocks");
	public static final ItemGroup ITEMS = new Tab(new ItemStack(SMCItems.BURNING_DIAMOND), "items");
}
