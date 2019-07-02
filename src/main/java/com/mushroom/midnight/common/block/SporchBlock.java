package com.mushroom.midnight.common.block;

import com.mushroom.midnight.client.particle.MidnightParticles;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.TorchBlock;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Random;

public class SporchBlock extends TorchBlock {
    public enum SporchType {BOGSHROOM, DEWSHROOM, NIGHTSHROOM, VIRIDSHROOM;}

    private final SporchType sporchType;

    public SporchBlock(SporchType sporchType) {
        super(Block.Properties.from(Blocks.TORCH));
        this.sporchType = sporchType;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState state, World world, BlockPos pos, Random random) {
        double d0 = (double) pos.getX() + 0.5d;
        double d1 = (double) pos.getY() + 0.6d;
        double d2 = (double) pos.getZ() + 0.5d;
        double d3 = 0.18d;
        double d4 = 0.2d;
        MidnightParticles.SPORCH.spawn(world, d0, d1, d2, 0d, 0.004d, 0d, sporchType.ordinal());
    }
}
