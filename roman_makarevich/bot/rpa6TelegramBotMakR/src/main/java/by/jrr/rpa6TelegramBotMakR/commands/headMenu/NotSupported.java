package by.jrr.rpa6TelegramBotMakR.commands.headMenu;

import by.jrr.rpa6TelegramBotMakR.commands.CommandProcessor;

public class NotSupported extends CommandProcessor {
    @Override
    public String getResponse() {
        return "Команда не поддерживается!";
    }
}
