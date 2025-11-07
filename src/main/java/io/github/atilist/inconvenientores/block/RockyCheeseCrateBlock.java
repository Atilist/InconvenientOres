package io.github.atilist.inconvenientores.block;

import io.github.atilist.inconvenientores.events.init.ItemListener;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.Random;

public class RockyCheeseCrateBlock extends LazyBlockTemplate {
    public RockyCheeseCrateBlock(Identifier identifier, Material material, float hardness, BlockSoundGroup blockSoundGroup) {
        super(identifier, material, hardness, blockSoundGroup);
    }

    @Override
    public int getDroppedItemId(int blockMeta, Random random) {
        return ItemListener.inconvenientCrate.id;
    }

    @Override
    public void afterBreak(World world, PlayerEntity playerEntity, int x, int y, int z, int meta) {
        super.afterBreak(world, playerEntity, x, y, z, meta);
        dropStack(world, x, y, z, new ItemStack(ItemListener.rockyCheese, 1));
    }
}
