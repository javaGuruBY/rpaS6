package by.jrr.rpa6TelegramBotMakR.commands;

public enum BotCommand {
    START("/start", "Старт"),
    ORDER("/order", "Заказ"),
    NONE("", "");

    final String command;
    final String description;

    BotCommand(String command, String description) {
        this.command = command;
        this.description = description;
    }

    public String getCommand() {
        return command;
    }

    public String getDescription() {
        return description;
    }

    public static BotCommand toCommand(String command) {
        if (command.startsWith("+375")&& command.length() == 13){
            return ORDER;
        }
        switch (command) {
            case "/start":
                return START;
            default:
                return NONE;
        }
    }
}
