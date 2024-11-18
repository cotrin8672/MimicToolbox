package io.github.cotrin8672

import io.github.cotrin8672.registry.BlockRegistry
import io.github.cotrin8672.registry.ItemRegistry
import net.neoforged.fml.common.Mod

@Mod(MimicToolbox.MOD_ID)
object MimicToolbox {
    const val MOD_ID = "mimictoolbox"

    init {
        BlockRegistry.register()
        ItemRegistry.register()
    }
}
