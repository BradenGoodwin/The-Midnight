package midnight.common.block.color;

import midnight.client.MidnightClient;
import midnight.common.world.biome.MnBiomeColors;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ILightReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

public class NightGrassColor implements IColoredBlock {
    @Override
    @OnlyIn(Dist.CLIENT)
    public int getColor(BlockState state, @Nullable ILightReader lworld, @Nullable BlockPos pos, int tintIndex) {
        return MidnightClient.get().getNightGrassColorCache().getColor(pos, MnBiomeColors.NIGHT_GRASS);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public int getColor(ItemStack stack, int tintIndex) {
        return 0x8C74A1;
    }
}
