package by.jrr.max.simple.tdd.repository;

import by.jrr.max.simple.tdd.bean.Data;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountDataTest {

    AccountData accountData;

    @BeforeEach
    public void setUp() {
        accountData = new AccountData();
    }


    @Test
    void saveMax() {
        Data[] expected = new Data[1];
        expected[0] = new Data("max");

        accountData.save(new Data("max"));

        Data[] actual = accountData.getData();

        assertArrayEquals(expected, actual);
     }

    @Test
    void saveEgor() {
        Data[] expected = new Data[1];
        expected[0] = new Data("Egor");

        accountData.save(new Data("Egor"));

        Data[] actual = accountData.getData();

        assertArrayEquals(expected, actual);
    }

    @Test
    void getLastElement() {
        Data expected = new Data("Egor");

        Data[] myData = new Data[1];
        myData[0] = new Data("Egor");
        accountData.setData(myData);

        Data actual = accountData.getLastElement();

        assertEquals(expected, actual);
    }
}
