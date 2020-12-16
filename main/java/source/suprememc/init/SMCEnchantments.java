package source.suprememc.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantment.Rarity;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import source.suprememc.enchantments.types.BlastTouchSMC;

public class SMCEnchantments 
{
	public static final List<Enchantment> ENCHANTMENTS = new ArrayList<Enchantment>();
	
	public static final Enchantment BLAST_TOUCH = new BlastTouchSMC(Rarity.UNCOMMON, EnchantmentType.DIGGER, new EquipmentSlotType[] {EquipmentSlotType.MAINHAND}, "blast_touch");
}
