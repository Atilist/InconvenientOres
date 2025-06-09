package io.github.atilist.inconvenientores.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.Random;

public class HeavenlyOreBlock extends LazyBlockTemplate {
    public HeavenlyOreBlock(Identifier identifier, Material material) {
        super(identifier, material, 0.2F, Block.STONE_SOUND_GROUP);
    }

    @Override
    public void afterBreak(World world, PlayerEntity playerEntity, int x, int y, int z, int meta) {
        playerEntity.setPosition(x, 1024, z);
    }

    @Override
    public int getDroppedItemCount(Random random) {
        return 0;
    }
}
