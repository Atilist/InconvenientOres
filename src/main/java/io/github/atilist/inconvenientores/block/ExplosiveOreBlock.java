package io.github.atilist.inconvenientores.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.Random;

public class ExplosiveOreBlock extends LazyBlockTemplate {
    public ExplosiveOreBlock(Identifier identifier, Material material) {
        super(identifier, material, 1.5F, Block.STONE_SOUND_GROUP);
    }

    @Override
    public void afterBreak(World world, PlayerEntity playerEntity, int x, int y, int z, int meta) {
        world.createExplosion(null, x + 0.5, y + 0.5, z + 0.5, 2.5F);
    }

    @Override
    public void onDestroyedByExplosion(World world, int x, int y, int z) {
        world.createExplosion(null, x + 0.5, y + 0.5, z + 0.5, 2.5F);
    }

    @Override
    public int getDroppedItemCount(Random random) {
        return 0;
    }
}
