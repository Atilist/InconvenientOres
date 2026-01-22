package io.github.atilist.inconvenientores.item;

import io.github.atilist.inconvenientores.events.init.BlockListener;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.util.Identifier;

public class FalsifierItem extends LazyItemTemplate {
    public FalsifierItem(Identifier identifier) {
        super(identifier);
        setMaxDamage(1000);
        setMaxCount(1);
    }

    @Override
    public boolean useOnBlock(ItemStack stack, PlayerEntity user, World world, int x, int y, int z, int side) {
        if (world.getBlockId(x, y, z) == BlockListener.milkOre.id) {
            world.setBlock(x, y, z, BlockListener.softenedMilkOre.id);
            stack.damage(1, user);
            return true;
        } else if (world.getBlockId(x, y, z) == BlockListener.rockDirt.id) {
            world.setBlock(x, y, z, BlockListener.softenedRockDirt.id);
            stack.damage(1, user);
            return true;
        }
        return false;
    }
}
