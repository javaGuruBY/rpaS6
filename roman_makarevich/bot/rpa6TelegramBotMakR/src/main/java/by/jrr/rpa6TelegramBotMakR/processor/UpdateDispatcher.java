package by.jrr.rpa6TelegramBotMakR.processor;

import by.jrr.rpa6TelegramBotMakR.commands.BotCommand;
import by.jrr.rpa6TelegramBotMakR.commands.headMenu.MessageToMe;
import by.jrr.rpa6TelegramBotMakR.commands.headMenu.NotSupported;
import by.jrr.rpa6TelegramBotMakR.commands.headMenu.Order;
import by.jrr.rpa6TelegramBotMakR.commands.headMenu.Start;
import by.jrr.rpa6TelegramBotMakR.dto.MyResponse;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.ArrayList;
import java.util.Collections;

public class UpdateDispatcher {
    public MyResponse[] dispatch(Update update) {
        if (update.hasMessage()) {
            return processMessage(update.getMessage());
        }
        return new MyResponse[0];
    }

    public MyResponse[] processMessage(Message message) {
        if (message.hasText()) {
            return processText(message.getChatId(), message.getText());
        }
        return new MyResponse[0];
    }

    public MyResponse[] processText(Long chatId, String text) {
        BotCommand command = BotCommand.toCommand(text);
        switch (command) {
            case START:
                return new MyResponse[]{new MyResponse(chatId, new Start())};
            case ORDER:
                return new MyResponse[]{new MyResponse(chatId, new Order()), new MyResponse(Long.valueOf(473566327), new MessageToMe())};
            case NONE:
            default:
                return new MyResponse[]{new MyResponse(chatId, new NotSupported())};
        }
    }
}
