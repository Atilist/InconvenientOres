package io.github.atilist.inconvenientores.block;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.registry.ItemRegistry;
import net.modificationstation.stationapi.api.util.Identifier;

public class RockDirtBlock extends LazyBlockTemplate {

    private Identifier dropId;

    public RockDirtBlock(Identifier identifier, Material material, float hardness, BlockSoundGroup blockSoundGroup) {
        super(identifier, material, hardness, blockSoundGroup);
    }

    public void specifyCustomDrop(Identifier dropID) {
        this.dropId = dropID;
    }

    @Override
    public void afterBreak(World world, PlayerEntity playerEntity, int x, int y, int z, int meta) {
        if (world.isRemote) return;
        dropStack(world, x, y, z, new ItemStack(ItemRegistry.INSTANCE.get(dropId), 1, 0));
    }
}
