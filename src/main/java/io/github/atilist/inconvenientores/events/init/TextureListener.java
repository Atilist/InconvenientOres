package io.github.atilist.inconvenientores.events.init;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent;
import net.modificationstation.stationapi.api.client.texture.atlas.Atlases;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.util.Identifier;
import net.modificationstation.stationapi.api.util.Namespace;

public class TextureListener {

    @Entrypoint.Namespace
    public static Namespace NAMESPACE;

    @EventListener
    public void registerTextures(TextureRegisterEvent event) {
        /// Blocks
        // Natural ores
        BlockListener.explosiveOre.setTexture(getTextureIndex("block/explosiveOre"));
        BlockListener.heavenlyOre.setTexture(getTextureIndex("block/heavenlyOre"));
        BlockListener.rotatingOre.setTexture(getTextureIndex("block/rotatingOre"));
        BlockListener.loudOre.setTexture(getTextureIndex("block/loudOre"));
        BlockListener.woodenStone.setTexture(getTextureIndex("block/woodenStone"));
        BlockListener.windBag.setTexture(getTextureIndex("block/windBag"));
        BlockListener.milkOre.setTexture(getTextureIndex("block/milkOre"));
        BlockListener.fakeDiamondOre.setTexture(getTextureIndex("block/fakeDiamondOre"));
        BlockListener.garbageOre.setTexture(getTextureIndex("block/garbageOre"));
        BlockListener.rockDirt.setTexture(getTextureIndex("block/rockDirt"));
        // Modified ores
        BlockListener.softenedMilkOre.setTexture(getTextureIndex("block/softenedMilkOre"));
        BlockListener.softenedRockDirt.setTexture(getTextureIndex("block/softenedRockDirt"));
        // Doohickeys
        BlockListener.soakedMilkStoneCrate.setTexture(getTextureIndex("block/soakedMilkStoneCrate"));
        BlockListener.rockyCheeseCrate.setTexture(getTextureIndex("block/rockyCheeseCrate"));
        BlockListener.cheesyGarbage.setTexture(getTextureIndex("block/cheesyGarbage"));
        BlockListener.infestedGarbage.setTexture(getTextureIndex("block/infestedGarbage"));
        BlockListener.infestedRockDirt.setTexture(getTextureIndex("block/infestedRockDirt"));

        /// Items
        ItemListener.fakeDiamond.setTexture(Identifier.of(NAMESPACE, "item/fakeDiamond"));
        ItemListener.garbage.setTexture(Identifier.of(NAMESPACE, "item/garbage"));
        ItemListener.milkStone.setTexture(Identifier.of(NAMESPACE, "item/milkStone"));
        ItemListener.falsifier.setTexture(Identifier.of(NAMESPACE, "item/falsifier"));
        ItemListener.inconvenientCrate.setTexture(Identifier.of(NAMESPACE, "item/inconvenientCrate"));
        ItemListener.rockyCheese.setTexture(Identifier.of(NAMESPACE, "item/rockyCheese"));
        ItemListener.garbageBacteria.setTexture(Identifier.of(NAMESPACE, "item/garbageBacteria"));
    }

    private int getTextureIndex(String s) {
        if(s == null) {
            return 0;
        }
        return Atlases.getTerrain().addTexture(Identifier.of(NAMESPACE, s)).index;
    }
}
