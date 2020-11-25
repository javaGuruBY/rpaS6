package by.jrr.rpa6TelegramBotMakR;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class MakarevichBot extends TelegramLongPollingBot {

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
        if (update.hasMessage()) {
            Message message = update.getMessage();
            if (message.hasText()) {
                String text = message.getText();
                if (text.equals("/start")) {
                    String response = "/hello - U can say\"hello!\"\n" +
                            "/say ... - you can ask me anything.\n" +
                            "/java - you will learn all about java.";
                    sendMesg(message, response);
                } else if (text.equals("/hello")) {
                    String response = "Hello!, " + message.getFrom().getFirstName();
                    sendMesg(message, response);
                } else if (text.startsWith("/say")) {
                    String question = text.substring(text.indexOf("/say") + "/say".length()).trim();
                    if (question.equals("где?")) {
                        String response = "Тут!";
                        sendMesg(message, response);
                    } else if (question.equals("кто?")) {
                        String response = "Я!";
                        sendMesg(message, response);
                    } else {
                        String response = "I don't know!";
                        sendMesg(message, response);
                    }

                } else if (text.equals("/java")) {
                    String response = "https://moodle.jrr.by/";
                    sendMesg(message, response);
                } else {
                    String response = "/hello - U can say\"hello!\"\n" +
                            "/say ... - you can ask me anything.\n" +
                            "/java - you will learn all about java.";
                    sendMesg(message, response);
                }
            }
        }

    }

    public void sendMesg(Message message, String response) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(String.valueOf(message.getChatId()));
        sendMessage.setText(response);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


}
