package io.github.atilist.inconvenientores.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.registry.ItemRegistry;
import net.modificationstation.stationapi.api.util.Identifier;

public class FakeDiamondOreBlock extends LazyBlockTemplate {

    private Identifier dropID;

    public FakeDiamondOreBlock(Identifier identifier, Material material) {
        super(identifier, material, 2.0F, Block.STONE_SOUND_GROUP);
    }

    public void specifyCustomDrop(Identifier dropID) {
        this.dropID = dropID;
    }

    @Override
    public void afterBreak(World world, PlayerEntity playerEntity, int x, int y, int z, int meta) {
        if (world.isRemote) return;
        dropStack(world, x, y, z, new ItemStack(ItemRegistry.INSTANCE.get(dropID), 1, 0));
    }
}
