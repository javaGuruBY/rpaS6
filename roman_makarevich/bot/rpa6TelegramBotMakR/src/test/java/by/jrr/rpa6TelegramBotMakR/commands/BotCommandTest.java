package by.jrr.rpa6TelegramBotMakR.commands;

import by.jrr.rpa6TelegramBotMakR.commands.headMenu.DebtCommandProcessor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BotCommandTest {

    @Test
    void toCommand() {
        BotCommand expected = BotCommand.CHECK_DEBT;
        BotCommand actual = BotCommand.toCommand("/debt");

        assertEquals(expected, actual);

    }
}
