package io.github.atilist.inconvenientores.events.init;

import io.github.atilist.inconvenientores.block.ExplosiveOreBlock;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.util.Identifier;
import net.modificationstation.stationapi.api.util.Namespace;

public class BlockListener {
    @Entrypoint.Namespace
    public static Namespace NAMESPACE;

    public static ExplosiveOreBlock explosiveOre;

    @EventListener
    public void registerBlocks(BlockRegistryEvent event) {
        explosiveOre = new ExplosiveOreBlock(Identifier.of(NAMESPACE, "explosive_ore"), Material.STONE);
    }
}
