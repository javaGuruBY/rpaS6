package by.jrr.rpa6TelegramBotMakR.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResponseWrapperTest {

    @Test
    public void constructorTest() {
        MyResponse expected = new MyResponse();
        expected.setCatId(473566327L);

        ResponseWrapper wrapper = new ResponseWrapper(new MyResponse(), new MyResponse());

        MyResponse actual = wrapper.getAdminResponse();

        assertEquals(expected, actual);
    }

}
