package io.github.cotrin8672.registry

import io.github.cotrin8672.MimicToolbox
import io.github.cotrin8672.content.MimicToolboxBlock
import net.minecraft.world.level.block.state.BlockBehaviour
import net.neoforged.neoforge.registries.DeferredRegister
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS

object BlockRegistry {
    private val helper = DeferredRegister.createBlocks(MimicToolbox.MOD_ID)

    val MIMIC_TOOLBOX = helper.register("mimic_toolbox") { _ ->
        MimicToolboxBlock(BlockBehaviour.Properties.of())
    }

    fun register() {
        helper.register(MOD_BUS)
    }
}
