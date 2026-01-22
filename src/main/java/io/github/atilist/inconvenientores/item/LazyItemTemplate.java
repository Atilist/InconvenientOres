package io.github.atilist.inconvenientores.item;

import net.minecraft.item.ItemStack;
import net.modificationstation.stationapi.api.client.item.CustomTooltipProvider;
import net.modificationstation.stationapi.api.template.item.TemplateItem;
import net.modificationstation.stationapi.api.util.Identifier;
import org.jetbrains.annotations.NotNull;

public class LazyItemTemplate extends TemplateItem implements CustomTooltipProvider {
    private String expandedTooltip;

    public LazyItemTemplate(Identifier identifier) {
        super(identifier);
        setTranslationKey(identifier.namespace, identifier.path);
    }

    public void addTooltip(String expandedTooltip) {
        this.expandedTooltip = expandedTooltip;
    }

    @Override
    public @NotNull String[] getTooltip(ItemStack itemStack, String s) {
        if (expandedTooltip == null) {
            return new String[]{s};
        }
        return new String[]{s, expandedTooltip};
    }
}
