package midnight.data.loottables;

import midnight.common.block.MnBlocks;
import midnight.common.registry.RegistryManager;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.world.storage.loot.ConstantRange;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTable;

public class MnBlockLootTables extends BlockLootTables {

    protected static LootTable.Builder droppingNothing() {
        return LootTable.builder().addLootPool(LootPool.builder().rolls(ConstantRange.of(0)));
    }

    @Override
    protected void addTables() {
        registerDropSelfLootTable(MnBlocks.NIGHT_STONE);
        registerDropSelfLootTable(MnBlocks.NIGHT_DIRT);
        registerSilkTouch(MnBlocks.NIGHT_BEDROCK);
        registerLootTable(MnBlocks.NIGHT_GRASS_BLOCK, block -> droppingWithSilkTouch(block, MnBlocks.NIGHT_DIRT));
        registerLootTable(MnBlocks.DARK_WATER, block -> droppingNothing());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return RegistryManager.BLOCKS;
    }
}
