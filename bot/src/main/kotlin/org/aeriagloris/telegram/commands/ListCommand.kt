package org.aeriagloris.telegram.commands

import org.telegram.telegrambots.TelegramApiException
import org.telegram.telegrambots.api.methods.send.SendMessage
import org.telegram.telegrambots.api.objects.Chat
import org.telegram.telegrambots.api.objects.User
import org.telegram.telegrambots.bots.AbsSender
import org.telegram.telegrambots.bots.commands.BotCommand
import org.telegram.telegrambots.logging.BotLogger
import org.aeriagloris.persistence.JdbcStore

class ListCommand(val store: JdbcStore) : BotCommand("list", "List current lfg/lfm")
{
    override fun execute(absSender: AbsSender, user: User, chat: Chat, arguments: Array<String>)
    {
        val answer = SendMessage()
        answer.setChatId(chat.getId().toString())
        answer.setText("This is a list\nblablab\nlong\nlist")

        try {
            absSender.sendMessage(answer)
        } catch (e: TelegramApiException) {
            BotLogger.error("LISTCOMMAND", e)
        }
    }
}