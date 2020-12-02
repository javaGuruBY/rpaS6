package by.jrr.max.simple.tdd.service;

import by.jrr.max.simple.tdd.bean.Data;
import by.jrr.max.simple.tdd.repository.AccountData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
class AccountServiceTest {

    AccountService accountService;

    @Mock
    AccountData accountData;

    @BeforeEach
    public void setUp() {
        accountService = new AccountService(accountData);
    }

    @Test
    void saveData() {
        accountService.saveData("max");

        verify(accountData).save(new Data("max"));

    }

    @Test
    void getLastData() {
        Data expected = new Data("max");
        when(accountData.getLastElement()).thenReturn(new Data("max"));

        Data actual = accountService.getLastData();

        assertEquals(expected, actual);
    }

    @Test
    void getLastData2() {
        Data expected = new Data("bax");
        when(accountData.getLastElement()).thenReturn(new Data("bax"));

        Data actual = accountService.getLastData();

        assertEquals(expected, actual);
    }
}
