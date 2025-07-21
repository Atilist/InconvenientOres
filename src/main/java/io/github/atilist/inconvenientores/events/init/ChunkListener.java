package io.github.atilist.inconvenientores.events.init;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.world.World;
import net.minecraft.world.dimension.OverworldDimension;
import net.minecraft.world.gen.feature.OreFeature;
import net.modificationstation.stationapi.api.event.world.gen.WorldGenEvent;

import java.util.Random;

public class ChunkListener {

    @EventListener
    public void populate(WorldGenEvent.ChunkDecoration event) {
        if (event.world.dimension instanceof OverworldDimension) populateOverworld(event);
    }

    public void populateOverworld(WorldGenEvent.ChunkDecoration event) {
        Random random = event.random;
        World world = event.world;

        for (int i = 0; i < 4; i++) {
            int x = event.x + random.nextInt(16) + 8;
            int y = random.nextInt(128);
            int z = event.z + random.nextInt(16) + 8;
            (new OreFeature(BlockListener.explosiveOre.id, 8)).generate(world, random, x, y, z);
        }

        for (int i = 0; i < 4; i++) {
            int x = event.x + random.nextInt(16) + 8;
            int y = random.nextInt(128);
            int z = event.z + random.nextInt(16) + 8;
            (new OreFeature(BlockListener.heavenlyOre.id, 8)).generate(world, random, x, y, z);
        }

        for (int i = 0; i < 4; i++) {
            int x = event.x + random.nextInt(16) + 8;
            int y = random.nextInt(128);
            int z = event.z + random.nextInt(16) + 8;
            (new OreFeature(BlockListener.rotatingOre.id, 8)).generate(world, random, x, y, z);
        }

        for (int i = 0; i < 4; i++) {
            int x = event.x + random.nextInt(16) + 8;
            int y = random.nextInt(128);
            int z = event.z + random.nextInt(16) + 8;
            (new OreFeature(BlockListener.loudOre.id, 8)).generate(world, random, x, y, z);
        }

        for (int i = 0; i < 4; i++) {
            int x = event.x + random.nextInt(16) + 8;
            int y = random.nextInt(128);
            int z = event.z + random.nextInt(16) + 8;
            (new OreFeature(BlockListener.woodenStone.id, 8)).generate(world, random, x, y, z);
        }

        for (int i = 0; i < 4; i++) {
            int x = event.x + random.nextInt(16) + 8;
            int y = random.nextInt(128);
            int z = event.z + random.nextInt(16) + 8;
            (new OreFeature(BlockListener.windBag.id, 8)).generate(world, random, x, y, z);
        }

        for (int i = 0; i < 4; i++) {
            int x = event.x + random.nextInt(16) + 8;
            int y = random.nextInt(128);
            int z = event.z + random.nextInt(16) + 8;
            (new OreFeature(BlockListener.milkOre.id, 8)).generate(world, random, x, y, z);
        }

        for (int i = 0; i < 4; i++) {
            int x = event.x + random.nextInt(16) + 8;
            int y = random.nextInt(128);
            int z = event.z + random.nextInt(16) + 8;
            (new OreFeature(BlockListener.fakeDiamondOre.id, 8)).generate(world, random, x, y, z);
        }

        for (int i = 0; i < 4; i++) {
            int x = event.x + random.nextInt(16) + 8;
            int y = random.nextInt(128);
            int z = event.z + random.nextInt(16) + 8;
            (new OreFeature(BlockListener.garbageOre.id, 8)).generate(world, random, x, y, z);
        }

        for (int i = 0; i < 4; i++) {
            int x = event.x + random.nextInt(16) + 8;
            int y = random.nextInt(128);
            int z = event.z + random.nextInt(16) + 8;
            (new OreFeature(BlockListener.rockDirt.id, 8)).generate(world, random, x, y, z);
        }
    }
}
