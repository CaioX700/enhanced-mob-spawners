package com.branders.spawnermod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.branders.spawnermod.registry.ModRegistry;

public class SpawnerMod implements ModInitializer {
    public static final String MOD_ID = "spawnermod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModRegistry.init();
        LOGGER.info("[{}] initialized for 1.21.8", MOD_ID);
    }
}
