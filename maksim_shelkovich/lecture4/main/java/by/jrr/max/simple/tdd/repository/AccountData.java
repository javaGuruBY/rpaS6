package by.jrr.max.simple.tdd.repository;

import by.jrr.max.simple.tdd.bean.Data;

public class AccountData {

    Data[] data = new Data[0];

    public void save(Data myData) {
        Data[] newData = new Data[data.length + 1];
        newData[data.length] = myData;
        data = newData;
    }

    public Data[] getData() {
        return data;
    }

    public void setData(Data[] data) {
        this.data = data;
    }

    public Data getLastElement() {
        return null; //this.data[data.length - 1];
    }
}

