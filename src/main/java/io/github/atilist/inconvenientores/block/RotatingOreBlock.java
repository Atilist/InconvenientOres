package io.github.atilist.inconvenientores.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.Random;

public class RotatingOreBlock extends LazyBlockTemplate {
    public RotatingOreBlock(Identifier identifier, Material material) {
        super(identifier, material, 2.5F, Block.STONE_SOUND_GROUP);
    }

    @Override
    public void afterBreak(World world, PlayerEntity playerEntity, int x, int y, int z, int meta) {
        playerEntity.setPositionAndAngles(playerEntity.x, playerEntity.y, playerEntity.z, playerEntity.yaw + 180, playerEntity.pitch);
    }

    @Override
    public int getDroppedItemCount(Random random) {
        return 0;
    }
}
