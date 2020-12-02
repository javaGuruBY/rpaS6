package by.jrr.max.simple.tdd.service;

import by.jrr.max.simple.tdd.bean.Data;
import by.jrr.max.simple.tdd.repository.AccountData;

public class AccountDataMock extends AccountData {

    Data[] data = {new Data("max")};

    @Override
    public void save(Data myData) {
    }

    @Override
    public Data[] getData() {
        return super.getData();
    }

    @Override
    public void setData(Data[] data) {
        super.setData(data);
    }

    @Override
    public Data getLastElement() {
        return new Data("max");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
