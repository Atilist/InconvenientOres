package io.github.atilist.inconvenientores.events.init;

import io.github.atilist.inconvenientores.block.ExplosiveOreBlock;
import io.github.atilist.inconvenientores.block.HeavenlyOreBlock;
import io.github.atilist.inconvenientores.block.LoudOreBlock;
import io.github.atilist.inconvenientores.block.RotatingOreBlock;
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
    public static HeavenlyOreBlock heavenlyOre;
    public static RotatingOreBlock rotatingOre;
    public static LoudOreBlock loudOre;

    @EventListener
    public void registerBlocks(BlockRegistryEvent event) {
        explosiveOre = new ExplosiveOreBlock(Identifier.of(NAMESPACE, "explosive_ore"), Material.STONE);
        heavenlyOre = new HeavenlyOreBlock(Identifier.of(NAMESPACE, "heavenly_ore"), Material.STONE);
        rotatingOre = new RotatingOreBlock(Identifier.of(NAMESPACE, "rotating_ore"), Material.STONE);
        loudOre = new LoudOreBlock(Identifier.of(NAMESPACE, "loud_ore"), Material.STONE);
    }
}
