package io.github.atilist.inconvenientores.events.init;

import io.github.atilist.inconvenientores.block.*;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.util.Identifier;
import net.modificationstation.stationapi.api.util.Namespace;

public class BlockListener {
    @Entrypoint.Namespace
    public static Namespace NAMESPACE;
    private static final String GREY = "§7";

    // Natural ores
    public static ExplosiveOreBlock explosiveOre;
    public static HeavenlyOreBlock heavenlyOre;
    public static RotatingOreBlock rotatingOre;
    public static LoudOreBlock loudOre;
    public static WoodenStoneBlock woodenStone;
    public static WindBagBlock windBag;
    public static MilkOreBlock milkOre;
    public static FakeDiamondOreBlock fakeDiamondOre;
    public static GarbageOreBlock garbageOre;
    public static RockDirtBlock rockDirt;

    // Modified ores
    public static SoftenedMilkOreBlock softenedMilkOre;
    public static LazyBlockTemplate softenedRockDirt;

    // Doohickeys
    public static SoakedMilkStoneCrateBlock soakedMilkStoneCrate;
    public static RockyCheeseCrateBlock rockyCheeseCrate;
    public static CheesyGarbageBlock cheesyGarbage;
    public static InfestedGarbageBlock infestedGarbage;
    public static InfestedRockDirtBlock infestedRockDirt;
    public static LazyBlockTemplate garbagePile;
    public static EnrichedGarbagePileBlock enrichedGarbagePile;
    public static LazyBlockTemplate stuffPile;

    @EventListener
    public void registerBlocks(BlockRegistryEvent event) {
        // Natural ores
        explosiveOre = new ExplosiveOreBlock(Identifier.of(NAMESPACE, "explosive_ore"), Material.STONE);
        heavenlyOre = new HeavenlyOreBlock(Identifier.of(NAMESPACE, "heavenly_ore"), Material.STONE);
        rotatingOre = new RotatingOreBlock(Identifier.of(NAMESPACE, "rotating_ore"), Material.STONE);
        loudOre = new LoudOreBlock(Identifier.of(NAMESPACE, "loud_ore"), Material.STONE);
        woodenStone = new WoodenStoneBlock(Identifier.of(NAMESPACE, "wooden_stone"), Material.STONE);
        windBag = new WindBagBlock(Identifier.of(NAMESPACE, "wind_bag"), Material.STONE);
        milkOre = new MilkOreBlock(Identifier.of(NAMESPACE, "milk_ore"), Material.STONE);
        fakeDiamondOre = new FakeDiamondOreBlock(Identifier.of(NAMESPACE, "fake_diamond_ore"), Material.STONE);
        garbageOre = new GarbageOreBlock(Identifier.of(NAMESPACE, "garbage_ore"), Material.STONE);
        rockDirt = new RockDirtBlock(Identifier.of(NAMESPACE, "rock_dirt"), Material.STONE, 5.0F, Block.GRAVEL_SOUND_GROUP);

        // Modified ores
        softenedMilkOre = new SoftenedMilkOreBlock(Identifier.of(NAMESPACE, "softened_milk_ore"), Material.STONE);
        softenedRockDirt = new LazyBlockTemplate(Identifier.of(NAMESPACE, "softened_rock_dirt"), Material.STONE, 5.0F, Block.GRAVEL_SOUND_GROUP);

        // Doohickeys
        soakedMilkStoneCrate = new SoakedMilkStoneCrateBlock(Identifier.of(NAMESPACE, "soaked_milk_stone_crate"), Material.STONE, 2.0F, Block.STONE_SOUND_GROUP);
        rockyCheeseCrate = new RockyCheeseCrateBlock(Identifier.of(NAMESPACE, "rocky_cheese_crate"), Material.STONE, 2.0F, Block.STONE_SOUND_GROUP);
        cheesyGarbage = new CheesyGarbageBlock(Identifier.of(NAMESPACE, "cheesy_garbage"), Material.WOOD, 2.0F, Block.WOOD_SOUND_GROUP);
        infestedGarbage = new InfestedGarbageBlock(Identifier.of(NAMESPACE, "infested_garbage"), Material.WOOD, 2.0F, Block.WOOD_SOUND_GROUP);
        infestedRockDirt = new InfestedRockDirtBlock(Identifier.of(NAMESPACE, "infested_rock_dirt"), Material.STONE, 5.0F, Block.GRAVEL_SOUND_GROUP);
        garbagePile = new LazyBlockTemplate(Identifier.of(NAMESPACE, "garbage_pile"), Material.WOOD, 2.0F, Block.WOOD_SOUND_GROUP);
        enrichedGarbagePile = new EnrichedGarbagePileBlock(Identifier.of(NAMESPACE, "enriched_garbage_pile"), Material.WOOD, 2.0F, Block.WOOD_SOUND_GROUP);
        stuffPile = new LazyBlockTemplate(Identifier.of(NAMESPACE, "stuff_pile"), Material.WOOD, 2.0F, Block.WOOD_SOUND_GROUP);

        soakedMilkStoneCrate.addTooltip(GREY + "Let it sit for a while in the world");
        milkOre.addTooltip(GREY + "Must be harvested with a bucket");
        softenedMilkOre.addTooltip(GREY + "Falsified version. Bucket still needed");
        cheesyGarbage.addTooltip(GREY + "Place next to water and wait for green");
        infestedRockDirt.addTooltip(GREY + "Place garbage piles next to it for enrichment");
    }
}
