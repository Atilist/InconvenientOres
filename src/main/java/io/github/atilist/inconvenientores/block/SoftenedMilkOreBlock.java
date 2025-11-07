package io.github.atilist.inconvenientores.block;

import io.github.atilist.inconvenientores.events.init.ItemListener;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.Random;

public class SoftenedMilkOreBlock extends LazyBlockTemplate {
    public SoftenedMilkOreBlock(Identifier identifier, Material material) {
        super(identifier, material, -1.0F, Block.STONE_SOUND_GROUP);
        setResistance(696969F);
    }

    @Override
    public int getDroppedItemCount(Random random) {
        return 0;
    }

    @Override
    public boolean onUse(World world, int x, int y, int z, PlayerEntity player) {
        ItemStack hand = player.getHand();
        if (hand == null || hand.getItem() == null) {
            return false;
        }
        if (hand.getItem().id != Item.BUCKET.id) {
            return false;
        }
        player.inventory.addStack(new ItemStack(ItemListener.milkStone, 1));
        world.setBlock(x, y, z, Block.STONE.id);
        return true;
    }
}
