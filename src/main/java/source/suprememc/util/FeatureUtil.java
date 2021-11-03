package source.suprememc.util;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.gen.GenerationStage;
import source.suprememc.init.generation.SMCOreFeatures;
import source.suprememc.init.objects.SMCEntities;

public class FeatureUtil {
	public static void addCaveOres(net.minecraft.world.biome.BiomeGenerationSettings.Builder builder) {

		builder.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, SMCOreFeatures.DEEP_ORE_TUFF);
		builder.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, SMCOreFeatures.DEEP_ORE_COAL1);
		builder.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, SMCOreFeatures.DEEP_ORE_COAL2);
		builder.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, SMCOreFeatures.DEEP_ORE_COAL3);
		builder.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, SMCOreFeatures.DEEP_ORE_IRON1);
		builder.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, SMCOreFeatures.DEEP_ORE_IRON2);
		builder.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, SMCOreFeatures.DEEP_ORE_IRON3);
		builder.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, SMCOreFeatures.DEEP_ORE_GOLD1);
		builder.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, SMCOreFeatures.DEEP_ORE_GOLD2);
		builder.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, SMCOreFeatures.DEEP_ORE_COPPER);
		builder.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, SMCOreFeatures.DEEP_ORE_REDSTONE1);
		builder.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, SMCOreFeatures.DEEP_ORE_REDSTONE2);
		builder.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, SMCOreFeatures.DEEP_ORE_LAPIS1);
		builder.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, SMCOreFeatures.DEEP_ORE_LAPIS2);
		builder.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, SMCOreFeatures.DEEP_ORE_DIAMOND);
		builder.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, SMCOreFeatures.DEEP_ORE_EMERALD);

	}

	public static void caveMonsters(MobSpawnInfo.Builder builder) {
		builder.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.CAVE_SPIDER, 25, 4, 4));
		builder.addSpawn(EntityClassification.MONSTER,
				new MobSpawnInfo.Spawners(SMCEntities.BLACK_WIDOW_SPIDER, 25, 4, 4));
		builder.addSpawn(EntityClassification.MONSTER,
				new MobSpawnInfo.Spawners(SMCEntities.BROWN_RECLUSE_SPIDER, 25, 4, 4));
		builder.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.SPIDER, 25, 4, 4));
		builder.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(SMCEntities.CAVED, 80, 4, 4));
		builder.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ZOMBIE, 20, 4, 4));
		builder.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(SMCEntities.MINER, 100, 4, 4));
		builder.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ZOMBIE_VILLAGER, 25, 1, 1));
		builder.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.WITHER_SKELETON, 80, 4, 4));
		builder.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.SKELETON, 20, 4, 4));
		builder.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.CREEPER, 100, 4, 4));
		builder.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.SLIME, 100, 4, 4));
		builder.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ENDERMAN, 10, 1, 4));
		builder.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.WITCH, 5, 1, 1));
	}
}
