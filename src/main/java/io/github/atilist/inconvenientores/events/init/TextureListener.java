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
        BlockListener.explosiveOre.setTexture(getTextureIndex("block/explosiveOre"));
        BlockListener.heavenlyOre.setTexture(getTextureIndex("block/heavenlyOre"));
        BlockListener.rotatingOre.setTexture(getTextureIndex("block/rotatingOre"));
    }

    private int getTextureIndex(String s) {
        if(s == null) {
            return 0;
        }
        return Atlases.getTerrain().addTexture(Identifier.of(NAMESPACE, s)).index;
    }
}
