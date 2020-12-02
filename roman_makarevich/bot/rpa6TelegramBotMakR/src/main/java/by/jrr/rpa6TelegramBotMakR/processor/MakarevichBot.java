package by.jrr.rpa6TelegramBotMakR.processor;

import by.jrr.rpa6TelegramBotMakR.dto.MyResponse;
import by.jrr.rpa6TelegramBotMakR.dto.ResponseWrapper;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class MakarevichBot extends TelegramLongPollingBot {
    UpdateDispatcher updateDispatcher = new UpdateDispatcher();

    @Override
    public String getBotUsername() {
        return "makarevichR_bot";
    }

    @Override
    public String getBotToken() {
        return "1431645036:AAE6Jq8W0SWOBlA5HaPFlpu5GLXVD0WXfBk";
    }

    @Override
    public void onUpdateReceived(Update update) {
        sendMessage(updateDispatcher.dispatch(update));
    }

    public void sendMessage(ResponseWrapper response) {
        if(response.hasUserResponse()) {
            sendMesg(response.getUserResponse());
        }
        if(response.hasAdminResponse()) {
            sendMesg(response.getAdminResponse());
        }
    }

    public void sendMesg(MyResponse response) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(String.valueOf(response.getCatId()));
        sendMessage.setText(response.getResponse());

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


}
