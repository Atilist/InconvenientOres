package io.github.atilist.inconvenientores.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.Random;

public class LoudOreBlock extends LazyBlockTemplate {

    private final Random random = new Random();

    public LoudOreBlock(Identifier identifier, Material material) {
        super(identifier, material, 2.5F, Block.STONE_SOUND_GROUP);
    }

    @Override
    public void afterBreak(World world, PlayerEntity playerEntity, int x, int y, int z, int meta) {
        String[] mobSounds = {"cow", "pig", "chicken", "sheep", "wolf", "zombie", "spider", "skeleton"};
        String[] noteSounds = {"harp", "snare", "hat", "bassattack"};
        for (int i = 0; i < 4; i++) {
            world.playSound(x, y, z, "mob." + mobSounds[random.nextInt(mobSounds.length)], 1.0F, random.nextFloat());
            world.playSound(x, y, z, "portal.portal", 1.0F, random.nextFloat());
            world.playSound(x, y, z, "tile.piston.out", 1.0F, random.nextFloat());
            world.playSound(x, y, z, "note." + noteSounds[random.nextInt(noteSounds.length)], 1.0F, random.nextFloat());
        }
    }

    @Override
    public int getDroppedItemCount(Random random) {
        return 0;
    }
}
