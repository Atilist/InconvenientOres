package io.github.atilist.inconvenientores.events.init;

import io.github.atilist.inconvenientores.item.LazyItemTemplate;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.util.Identifier;
import net.modificationstation.stationapi.api.util.Namespace;

public class ItemListener {

    public static LazyItemTemplate fakeDiamond;
    public static LazyItemTemplate garbage;

    @Entrypoint.Namespace
    public static Namespace NAMESPACE;

    @EventListener
    public void registerItems(ItemRegistryEvent event) {
        fakeDiamond = new LazyItemTemplate(Identifier.of(NAMESPACE, "fake_diamond"));
        garbage = new LazyItemTemplate(Identifier.of(NAMESPACE, "garbage"));

        BlockListener.fakeDiamondOre.specifyCustomDrop(NAMESPACE.id("fake_diamond"));
    }
}
