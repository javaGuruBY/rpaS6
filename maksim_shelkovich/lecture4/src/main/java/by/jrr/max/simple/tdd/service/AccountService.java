package by.jrr.max.simple.tdd.service;

import by.jrr.max.simple.tdd.bean.Data;
import by.jrr.max.simple.tdd.repository.AccountData;

public class AccountService {

    AccountData accountData;

    public AccountService(AccountData accountData) {
        this.accountData = accountData;
    }

    public void saveData(String name) {
        Data data = new Data(name);

        accountData.save(data);
    }

    public Data getLastData() {
        return accountData.getLastElement();
    }
}
