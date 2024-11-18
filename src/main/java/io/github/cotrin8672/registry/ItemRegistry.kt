package io.github.cotrin8672.registry

import io.github.cotrin8672.MimicToolbox
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import net.neoforged.neoforge.registries.DeferredRegister
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS

object ItemRegistry {
    private val helper = DeferredRegister.createItems(MimicToolbox.MOD_ID)

    val MIMIC_TOOLBOX = helper.register("mimic_toolbox") { _ ->
        BlockItem(BlockRegistry.MIMIC_TOOLBOX.get(), Item.Properties())
    }

    fun register() {
        helper.register(MOD_BUS)
    }
}
