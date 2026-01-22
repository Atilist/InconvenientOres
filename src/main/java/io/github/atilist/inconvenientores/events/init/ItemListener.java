package io.github.atilist.inconvenientores.events.init;

import io.github.atilist.inconvenientores.item.FalsifierItem;
import io.github.atilist.inconvenientores.item.LazyItemTemplate;
import io.github.atilist.inconvenientores.item.RockyCheeseItem;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.registry.BlockRegistry;
import net.modificationstation.stationapi.api.util.Identifier;
import net.modificationstation.stationapi.api.util.Namespace;

public class ItemListener {

    public static LazyItemTemplate fakeDiamond;
    public static LazyItemTemplate garbage;
    public static LazyItemTemplate milkStone;
    public static FalsifierItem falsifier;
    public static LazyItemTemplate inconvenientCrate;
    public static RockyCheeseItem rockyCheese;
    public static LazyItemTemplate garbageBacteria;

    @Entrypoint.Namespace
    public static Namespace NAMESPACE;

    @EventListener
    public void registerItems(ItemRegistryEvent event) {
        fakeDiamond = new LazyItemTemplate(Identifier.of(NAMESPACE, "fake_diamond"));
        garbage = new LazyItemTemplate(Identifier.of(NAMESPACE, "garbage"));
        milkStone = new LazyItemTemplate(Identifier.of(NAMESPACE, "milk_stone"));
        falsifier = new FalsifierItem(Identifier.of(NAMESPACE, "falsifier"));
        inconvenientCrate = new LazyItemTemplate(Identifier.of(NAMESPACE, "inconvenient_crate"));
        rockyCheese = new RockyCheeseItem(Identifier.of(NAMESPACE, "rocky_cheese"));
        garbageBacteria = new LazyItemTemplate(Identifier.of(NAMESPACE, "garbage_bacteria"));

        BlockListener.fakeDiamondOre.specifyCustomDrop(NAMESPACE.id("fake_diamond"));
        BlockListener.rockDirt.specifyCustomDrop(BlockRegistry.INSTANCE.getId(Block.COBBLESTONE));
    }
}
