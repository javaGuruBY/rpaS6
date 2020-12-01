package by.jrr.rpa6TelegramBotMakR.commands.headMenu;

import by.jrr.rpa6TelegramBotMakR.commands.CommandProcessor;

public class Order extends CommandProcessor {
    @Override
    public String getResponse() {
        return "Заказ принят, ожидайте подтверждения!";
    }
}
