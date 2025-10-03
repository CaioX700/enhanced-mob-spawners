package com.branders.spawnermod.registry;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import com.branders.spawnermod.SpawnerMod;
import com.branders.spawnermod.item.SpawnerKey;

public final class ModRegistry {
    private ModRegistry() {}

    public static final Item SPAWNER_KEY = Registry.register(
        Registries.ITEM,
        new Identifier(SpawnerMod.MOD_ID, "spawner_key"),
        new SpawnerKey(new Item.Settings())
    );

    public static void init() {
        // registre aqui (depois do SPAWNER_KEY) grupos/receitas se existir
    }
}
