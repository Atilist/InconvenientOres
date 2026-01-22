package io.github.atilist.inconvenientores.block;

import io.github.atilist.inconvenientores.events.init.BlockListener;
import net.minecraft.block.material.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.Random;

public class InfestedRockDirtBlock extends LazyBlockTemplate {
    public InfestedRockDirtBlock(Identifier identifier, Material material, float hardness, BlockSoundGroup blockSoundGroup) {
        super(identifier, material, hardness, blockSoundGroup);
        setTickRandomly(true);
    }

    @Override
    public void onTick(World world, int x, int y, int z, Random random) {
        convertAdjacentGarbagePile(world, x + 1, y, z, random);
        convertAdjacentGarbagePile(world, x - 1, y, z, random);
        convertAdjacentGarbagePile(world, x, y + 1, z, random);
        convertAdjacentGarbagePile(world, x, y - 1, z, random);
        convertAdjacentGarbagePile(world, x, y, z + 1, random);
        convertAdjacentGarbagePile(world, x, y, z - 1, random);
    }

    private void convertAdjacentGarbagePile(World world, int x, int y, int z, Random random){
        if (random.nextInt(4) > 0) {
            return;
        }
        if (world.getBlockId(x, y, z) != BlockListener.garbagePile.id) {
            return;
        }
        world.setBlock(x, y, z, BlockListener.enrichedGarbagePile.id);
    }
}
