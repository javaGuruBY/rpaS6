package by.jrr.rpa6TelegramBotMakR.processor;

import by.jrr.rpa6TelegramBotMakR.commands.BotCommand;
import by.jrr.rpa6TelegramBotMakR.commands.headMenu.*;
import by.jrr.rpa6TelegramBotMakR.dto.MyResponse;
import by.jrr.rpa6TelegramBotMakR.dto.ResponseWrapper;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

public class UpdateDispatcher {
    public ResponseWrapper dispatch(Update update) {
        if (update.hasMessage()) {

            return processMessage(update.getMessage());
        }
        return new ResponseWrapper();
    }

    public ResponseWrapper processMessage(Message message) {
        if (message.hasText()) {
            return processText(message.getChatId(), message.getText(), message.getFrom().getFirstName());
        }
        return new ResponseWrapper();
    }

    public ResponseWrapper processText(Long chatId, String text, String name) {

        BotCommand command = BotCommand.toCommand(text);

        switch (command) {
            case START:
                return new ResponseWrapper(new MyResponse(chatId, new Start()));
            case ORDER:
                return new ResponseWrapper(
                        new MyResponse(chatId, new Order()),
                        new MyResponse(new MessageToMe(text, name))
                );
            case CHECK_DEBT:
                return new ResponseWrapper(
                        new MyResponse(chatId, new DebtCommandProcessor()),
                        new MyResponse(new DebtCommandProcessor()));
            case NONE:
            default:
                return new ResponseWrapper(new MyResponse(chatId, new NotSupported()));
        }
    }
}
