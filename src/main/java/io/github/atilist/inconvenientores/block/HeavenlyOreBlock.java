package io.github.atilist.inconvenientores.block;

import io.github.atilist.inconvenientores.events.init.ItemListener;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.Random;

public class HeavenlyOreBlock extends LazyBlockTemplate {
    public HeavenlyOreBlock(Identifier identifier, Material material) {
        super(identifier, material, 0.2F, Block.STONE_SOUND_GROUP);
    }

    @Override
    public void afterBreak(World world, PlayerEntity playerEntity, int x, int y, int z, int meta) {
        for (int slot = 0; slot < playerEntity.inventory.size(); slot++) {
            ItemStack itemStack = playerEntity.inventory.getStack(slot);
            if (itemStack == null) {
                continue;
            }
            if (itemStack.itemId == ItemListener.consolidator.id) {
                return;
            }
        }
        playerEntity.setPosition(x, 1024, z);
    }

    @Override
    public int getDroppedItemCount(Random random) {
        return 0;
    }
}
