package by.kasyan.Rpa6TelegramBot;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class KasyanlRpa6Bot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "kasyan_rpa6_telegram_bot";
    }

    @Override
    public String getBotToken() {
        return "1309794458:AAHD1J0liCYQK7AklzwqrkD7PBy9Lbe7xIo";
    }
    Hello hello = new Hello();
    @Override
    public void onUpdateReceived(Update update) {

        if(update.hasMessage()){
            Message message = update.getMessage();
            if (message.hasText()){
                String text = message.getText();
                if (text.equals("/start")){
                    String response = hello.printInformation();
                    sendMesg(message, response);
                } else if (text.equals("/hello")){
                    String response = "Здавствуйте, " + message.getFrom().getFirstName() + "!";
                    sendMesg(message, response);
                } else if (text.equals("/bye")){
                    String response = "До встречи, " + message.getFrom().getFirstName() + "!";
                    sendMesg(message, response);
                } else if (text.equals("/moodle")){
                    String response = "Если тебе так интересно, то перейди по ссылке: http://moodle.jrr.by";
                    sendMesg(message, response);
                }else if (text.equals("/pogoda")){
                    String response = "Актуальную погоду можно узнать тут: https://yandex.by/pogoda/minsk";
                    sendMesg(message, response);
                }else if (text.equals("/bynews")){
                    String response = "Последние новости в беларуси:" + '\n'+"https://tut.by";
                    sendMesg(message, response);
                }else if (text.equals("/worldnews")){
                    String response = "Последние новости в мире:" + '\n'+"https://ru.euronews.com";
                    sendMesg(message, response);
                }
            }
        }
    }
    public void sendMesg (Message message, String response){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(message.getChatId());
        sendMessage.setText(response);

        try {
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }
}

