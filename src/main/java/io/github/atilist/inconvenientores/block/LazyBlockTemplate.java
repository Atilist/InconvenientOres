package io.github.atilist.inconvenientores.block;

import io.github.atilist.inconvenientores.block.item.FlexibleTooltipBlockItem;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.block.material.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.modificationstation.stationapi.api.block.HasCustomBlockItemFactory;
import net.modificationstation.stationapi.api.template.block.TemplateBlock;
import net.modificationstation.stationapi.api.util.Identifier;

@Setter
@HasCustomBlockItemFactory(FlexibleTooltipBlockItem.class)
public class LazyBlockTemplate extends TemplateBlock {

    private int texture;
    @Getter
    private String expandedTooltip;

    public LazyBlockTemplate(Identifier identifier, Material material, float hardness, BlockSoundGroup blockSoundGroup) {
        super(identifier, material);
        setTranslationKey(identifier.namespace, identifier.path);
        setHardness(hardness);
        setSoundGroup(blockSoundGroup);
    }

    @Override
    public int getTexture(int side) {
        return texture;
    }

    public void addTooltip(String expandedTooltip) {
        this.expandedTooltip = expandedTooltip;
    }
}
