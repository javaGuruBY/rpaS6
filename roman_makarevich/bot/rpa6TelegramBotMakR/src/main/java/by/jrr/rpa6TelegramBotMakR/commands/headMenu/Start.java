package by.jrr.rpa6TelegramBotMakR.commands.headMenu;

import by.jrr.rpa6TelegramBotMakR.commands.CommandProcessor;

public class Start extends CommandProcessor {
    @Override
    public String getResponse() {
        return "скажи /hello !";
    }
}
