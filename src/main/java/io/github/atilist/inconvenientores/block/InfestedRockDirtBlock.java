package io.github.atilist.inconvenientores.block;

import net.minecraft.block.material.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.modificationstation.stationapi.api.util.Identifier;

public class InfestedRockDirtBlock extends LazyBlockTemplate {
    public InfestedRockDirtBlock(Identifier identifier, Material material, float hardness, BlockSoundGroup blockSoundGroup) {
        super(identifier, material, hardness, blockSoundGroup);
    }
}
