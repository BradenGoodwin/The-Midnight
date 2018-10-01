package com.mushroom.midnight.common.biomes;

import net.minecraft.world.biome.Biome;

public class RockyTestBiome extends Biome implements IMidnightBiome {
    public RockyTestBiome(BiomeProperties properties) {
        super(properties);
    }

    @Override
    public boolean isRidged() {
        return true;
    }
}
