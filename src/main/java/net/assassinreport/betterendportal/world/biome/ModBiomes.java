package net.assassinreport.betterendportal.world.biome;

import net.assassinreport.betterendportal.BetterEndPortal;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BiomeAdditionsSound;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.*;

public class ModBiomes {
    public static final RegistryKey<Biome> SHADOW_LANDS = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(BetterEndPortal.MOD_ID, "shadowlands"));

    public static void boostrap(Registerable<Biome> context) {
        context.register(SHADOW_LANDS, shadowLands(context));
    }

    public static Biome shadowLands(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.ENDERMAN, 10, 4, 4));

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        return new Biome.Builder()
                .precipitation(false)
                .downfall(0.0f)
                .temperature(2f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .skyColor(0x000000) // 0 in decimal
                        .fogColor(0xA080A0) // 10518688
                        .waterColor(0x987050) // 9995221
                        .waterFogColor(0x050533) // 329011
                        .grassColor(0xa37068) // 10717400
                        .foliageColor(0x459879) // 4561369
                        .moodSound(new BiomeMoodSound(SoundEvents.AMBIENT_SOUL_SAND_VALLEY_MOOD, 6000, 8, 2.0))
                        .additionsSound(new BiomeAdditionsSound(SoundEvents.AMBIENT_SOUL_SAND_VALLEY_ADDITIONS, 0.0111))
                        .particleConfig(new BiomeParticleConfig(ParticleTypes.ASH, 0.08f))
                        .build())
                .build();
    }
}