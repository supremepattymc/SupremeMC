package source.suprememc.enchantments.types;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.inventory.EquipmentSlotType;
import source.suprememc.enchantments.EnchantmentSMC;

public class BlastTouchSMC extends EnchantmentSMC
{
	public BlastTouchSMC(Rarity rarity, EnchantmentType typeIn, EquipmentSlotType[] slots, String name) 
	{
		super(rarity, typeIn, slots, name);
	}
	@Override
	public int getMinEnchantability(int enchantmentLevel) { return 20 * enchantmentLevel; }
	
	@Override
	public int getMaxEnchantability(int enchantmentLevel) { return this.getMinEnchantability(enchantmentLevel) + 10; }
	
	@Override
	public int getMaxLevel() { return 1; }
	
	public boolean canApplyTogether(Enchantment ench) { return super.canApplyTogether(ench) && ench != Enchantments.SILK_TOUCH; }
}
