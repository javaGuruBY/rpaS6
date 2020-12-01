package by.jrr.rpa6TelegramBotMakR.processor;

import by.jrr.rpa6TelegramBotMakR.commands.BotCommand;
import by.jrr.rpa6TelegramBotMakR.commands.headMenu.NotSupported;
import by.jrr.rpa6TelegramBotMakR.commands.headMenu.Start;
import by.jrr.rpa6TelegramBotMakR.dto.MyResponse;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

public class UpdateDispatcher {
    public MyResponse dispatch(Update update) {
        if (update.hasMessage()) {
            return processMessage(update.getMessage());
        }
        return new MyResponse();
    }

    public MyResponse processMessage(Message message) {
        if (message.hasText()) {
            return processText(message.getChatId(), message.getText());
        }
        return new MyResponse();
    }

    public MyResponse processText(Long chatId, String text) {
        BotCommand command = BotCommand.toCommand(text);
        switch (command) {
            case START:
                return new MyResponse(chatId, new Start());
            case NONE:
            default:
                return new MyResponse(chatId, new NotSupported());
        }
    }
}
