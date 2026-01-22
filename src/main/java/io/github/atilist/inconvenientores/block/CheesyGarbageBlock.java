package io.github.atilist.inconvenientores.block;

import io.github.atilist.inconvenientores.events.init.BlockListener;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.Random;

public class CheesyGarbageBlock extends LazyBlockTemplate {
    public CheesyGarbageBlock(Identifier identifier, Material material, float hardness, BlockSoundGroup blockSoundGroup) {
        super(identifier, material, hardness, blockSoundGroup);
        setTickRandomly(true);
    }

    @Override
    public void onTick(World world, int x, int y, int z, Random random) {
        int waterCount = getAdjacentWaterCount(world, x, y, z);
        if (waterCount * 10 > random.nextInt(60)) {
            world.setBlock(x, y, z, BlockListener.infestedGarbage.id);
        }
    }

    private int getAdjacentWaterCount(World world, int x, int y, int z) {
        int waterCount = 0;
        if (isWater(world, x + 1, y, z)) {
            waterCount++;
        }
        if (isWater(world, x - 1, y, z)) {
            waterCount++;
        }
        if (isWater(world, x, y + 1, z)) {
            waterCount++;
        }
        if (isWater(world, x, y - 1, z)) {
            waterCount++;
        }
        if (isWater(world, x, y, z + 1)) {
            waterCount++;
        }
        if (isWater(world, x, y, z - 1)) {
            waterCount++;
        }
        return waterCount;
    }

    private boolean isWater(World world, int x, int y, int z) {
        int blockId = world.getBlockId(x, y, z);
        return blockId == Block.WATER.id || blockId == Block.FLOWING_WATER.id;
    }
}
