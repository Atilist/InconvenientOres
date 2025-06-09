package io.github.atilist.inconvenientores.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.registry.BlockRegistry;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.Random;

public class WoodenStoneBlock extends LazyBlockTemplate {
    public WoodenStoneBlock(Identifier identifier, Material material) {
        super(identifier, material, 1.5F, Block.WOOD_SOUND_GROUP);
    }

    @Override
    public void afterBreak(World world, PlayerEntity playerEntity, int x, int y, int z, int meta) {
        if (world.isRemote) return;
        dropStack(world, x, y, z, new ItemStack(BlockRegistry.INSTANCE.get(BlockRegistry.INSTANCE.getId(Block.COBBLESTONE)), 1, 0));
    }

    @Override
    public int getDroppedItemCount(Random random) {
        return 0;
    }
}
