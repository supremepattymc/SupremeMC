package source.suprememc.items.tools;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.google.common.collect.Multimap;

import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.IVanishable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import source.suprememc.entities.netheritetrident.NetheriteTridentEntitySMC;
import source.suprememc.init.misc.SMCTabs;
import source.suprememc.util.RegUtil;

public class TridentItemSMC extends Item implements IVanishable {
	private final Multimap<Attribute, AttributeModifier> defaultModifiers;

	public TridentItemSMC(int durability, String name) 
	{
		super(new Properties().durability(durability).tab(SMCTabs.COMBAT));
		RegUtil.registerItem(this, name);
		Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
		builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Tool modifier", 12.0D, AttributeModifier.Operation.ADDITION));
		builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Tool modifier", (double)-2.4F, AttributeModifier.Operation.ADDITION));
		this.defaultModifiers = builder.build();
	}

	@Override
	public boolean canAttackBlock(BlockState p_195938_1_, World p_195938_2_, BlockPos p_195938_3_, PlayerEntity p_195938_4_) {
		return !p_195938_4_.isCreative();
	}

	@Override
	public UseAction getUseAnimation(ItemStack itemStack) {
		return UseAction.SPEAR;
	}

	@Override
	public int getUseDuration(ItemStack itemStack) {
		return 72000;
	}

	@Override
	public void releaseUsing(ItemStack itemStack, World world, LivingEntity livingEntity, int num) 
	{
		if (livingEntity instanceof PlayerEntity) 
		{
			PlayerEntity playerentity = (PlayerEntity)livingEntity;
			int i = this.getUseDuration(itemStack) - num;
			if (i >= 10) {
				int j = EnchantmentHelper.getRiptide(itemStack);
				if (j <= 0 || playerentity.isInWaterOrRain()) {
					if (!world.isClientSide) {
						itemStack.hurtAndBreak(1, playerentity, (p_220047_1_) -> {
							p_220047_1_.broadcastBreakEvent(livingEntity.getUsedItemHand());
						});
						if (j == 0) {
							NetheriteTridentEntitySMC tridententity = new NetheriteTridentEntitySMC(world, playerentity, itemStack);
							tridententity.shootFromRotation(playerentity, playerentity.xRot, playerentity.yRot, 0.0F, 2.5F + (float)j * 0.5F, 1.0F);
							if (playerentity.abilities.instabuild) {
								tridententity.pickup = AbstractArrowEntity.PickupStatus.CREATIVE_ONLY;
							}

							world.addFreshEntity(tridententity);
							world.playSound((PlayerEntity)null, tridententity, SoundEvents.TRIDENT_THROW, SoundCategory.PLAYERS, 1.0F, 1.0F);
							if (!playerentity.abilities.instabuild) {
								playerentity.inventory.removeItem(itemStack);
							}
						}
					}

					playerentity.awardStat(Stats.ITEM_USED.get(this));
					if (j > 0) {
						float f7 = playerentity.yRot;
						float f = playerentity.xRot;
						float f1 = -MathHelper.sin(f7 * ((float)Math.PI / 180F)) * MathHelper.cos(f * ((float)Math.PI / 180F));
						float f2 = -MathHelper.sin(f * ((float)Math.PI / 180F));
						float f3 = MathHelper.cos(f7 * ((float)Math.PI / 180F)) * MathHelper.cos(f * ((float)Math.PI / 180F));
						float f4 = MathHelper.sqrt(f1 * f1 + f2 * f2 + f3 * f3);
						float f5 = 3.0F * ((1.0F + (float)j) / 4.0F);
						f1 = f1 * (f5 / f4);
						f2 = f2 * (f5 / f4);
						f3 = f3 * (f5 / f4);
						playerentity.push((double)f1, (double)f2, (double)f3);
						playerentity.startAutoSpinAttack(20);
						if (playerentity.isOnGround()) {
							playerentity.move(MoverType.SELF, new Vector3d(0.0D, (double)1.1999999F, 0.0D));
						}

						SoundEvent soundevent;
						if (j >= 3) {
							soundevent = SoundEvents.TRIDENT_RIPTIDE_3;
						} else if (j == 2) {
							soundevent = SoundEvents.TRIDENT_RIPTIDE_2;
						} else {
							soundevent = SoundEvents.TRIDENT_RIPTIDE_1;
						}

						world.playSound((PlayerEntity)null, playerentity, soundevent, SoundCategory.PLAYERS, 1.0F, 1.0F);
					}

				}
			}
		}
	}

	@Override
	public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) 
	{
		ItemStack itemstack = player.getItemInHand(hand);
		if(itemstack.getDamageValue() >= itemstack.getMaxDamage() - 1)return ActionResult.fail(itemstack);
		else if(EnchantmentHelper.getRiptide(itemstack) > 0 && !player.isInWaterOrRain()) return ActionResult.fail(itemstack);
		else 
		{
			player.startUsingItem(hand);
			return ActionResult.consume(itemstack);
		}
	}

	@Override
	public boolean hurtEnemy(ItemStack itemStack, LivingEntity entity, LivingEntity enemy) {
		itemStack.hurtAndBreak(1, enemy, (p_220048_0_) -> {
			p_220048_0_.broadcastBreakEvent(EquipmentSlotType.MAINHAND);
		});
		return true;
	}

	@Override
	public boolean mineBlock(ItemStack itemStack, World world, BlockState p_179218_3_, BlockPos p_179218_4_, LivingEntity p_179218_5_) {
		if ((double)p_179218_3_.getDestroySpeed(world, p_179218_4_) != 0.0D) {
			itemStack.hurtAndBreak(2, p_179218_5_, (p_220046_0_) -> {
				p_220046_0_.broadcastBreakEvent(EquipmentSlotType.MAINHAND);
			});
		}

		return true;
	}

	@Override
	@SuppressWarnings("deprecation")
	public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlotType p_111205_1_) {
		return p_111205_1_ == EquipmentSlotType.MAINHAND ? this.defaultModifiers : super.getDefaultAttributeModifiers(p_111205_1_);
	}

	@Override
	public int getEnchantmentValue() {
		return 12;
	}
}