package io.github.atilist.inconvenientores.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.Random;

public class WindBagBlock extends LazyBlockTemplate {

    private final Random random = new Random();

    public WindBagBlock(Identifier identifier, Material material) {
        super(identifier, material, 1.5F, Block.STONE_SOUND_GROUP);
    }

    @Override
    public void afterBreak(World world, PlayerEntity playerEntity, int x, int y, int z, int meta) {
        playerEntity.move(randomDirection(), randomDirection(), randomDirection());
    }

    @Override
    public int getDroppedItemCount(Random random) {
        return 0;
    }

    private double randomDirection() {
        double direction = random.nextDouble() * random.nextInt(4);
        if (random.nextBoolean()) {
            direction *= -1;
        }
        return direction;
    }
}
