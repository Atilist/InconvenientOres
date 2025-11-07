package io.github.atilist.inconvenientores.item;

import io.github.atilist.inconvenientores.events.init.ItemListener;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.util.Identifier;

public class RockyCheeseItem extends LazyItemTemplate {
    public RockyCheeseItem(Identifier identifier) {
        super(identifier);
        setMaxCount(1);
    }

    @Override
    public ItemStack use(ItemStack stack, World world, PlayerEntity user) {
        stack = new ItemStack(ItemListener.milkStone, 1);
        user.heal(4);
        return stack;
    }
}
