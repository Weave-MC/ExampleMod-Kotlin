package com.example.mod.command

import net.minecraft.client.Minecraft
import net.minecraft.util.BlockPos
import net.minecraft.util.ChatComponentText
import net.weavemc.api.command.Command

object CommandExampleMod : Command("examplemod", "example", "exm") {
    override fun execute(args: Array<String>) {
        when (args.size) {
            1 -> "Available subcommands are ${getSuggestions(arrayOf(""), null)?.joinToString(", ")}".sendToChat()

            2 -> when (args[1]) {
                "name" -> "Name is Weave Example Mod".sendToChat()
                "version" -> "Version is 0.0.0".sendToChat()
                else -> "Invalid subcommands".sendToChat()
            }
        }
    }

    override fun getSuggestions(
        args: Array<String>,
        targetPos: BlockPos?
    ): Array<String>? = when (args.size) {
        1 -> listOf("name", "version").filter { it.startsWith(args[0]) }.toTypedArray()

        else -> null
    }

    private fun String.sendToChat() = Minecraft.getMinecraft().thePlayer?.addChatMessage(ChatComponentText(this))
}