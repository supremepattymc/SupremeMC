package source.suprememc.init.objects;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.Items;
import source.suprememc.entities.boat.BoatEntitySMC;
import source.suprememc.init.misc.SMCTabs;
import source.suprememc.items.ItemSMC;
import source.suprememc.items.SpawnEggItemSMC;
import source.suprememc.items.armor.ArmorItemSMC;
import source.suprememc.items.armor.HorseArmorItemSMC;
import source.suprememc.items.crops.CottonSeedsSMC;
import source.suprememc.items.crops.VanillaSeedsSMC;
import source.suprememc.items.foods.ChocolateMilkBucketSMC;
import source.suprememc.items.foods.CornSMC;
import source.suprememc.items.foods.GrapesSMC;
import source.suprememc.items.foods.TomatoSMC;
import source.suprememc.items.tools.AxeItemSMC;
import source.suprememc.items.tools.BoatItemSMC;
import source.suprememc.items.tools.BucketItemSMC;
import source.suprememc.items.tools.FishingRodItemSMC;
import source.suprememc.items.tools.HoeItemSMC;
import source.suprememc.items.tools.MobRemoverSMC;
import source.suprememc.items.tools.NetheriteBowItemSMC;
import source.suprememc.items.tools.NetheriteCrossbowItemSMC;
import source.suprememc.items.tools.OnAStickItemSMC;
import source.suprememc.items.tools.PickaxeItemSMC;
import source.suprememc.items.tools.ShearsItemSMC;
import source.suprememc.items.tools.ShovelItemSMC;
import source.suprememc.items.tools.SwordItemSMC;
import source.suprememc.items.tools.ToolMaterialSMC;
import source.suprememc.items.tools.TridentItemSMC;

