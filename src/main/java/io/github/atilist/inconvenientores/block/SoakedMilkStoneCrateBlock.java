package io.github.atilist.inconvenientores.block;

import io.github.atilist.inconvenientores.events.init.BlockListener;
import net.minecraft.block.material.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.Random;

public class SoakedMilkStoneCrateBlock extends LazyBlockTemplate {
    public SoakedMilkStoneCrateBlock(Identifier identifier, Material material, float hardness, BlockSoundGroup blockSoundGroup) {
        super(identifier, material, hardness, blockSoundGroup);
        setTickRandomly(true);
    }

    @Override
    public void onTick(World world, int x, int y, int z, Random random) {
        world.setBlock(x, y, z, BlockListener.rockyCheeseCrate.id);
    }
}
