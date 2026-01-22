package io.github.atilist.inconvenientores.block.item;

import io.github.atilist.inconvenientores.block.LazyBlockTemplate;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.modificationstation.stationapi.api.client.item.CustomTooltipProvider;
import org.jetbrains.annotations.NotNull;

public class FlexibleTooltipBlockItem extends BlockItem implements CustomTooltipProvider {
    public FlexibleTooltipBlockItem(int i) {
        super(i);
    }

    @Override
    public @NotNull String[] getTooltip(ItemStack itemStack, String s) {
        String expandedTooltip = ((LazyBlockTemplate)this.getBlock()).getExpandedTooltip();
        if (expandedTooltip == null) {
            return new String[]{s};
        }
        return new String[]{s, expandedTooltip};
    }
}
