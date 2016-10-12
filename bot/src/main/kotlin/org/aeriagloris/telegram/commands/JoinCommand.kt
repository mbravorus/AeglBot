package org.aeriagloris.telegram.commands

import org.telegram.telegrambots.TelegramApiException
import org.telegram.telegrambots.api.methods.send.SendMessage
import org.telegram.telegrambots.api.objects.Chat
import org.telegram.telegrambots.api.objects.User
import org.telegram.telegrambots.bots.AbsSender
import org.telegram.telegrambots.logging.BotLogger
import org.aeriagloris.persistence.JdbcStore

class JoinCommand(val store: JdbcStore) : ExtendedCommand("join", "Join a fireteam from the list")
{
    override fun execute(absSender: AbsSender, user: User, chat: Chat, arguments: Array<String>)
    {
        if (arguments.size != 1) {
            sendReply(absSender, chat, "To join a fireteam provide fireteam id\n"
            + "Fireteam IDs are available from output of /list command.")
            return
        }

        

        sendReply(absSender, chat, "You are joining - please provide fireteam id in arguments")
    }
}
