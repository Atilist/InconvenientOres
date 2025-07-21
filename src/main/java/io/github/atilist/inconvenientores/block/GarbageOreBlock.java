package io.github.atilist.inconvenientores.block;

import io.github.atilist.inconvenientores.events.init.ItemListener;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.Random;

public class GarbageOreBlock extends LazyBlockTemplate {
    public GarbageOreBlock(Identifier identifier, Material material) {
        super(identifier, material, 1.5F, Block.STONE_SOUND_GROUP);
    }

    @Override
    public int getDroppedItemCount(Random random) {
        return 0;
    }

    @Override
    public void afterBreak(World world, PlayerEntity playerEntity, int x, int y, int z, int meta) {
        for (int i = 0; i < playerEntity.inventory.size(); i++) {
            if (playerEntity.inventory.getStack(i) == null) {
                playerEntity.inventory.setStack(i, new ItemStack(ItemListener.garbage, 64));
            }
        }
    }
}
