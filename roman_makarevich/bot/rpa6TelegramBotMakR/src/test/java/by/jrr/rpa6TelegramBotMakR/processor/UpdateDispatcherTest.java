package by.jrr.rpa6TelegramBotMakR.processor;

import by.jrr.rpa6TelegramBotMakR.commands.headMenu.DebtCommandProcessor;
import by.jrr.rpa6TelegramBotMakR.dto.MyResponse;
import by.jrr.rpa6TelegramBotMakR.dto.ResponseWrapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpdateDispatcherTest {

    UpdateDispatcher updateDispatcher;

    @BeforeEach
    public void setUp() {
        updateDispatcher = new UpdateDispatcher();
    }

    @Test
    void processText1() {
        ResponseWrapper expected = createResponseWrapperWithAdminMock(123L);
        ResponseWrapper actual = updateDispatcher.processText(123L, "/debt", null);

        assertEquals(expected, actual);
    }

    @Test
    void processText2() {
        ResponseWrapper expected = createResponseWrapperWithAdminMock(345L);
        ResponseWrapper actual = updateDispatcher.processText(345L, "/debt", null);

        assertEquals(expected, actual);
    }

    private ResponseWrapper createResponseWrapperWithAdminMock(long chatId) {
        ResponseWrapper expected = new ResponseWrapper();
        DebtCommandProcessor debtCommandProcessor = new DebtCommandProcessor();
        MyResponse userResponse = new MyResponse(chatId, debtCommandProcessor);
        MyResponse adminResponse = new MyResponse(473566327L, debtCommandProcessor);

        expected.setUserResponse(userResponse);
        expected.setAdminResponse(adminResponse);
        return expected;
    }
}
