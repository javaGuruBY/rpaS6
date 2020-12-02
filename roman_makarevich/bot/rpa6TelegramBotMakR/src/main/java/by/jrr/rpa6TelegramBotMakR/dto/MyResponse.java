package by.jrr.rpa6TelegramBotMakR.dto;

import by.jrr.rpa6TelegramBotMakR.commands.CommandProcessor;

import java.util.Objects;

public class MyResponse {
    private Long catId;
    private String response;

       public MyResponse() {
    }

    public MyResponse(CommandProcessor processor) {
        this.response = processor.getResponse();
    }

    public MyResponse(Long catId, CommandProcessor processor) {
        this.catId = catId;
        this.response = processor.getResponse();
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public Long getCatId() {
        return catId;
    }

    public String getResponse() {
        return response;
    }

    @Override
    public String toString() {
        return "MyResponse{chatId=" + catId + ", response= '" + response + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyResponse response1 = (MyResponse) o;
        return Objects.equals(catId, response1.catId) &&
                Objects.equals(response, response1.response);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catId, response);
    }
}
