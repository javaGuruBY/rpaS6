package by.jrr.rpa6TelegramBotMakR.commands.headMenu;

import by.jrr.rpa6TelegramBotMakR.commands.CommandProcessor;

public class Start extends CommandProcessor {
    @Override
    public String getResponse() {
        return "Здравствуйте!" +
                "Вы перешли по ссылке, потому что заинтересовались нашей продукцией." +
                "\nДанный бот предназначен для круглосуточного приёма заявок!" +
                "\nВпишите свой номер телефона и нажмите отправить, чтобы оставить заявку.";
    }
}
