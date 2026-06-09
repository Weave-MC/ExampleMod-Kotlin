package com.example.mod.listener

import net.weavemc.api.event.RenderGameOverlayEvent
import net.weavemc.api.event.SubscribeEvent

object RenderGameOverlayEventListener {
    @SubscribeEvent
    fun onEvent(event: RenderGameOverlayEvent) {
        println("Render overlay event")
    }
}
