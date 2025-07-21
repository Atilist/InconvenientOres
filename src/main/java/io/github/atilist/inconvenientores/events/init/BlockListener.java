package io.github.atilist.inconvenientores.events.init;

import io.github.atilist.inconvenientores.block.*;
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
    public static WoodenStoneBlock woodenStone;
    public static WindBagBlock windBag;
    public static MilkOreBlock milkOre;
    public static FakeDiamondOreBlock fakeDiamondOre;
    public static GarbageOreBlock garbageOre;

    @EventListener
    public void registerBlocks(BlockRegistryEvent event) {
        explosiveOre = new ExplosiveOreBlock(Identifier.of(NAMESPACE, "explosive_ore"), Material.STONE);
        heavenlyOre = new HeavenlyOreBlock(Identifier.of(NAMESPACE, "heavenly_ore"), Material.STONE);
        rotatingOre = new RotatingOreBlock(Identifier.of(NAMESPACE, "rotating_ore"), Material.STONE);
        loudOre = new LoudOreBlock(Identifier.of(NAMESPACE, "loud_ore"), Material.STONE);
        woodenStone = new WoodenStoneBlock(Identifier.of(NAMESPACE, "wooden_stone"), Material.STONE);
        windBag = new WindBagBlock(Identifier.of(NAMESPACE, "wind_bag"), Material.STONE);
        milkOre = new MilkOreBlock(Identifier.of(NAMESPACE, "milk_ore"), Material.STONE);
        fakeDiamondOre = new FakeDiamondOreBlock(Identifier.of(NAMESPACE, "fake_diamond_ore"), Material.STONE);
        garbageOre = new GarbageOreBlock(Identifier.of(NAMESPACE, "garbage_ore"), Material.STONE);
    }
}
