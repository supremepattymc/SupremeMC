package source.suprememc.items;

import source.suprememc.init.SMCItems;
import source.suprememc.init.SMCTabs;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import source.suprememc.SupremeMC;

public class ItemSMC extends Item
{
	public ItemSMC(String name) 
	{
		super(new Properties().group(SMCTabs.ITEMS));
		setRegistryName(new ResourceLocation(SupremeMC.MOD_ID, name));
		SMCItems.ITEMS.add(this);
	}
}