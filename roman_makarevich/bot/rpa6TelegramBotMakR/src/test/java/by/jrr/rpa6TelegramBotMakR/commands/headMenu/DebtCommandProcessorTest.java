package by.jrr.rpa6TelegramBotMakR.commands.headMenu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DebtCommandProcessorTest {

    DebtCommandProcessor debtCommandProcessor;

    @BeforeEach
    public void setUp() {
        debtCommandProcessor = new DebtCommandProcessor();
    }

    @Test
    void getResponse() {
        String actual = debtCommandProcessor.getResponse();
        String expected = "Долга нет";

        assertEquals(expected, actual);
    }
}
