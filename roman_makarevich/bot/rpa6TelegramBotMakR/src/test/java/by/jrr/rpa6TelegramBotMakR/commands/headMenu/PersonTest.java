package by.jrr.rpa6TelegramBotMakR.commands.headMenu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void equalsTest() {
        Person person = new Person(2);
        Person personOlder = new Person(2);

        assertEquals(person, personOlder);
    }

}
