package by.jrr.rpa6TelegramBotMakR.dto;

import by.jrr.rpa6TelegramBotMakR.commands.CommandProcessor;

public class MyResponse {
    private Long catId;
    private String response;

    public MyResponse() {
        this.catId = null;
        this.response = null;
    }

    public MyResponse(Long catId, CommandProcessor processor) {
        this.catId = catId;
        this.response = processor.getResponse();
    }

    public Long getCatId() {
        return catId;
    }

    public String getText() {
        return response;
    }
}