public class SMCItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Items
	public static final Item AMETHYST_SHARD = new ItemSMC("amethyst_shard");
	public static final Item AQUAMARINE = new ItemSMC("aquamarine");
	public static final Item BEAR_LEATHER = new ItemSMC("bear_leather");
	public static final Item BURNING_DIAMOND = new ItemSMC("burning_diamond");
	public static final Item BUTTER = new ItemSMC("butter");
	public static final Item COPPER_INGOT = new ItemSMC("copper_ingot");
	public static final Item COPPER_NUGGET = new ItemSMC("copper_nugget");
	public static final Item COTTON = new ItemSMC("cotton");
	public static final Item COTTON_SEEDS = new CottonSeedsSMC("cotton_seeds");
	public static final Item ENDERITE_POWDER = new ItemSMC("enderite_powder", SMCTabs.BREWING);
	public static final Item EXPERIENCE_DUST = new ItemSMC("experience_dust");
	public static final Item GLENDSTONE_DUST = new ItemSMC("glendstone_dust", SMCTabs.BREWING);
	public static final Item LIGHTSTONE_DUST = new ItemSMC("lightstone_dust", SMCTabs.BREWING);
	public static final Item MUSIC_DISC_BLANK = new ItemSMC("music_disc_blank");
	public static final Item RADIUM_INGOT = new ItemSMC("radium_ingot");
	public static final Item RADIUM_POWDER = new ItemSMC("radium_powder", SMCTabs.BREWING);
	public static final Item RAW_COPPER = new ItemSMC("raw_copper");
	public static final Item RAW_GOLD = new ItemSMC("raw_gold");
	public static final Item RAW_IRON = new ItemSMC("raw_iron");
	public static final Item RAW_RADIUM = new ItemSMC("raw_radium");
	public static final Item RENNET_BOTTLE = new ItemSMC(Items.GLASS_BOTTLE, 16, "rennet_bottle", SMCTabs.MISCELLANEOUS);
	public static final Item RUBY = new ItemSMC("ruby");
	public static final Item SALT = new ItemSMC("salt");
	public static final Item SOUL_BLAZE_ROD = new ItemSMC("soul_blaze_rod");
	public static final Item SOUL_BLAZE_POWDER = new ItemSMC("soul_blaze_powder");
	public static final Item SULFUR = new ItemSMC("sulfur");
	public static final Item TIGERS_EYE = new ItemSMC("tigers_eye");
	public static final Item VANILLA = new ItemSMC("vanilla");
	public static final Item VANILLA_SEEDS = new VanillaSeedsSMC("vanilla_seeds");
	public static final Item BUTTERMILK_BUCKET = new ItemSMC(Items.BUCKET, 1, "buttermilk_bucket", SMCTabs.MISCELLANEOUS);
	public static final Item CURDED_MILK_BUCKET = new ItemSMC(Items.BUCKET, 1, "curded_milk_bucket", SMCTabs.MISCELLANEOUS);
	public static final Item FERMENTED_MILK_BUCKET = new ItemSMC(Items.BUCKET, 1, "fermented_milk_bucket", SMCTabs.MISCELLANEOUS);
	public static final Item ICE_BUCKET = new ItemSMC(Items.BUCKET, 1, "ice_bucket", SMCTabs.MISCELLANEOUS);
	public static final Item PASTEURIZED_MILK_BUCKET = new ItemSMC(Items.BUCKET, 1, "pasteurized_milk_bucket", SMCTabs.MISCELLANEOUS);
	public static final Item SOLID_BUTTERMILK_BUCKET = new ItemSMC(Items.BUCKET, 1, "solid_buttermilk_bucket", SMCTabs.MISCELLANEOUS);
	
	
	// Armor & Tools
		// Amethyst
	public static final Item AMETHYST_HELMET = new ArmorItemSMC(ArmorItemSMC.AMETHYST, EquipmentSlotType.HEAD);
	public static final Item AMETHYST_CHESTPLATE = new ArmorItemSMC(ArmorItemSMC.AMETHYST, EquipmentSlotType.CHEST);
	public static final Item AMETHYST_LEGGINGS = new ArmorItemSMC(ArmorItemSMC.AMETHYST, EquipmentSlotType.LEGS);
	public static final Item AMETHYST_BOOTS = new ArmorItemSMC(ArmorItemSMC.AMETHYST, EquipmentSlotType.FEET);
	public static final Item AMETHYST_SWORD = new SwordItemSMC(ToolMaterialSMC.AMETHYST, true);
	public static final Item AMETHYST_AXE = new AxeItemSMC(ToolMaterialSMC.AMETHYST, 9.0F, 1.0F, true);
	public static final Item AMETHYST_PICKAXE = new PickaxeItemSMC(ToolMaterialSMC.AMETHYST, true);
	public static final Item AMETHYST_SHOVEL = new ShovelItemSMC(ToolMaterialSMC.AMETHYST, true);
	public static final Item AMETHYST_HOE = new HoeItemSMC(ToolMaterialSMC.AMETHYST, true);
		// Aquamarine
	public static final Item AQUAMARINE_HELMET = new ArmorItemSMC(ArmorItemSMC.AQUAMARINE, EquipmentSlotType.HEAD);
	public static final Item AQUAMARINE_CHESTPLATE = new ArmorItemSMC(ArmorItemSMC.AQUAMARINE, EquipmentSlotType.CHEST);
	public static final Item AQUAMARINE_LEGGINGS = new ArmorItemSMC(ArmorItemSMC.AQUAMARINE, EquipmentSlotType.LEGS);
	public static final Item AQUAMARINE_BOOTS = new ArmorItemSMC(ArmorItemSMC.AQUAMARINE, EquipmentSlotType.FEET);
	public static final Item AQUAMARINE_SWORD = new SwordItemSMC(ToolMaterialSMC.AQUAMARINE, true);
	public static final Item AQUAMARINE_AXE = new AxeItemSMC(ToolMaterialSMC.AQUAMARINE, 9.0F, 1.0F, true);
	public static final Item AQUAMARINE_PICKAXE = new PickaxeItemSMC(ToolMaterialSMC.AQUAMARINE, true);
	public static final Item AQUAMARINE_SHOVEL = new ShovelItemSMC(ToolMaterialSMC.AQUAMARINE, true);
	public static final Item AQUAMARINE_HOE = new HoeItemSMC(ToolMaterialSMC.AQUAMARINE, true);
		// Burning Diamond
	public static final Item BURNING_DIAMOND_HELMET = new ArmorItemSMC(ArmorItemSMC.BURNING_DIAMOND, EquipmentSlotType.HEAD);
	public static final Item BURNING_DIAMOND_CHESTPLATE = new ArmorItemSMC(ArmorItemSMC.BURNING_DIAMOND, EquipmentSlotType.CHEST);
	public static final Item BURNING_DIAMOND_LEGGINGS = new ArmorItemSMC(ArmorItemSMC.BURNING_DIAMOND, EquipmentSlotType.LEGS);
	public static final Item BURNING_DIAMOND_BOOTS = new ArmorItemSMC(ArmorItemSMC.BURNING_DIAMOND, EquipmentSlotType.FEET);
	public static final Item BURNING_DIAMOND_SWORD = new SwordItemSMC(ToolMaterialSMC.BURNING_DIAMOND, true);
	public static final Item BURNING_DIAMOND_AXE = new AxeItemSMC(ToolMaterialSMC.BURNING_DIAMOND, 9.0F, 1.0F, true);
	public static final Item BURNING_DIAMOND_PICKAXE = new PickaxeItemSMC(ToolMaterialSMC.BURNING_DIAMOND, true);
	public static final Item BURNING_DIAMOND_SHOVEL = new ShovelItemSMC(ToolMaterialSMC.BURNING_DIAMOND, true);
	public static final Item BURNING_DIAMOND_HOE = new HoeItemSMC(ToolMaterialSMC.BURNING_DIAMOND, true);

		// COPPER
	public static final Item COPPER_HELMET = new ArmorItemSMC(ArmorItemSMC.COPPER, EquipmentSlotType.HEAD);
	public static final Item COPPER_CHESTPLATE = new ArmorItemSMC(ArmorItemSMC.COPPER, EquipmentSlotType.CHEST);
	public static final Item COPPER_LEGGINGS = new ArmorItemSMC(ArmorItemSMC.COPPER, EquipmentSlotType.LEGS);
	public static final Item COPPER_BOOTS = new ArmorItemSMC(ArmorItemSMC.COPPER, EquipmentSlotType.FEET);
	public static final Item COPPER_SWORD = new SwordItemSMC(ToolMaterialSMC.COPPER, true);
	public static final Item COPPER_AXE = new AxeItemSMC(ToolMaterialSMC.COPPER, 9.0F, 1.0F, true);
	public static final Item COPPER_PICKAXE = new PickaxeItemSMC(ToolMaterialSMC.COPPER, true);
	public static final Item COPPER_SHOVEL = new ShovelItemSMC(ToolMaterialSMC.COPPER, true);
	public static final Item COPPER_HOE = new HoeItemSMC(ToolMaterialSMC.COPPER, true);
		// EMERALD
	public static final Item EMERALD_HELMET = new ArmorItemSMC(ArmorItemSMC.EMERALD, EquipmentSlotType.HEAD);
	public static final Item EMERALD_CHESTPLATE = new ArmorItemSMC(ArmorItemSMC.EMERALD, EquipmentSlotType.CHEST);
	public static final Item EMERALD_LEGGINGS = new ArmorItemSMC(ArmorItemSMC.EMERALD, EquipmentSlotType.LEGS);
	public static final Item EMERALD_BOOTS = new ArmorItemSMC(ArmorItemSMC.EMERALD, EquipmentSlotType.FEET);
	public static final Item EMERALD_SWORD = new SwordItemSMC(ToolMaterialSMC.EMERALD, true);
	public static final Item EMERALD_AXE = new AxeItemSMC(ToolMaterialSMC.EMERALD, 9.0F, 1.0F, true);
	public static final Item EMERALD_PICKAXE = new PickaxeItemSMC(ToolMaterialSMC.EMERALD, true);
	public static final Item EMERALD_SHOVEL = new ShovelItemSMC(ToolMaterialSMC.EMERALD, true);
	public static final Item EMERALD_HOE = new HoeItemSMC(ToolMaterialSMC.EMERALD, true);

	public static final Item RUBY_HELMET = new ArmorItemSMC(ArmorItemSMC.RUBY, EquipmentSlotType.HEAD);
	public static final Item RUBY_CHESTPLATE = new ArmorItemSMC(ArmorItemSMC.RUBY, EquipmentSlotType.CHEST);
	public static final Item RUBY_LEGGINGS = new ArmorItemSMC(ArmorItemSMC.RUBY, EquipmentSlotType.LEGS);
	public static final Item RUBY_BOOTS = new ArmorItemSMC(ArmorItemSMC.RUBY, EquipmentSlotType.FEET);
	public static final Item RUBY_SWORD = new SwordItemSMC(ToolMaterialSMC.RUBY);
	public static final Item RUBY_AXE = new AxeItemSMC(ToolMaterialSMC.RUBY, 12.5F, 1.05F);
	public static final Item RUBY_PICKAXE = new PickaxeItemSMC(ToolMaterialSMC.RUBY);
	public static final Item RUBY_SHOVEL = new ShovelItemSMC(ToolMaterialSMC.RUBY);
	public static final Item RUBY_HOE = new HoeItemSMC(ToolMaterialSMC.RUBY);
	
	public static final Item TIGERS_EYE_HELMET = new ArmorItemSMC(ArmorItemSMC.TIGERS_EYE, EquipmentSlotType.HEAD);
	public static final Item TIGERS_EYE_CHESTPLATE = new ArmorItemSMC(ArmorItemSMC.TIGERS_EYE, EquipmentSlotType.CHEST);
	public static final Item TIGERS_EYE_LEGGINGS = new ArmorItemSMC(ArmorItemSMC.TIGERS_EYE, EquipmentSlotType.LEGS);
	public static final Item TIGERS_EYE_BOOTS = new ArmorItemSMC(ArmorItemSMC.TIGERS_EYE, EquipmentSlotType.FEET);
	public static final Item TIGERS_EYE_SWORD = new SwordItemSMC(ToolMaterialSMC.TIGERS_EYE);
	public static final Item TIGERS_EYE_AXE = new AxeItemSMC(ToolMaterialSMC.TIGERS_EYE, 14.5F, 1.1F);
	public static final Item TIGERS_EYE_PICKAXE = new PickaxeItemSMC(ToolMaterialSMC.TIGERS_EYE);
	public static final Item TIGERS_EYE_SHOVEL = new ShovelItemSMC(ToolMaterialSMC.TIGERS_EYE);
	public static final Item TIGERS_EYE_HOE = new HoeItemSMC(ToolMaterialSMC.TIGERS_EYE);
	
	public static final Item COTTON_HELMET = new ArmorItemSMC(ArmorItemSMC.COTTON, EquipmentSlotType.HEAD);
	public static final Item COTTON_CHESTPLATE = new ArmorItemSMC(ArmorItemSMC.COTTON, EquipmentSlotType.CHEST);
	public static final Item COTTON_LEGGINGS = new ArmorItemSMC(ArmorItemSMC.COTTON, EquipmentSlotType.LEGS);
	public static final Item COTTON_BOOTS = new ArmorItemSMC(ArmorItemSMC.COTTON, EquipmentSlotType.FEET);
	
	public static final Item FLINT_SWORD = new SwordItemSMC(ToolMaterialSMC.FLINT);
	public static final Item FLINT_AXE = new AxeItemSMC(ToolMaterialSMC.FLINT, 9.0F, 0.85F);
	public static final Item FLINT_PICKAXE = new PickaxeItemSMC(ToolMaterialSMC.FLINT);
	public static final Item FLINT_SHOVEL = new ShovelItemSMC(ToolMaterialSMC.FLINT);
	public static final Item FLINT_HOE = new HoeItemSMC(ToolMaterialSMC.FLINT);
	
	public static final Item BEAR_LEATHER_HELMET = new ArmorItemSMC(ArmorItemSMC.BEAR_LEATHER, EquipmentSlotType.HEAD);
	public static final Item BEAR_LEATHER_CHESTPLATE = new ArmorItemSMC(ArmorItemSMC.BEAR_LEATHER, EquipmentSlotType.CHEST);
	public static final Item BEAR_LEATHER_LEGGINGS = new ArmorItemSMC(ArmorItemSMC.BEAR_LEATHER, EquipmentSlotType.LEGS);
	public static final Item BEAR_LEATHER_BOOTS = new ArmorItemSMC(ArmorItemSMC.BEAR_LEATHER, EquipmentSlotType.FEET);
	
	public static final Item ANDESITE_SWORD = new SwordItemSMC(ItemTier.STONE, "andesite_sword");
	public static final Item ANDESITE_AXE = new AxeItemSMC(ItemTier.STONE, 9.0F, 0.8F, "andesite_axe");
	public static final Item ANDESITE_PICKAXE = new PickaxeItemSMC(ItemTier.STONE, "andesite_pickaxe");
	public static final Item ANDESITE_SHOVEL = new ShovelItemSMC(ItemTier.STONE, "andesite_shovel");
	public static final Item ANDESITE_HOE = new HoeItemSMC(ItemTier.STONE, "andesite_hoe");
	
	public static final Item DIORITE_SWORD = new SwordItemSMC(ItemTier.STONE, "diorite_sword");
	public static final Item DIORITE_AXE = new AxeItemSMC(ItemTier.STONE, 9.0F, 0.8F, "diorite_axe");
	public static final Item DIORITE_PICKAXE = new PickaxeItemSMC(ItemTier.STONE, "diorite_pickaxe");
	public static final Item DIORITE_SHOVEL = new ShovelItemSMC(ItemTier.STONE, "diorite_shovel");
	public static final Item DIORITE_HOE = new HoeItemSMC(ItemTier.STONE, "diorite_hoe");
	
	public static final Item GRANITE_SWORD = new SwordItemSMC(ItemTier.STONE, "granite_sword");
	public static final Item GRANITE_AXE = new AxeItemSMC(ItemTier.STONE, 9.0F, 0.8F, "granite_axe");
	public static final Item GRANITE_PICKAXE = new PickaxeItemSMC(ItemTier.STONE, "granite_pickaxe");
	public static final Item GRANITE_SHOVEL = new ShovelItemSMC(ItemTier.STONE, "granite_shovel");
	public static final Item GRANITE_HOE = new HoeItemSMC(ItemTier.STONE, "granite_hoe");
	
	public static final Item BLACKSTONE_SWORD = new SwordItemSMC(ItemTier.STONE, "blackstone_sword");
	public static final Item BLACKSTONE_AXE = new AxeItemSMC(ItemTier.STONE, 9.0F, 0.8F, "blackstone_axe");
	public static final Item BLACKSTONE_PICKAXE = new PickaxeItemSMC(ItemTier.STONE, "blackstone_pickaxe");
	public static final Item BLACKSTONE_SHOVEL = new ShovelItemSMC(ItemTier.STONE, "blackstone_shovel");
	public static final Item BLACKSTONE_HOE = new HoeItemSMC(ItemTier.STONE, "blackstone_hoe");
	
	public static final Item END_STONE_SWORD = new SwordItemSMC(ItemTier.STONE, "end_stone_sword");
	public static final Item END_STONE_AXE = new AxeItemSMC(ItemTier.STONE, 9.0F, 0.8F, "end_stone_axe");
	public static final Item END_STONE_PICKAXE = new PickaxeItemSMC(ItemTier.STONE, "end_stone_pickaxe");
	public static final Item END_STONE_SHOVEL = new ShovelItemSMC(ItemTier.STONE, "end_stone_shovel");
	public static final Item END_STONE_HOE = new HoeItemSMC(ItemTier.STONE, "end_stone_hoe");
	
	public static final Item OBSIDIAN_SWORD = new SwordItemSMC(ToolMaterialSMC.OBSIDIAN);
	public static final Item OBSIDIAN_AXE = new AxeItemSMC(ToolMaterialSMC.OBSIDIAN, 9.0F, 0.8F);
	public static final Item OBSIDIAN_PICKAXE = new PickaxeItemSMC(ToolMaterialSMC.OBSIDIAN);
	public static final Item OBSIDIAN_SHOVEL = new ShovelItemSMC(ToolMaterialSMC.OBSIDIAN);
	public static final Item OBSIDIAN_HOE = new HoeItemSMC(ToolMaterialSMC.OBSIDIAN);

	
	// Horse Armor
	public static final Item AMETHYST_HORSE_ARMOR =  new HorseArmorItemSMC(10, "amethyst");
	public static final Item AQUAMARINE_HORSE_ARMOR = new HorseArmorItemSMC(11, "aquamarine");
	public static final Item COPPER_HORSE_ARMOR = new HorseArmorItemSMC(9, "copper");
	public static final Item BURNING_DIAMOND_HORSE_ARMOR = new HorseArmorItemSMC(11, "burning_diamond");
	public static final Item EMERALD_HORSE_ARMOR = new HorseArmorItemSMC(9, "emerald");
	public static final Item RUBY_HORSE_ARMOR = new HorseArmorItemSMC(12, "ruby");
	public static final Item TIGERS_EYE_HORSE_ARMOR = new HorseArmorItemSMC(16, "tigers_eye");
	
	// Other Tools
	public static final Item NETHERITE_BOW = new NetheriteBowItemSMC("netherite_bow");
	public static final Item NETHERITE_CROSSBOW = new NetheriteCrossbowItemSMC("netherite_crossbow");
	public static final Item NETHERITE_FISHING_ROD = new FishingRodItemSMC(2031, "netherite_fishing_rod");
	public static final Item NETHERITE_SHEARS = new ShearsItemSMC(2031, "netherite_shears");
	public static final Item NETHERITE_TRIDENT = new TridentItemSMC(2031, "netherite_trident");
	public static final Item NETHERITE_CARROT_ON_A_STICK = new OnAStickItemSMC<>(2031, "netherite_carrot_on_a_stick", EntityType.PIG, 1);
	public static final Item NETHERITE_WARPED_FUNGUS_ON_A_STICK = new OnAStickItemSMC<>(2031, "netherite_warped_fungus_on_a_stick", EntityType.STRIDER, 1);
	public static final Item MOB_REMOVER = new MobRemoverSMC("mob_remover", ToolMaterialSMC.ADMIN);
	
	// Foods
	public static final Item CALAMARI = new ItemSMC("calamari", SMCFoods.CALAMARI);
	public static final Item COOKED_CALAMARI = new ItemSMC("cooked_calamari", SMCFoods.COOKED_CALAMARI);
	public static final Item CARAMEL = new ItemSMC("caramel", SMCFoods.CARAMEL);
	public static final Item CHEESE = new ItemSMC("cheese", SMCFoods.CHEESE);
	public static final Item CHOCOLATE = new ItemSMC("chocolate", SMCFoods.CHOCOLATE);
	public static final Item CORN = new CornSMC("corn");
	public static final Item DARK_CHOCOLATE = new ItemSMC("dark_chocolate", SMCFoods.DARK_CHOCOLATE);
	public static final Item CHOCOLATE_MILK_BUCKET = new ChocolateMilkBucketSMC("chocolate_milk_bucket");
	public static final Item FUGU = new ItemSMC("fugu", SMCFoods.FUGU);
	public static final Item COOKED_FUGU = new ItemSMC("cooked_fugu", SMCFoods.COOKED_FUGU);
	public static final Item GRAPES = new GrapesSMC("grapes");
	public static final Item FRIED_EGG = new ItemSMC("fried_egg", SMCFoods.FRIED_EGG);
	public static final Item ICE_CREAM_CONE = new ItemSMC("ice_cream_cone", SMCFoods.ICE_CREAM_CONE);
	public static final Item CHOCOLATE_ICE_CREAM = new ItemSMC("chocolate_ice_cream", SMCFoods.CHOCOLATE_ICE_CREAM);
	public static final Item VANILLA_ICE_CREAM = new ItemSMC("vanilla_ice_cream", SMCFoods.VANILLA_ICE_CREAM);
	public static final Item CHEESE_SANDWICH = new ItemSMC("cheese_sandwich", SMCFoods.CHEESE_SANDWICH);
	public static final Item CHICKEN_SANDWICH = new ItemSMC("chicken_sandwich", SMCFoods.CHICKEN_SANDWICH);
	public static final Item TOMATO = new TomatoSMC("tomato");
	public static final Item RESET_HUNGER_BAR = new ItemSMC("reset_hunger_bar", SMCFoods.RESET_HUNGER_BAR);
	
	// Buckets
	public static final Item RADIATED_WATER_BUCKET = new BucketItemSMC(()-> SMCFluids.RADIATED_WATER, "radiated_water_bucket");
		
	// Boats
	public static final Item CHERRY_BOAT = new BoatItemSMC("cherry_boat", BoatEntitySMC.Type.CHERRY);
	public static final Item PALM_BOAT = new BoatItemSMC("palm_boat", BoatEntitySMC.Type.PALM);
	public static final Item CRIMSON_BOAT = new BoatItemSMC("crimson_boat", BoatEntitySMC.Type.CRIMSON);
	public static final Item WARPED_BOAT = new BoatItemSMC("warped_boat", BoatEntitySMC.Type.WARPED);
	public static final Item MUSTARD_BOAT = new BoatItemSMC("mustard_boat", BoatEntitySMC.Type.MUSTARD);
	public static final Item LAVENDER_BOAT = new BoatItemSMC("lavender_boat", BoatEntitySMC.Type.LAVENDER);
	
	// Spawn Egg
	public static final Item BLACK_BEAR_SPAWN_EGG = new SpawnEggItemSMC("black_bear_spawn_egg", SMCEntities.BLACK_BEAR, 1250577, 11184298);
	public static final Item BLACK_WIDOW_SPIDER_SPAWN_EGG = new SpawnEggItemSMC("black_widow_spider_spawn_egg", SMCEntities.BLACK_WIDOW_SPIDER, 131077, 302209);
	public static final Item BROWN_RECLUSE_SPIDER_SPAWN_EGG = new SpawnEggItemSMC("brown_recluse_spider_spawn_egg", SMCEntities.BROWN_RECLUSE_SPIDER, 131077, 302209);
	public static final Item CAVED_SPAWN_EGG = new SpawnEggItemSMC("caved_spawn_egg", SMCEntities.CAVED, 15923190, 7917177);
	public static final Item FIRE_CREEPER_SPAWN_EGG = new SpawnEggItemSMC("fire_creeper_spawn_egg", SMCEntities.FIRE_CREEPER, 15923190, 7917177);
	public static final Item GRIZZLY_BEAR_SPAWN_EGG = new SpawnEggItemSMC("grizzly_bear_spawn_egg", SMCEntities.GRIZZLY_BEAR, 4861976, 302209);
	public static final Item ENDER_DRAGON_SPAWN_EGG = new SpawnEggItemSMC("ender_dragon_spawn_egg", EntityType.ENDER_DRAGON, 0, 4849797);
	public static final Item ILLUSIONER_SPAWN_EGG = new SpawnEggItemSMC("illusioner_spawn_egg", EntityType.ILLUSIONER, 1728181, 11184547);
	public static final Item IRON_GOLEM_SPAWN_EGG = new SpawnEggItemSMC("iron_golem_spawn_egg", EntityType.IRON_GOLEM, 15923190, 7917177);
	public static final Item MOOBLOOM_SPAWN_EGG = new SpawnEggItemSMC("moobloom_spawn_egg", SMCEntities.MOOBLOOM, 131077, 302209);
	public static final Item MINER_SPAWN_EGG = new SpawnEggItemSMC("miner_spawn_egg", SMCEntities.MINER, 131077, 302209);
	public static final Item SNOW_GOLEM_SPAWN_EGG = new SpawnEggItemSMC("snow_golem_spawn_egg", EntityType.SNOW_GOLEM, 16777215, 15923190);
	public static final Item SOUL_BLAZE_SPAWN_EGG = new SpawnEggItemSMC("soul_blaze_spawn_egg", SMCEntities.SOUL_BLAZE, 131077, 302209);
	public static final Item TROPICAL_DRUDGE_SPAWN_EGG = new SpawnEggItemSMC("tropical_drudge_spawn_egg", SMCEntities.TROPICAL_DRUDGE, 131077, 302209);
	public static final Item WITHER_SPAWN_EGG = new SpawnEggItemSMC("wither_spawn_egg", EntityType.WITHER, 8160382, 8160382);
}
