package by.jrr.rpa6TelegramBotMakR.commands.headMenu;

import by.jrr.rpa6TelegramBotMakR.commands.CommandProcessor;

public class MessageToMe extends CommandProcessor {
    private String number;
    private String name;

    public MessageToMe(String number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String getResponse() {
        return String.format("Клиент с именем %s и номером %s подал заявку.", name, number);
    }
}
