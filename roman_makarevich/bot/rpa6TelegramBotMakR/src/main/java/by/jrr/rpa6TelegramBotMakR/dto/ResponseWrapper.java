package by.jrr.rpa6TelegramBotMakR.dto;

import java.util.Objects;

public class ResponseWrapper {

    MyResponse userResponse;
    MyResponse adminResponse;

    Long vasiliyChatId = 473566327L;

    public ResponseWrapper() {
    }

    public ResponseWrapper(MyResponse userResponse) {
        this.userResponse = userResponse;
    }

    public ResponseWrapper(MyResponse userResponse, MyResponse adminResponse) {
        this.userResponse = userResponse;
        this.adminResponse = adminResponse;
        this.adminResponse.setCatId(vasiliyChatId);
    }

    public MyResponse getUserResponse() {
        return userResponse;
    }

    public void setUserResponse(MyResponse userResponse) {
        this.userResponse = userResponse;
    }

    public MyResponse getAdminResponse() {
        return adminResponse;
    }

    public void setAdminResponse(MyResponse adminResponse) {
        this.adminResponse = adminResponse;
    }

    public boolean hasUserResponse() {
        if (userResponse != null) {
            return true;
        }
        return false;
    }
    public boolean hasAdminResponse() {
        if (adminResponse != null) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ResponseWrapper{" +
                "userResponse=" + userResponse +
                ", adminResponse=" + adminResponse +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponseWrapper that = (ResponseWrapper) o;
        return Objects.equals(userResponse, that.userResponse) &&
                Objects.equals(adminResponse, that.adminResponse) &&
                Objects.equals(vasiliyChatId, that.vasiliyChatId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userResponse, adminResponse, vasiliyChatId);
    }
}
