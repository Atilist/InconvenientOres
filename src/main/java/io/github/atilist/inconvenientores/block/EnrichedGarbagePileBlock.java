package io.github.atilist.inconvenientores.block;

import io.github.atilist.inconvenientores.events.init.ItemListener;
import net.minecraft.block.material.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.modificationstation.stationapi.api.util.Identifier;

import java.util.Random;

public class EnrichedGarbagePileBlock extends LazyBlockTemplate {
    public EnrichedGarbagePileBlock(Identifier identifier, Material material, float hardness, BlockSoundGroup blockSoundGroup) {
        super(identifier, material, hardness, blockSoundGroup);
    }

    @Override
    public int getDroppedItemId(int blockMeta, Random random) {
        return ItemListener.stuff.id;
    }

    @Override
    public int getDroppedItemCount(Random random) {
        return random.nextInt(4) + 1;
    }
}
