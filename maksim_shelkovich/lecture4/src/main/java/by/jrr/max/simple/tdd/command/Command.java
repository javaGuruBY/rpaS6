package by.jrr.max.simple.tdd.command;

public enum Command {
    SAVE("/save", "Сохранить"),
    GET("/get", "Последняя запись");


    final String command;
    final String description;

    Command(String command, String description) {
        this.command = command;
        this.description = description;
    }

    public static Command toCommand(String command) {

        switch (command) {
            case "/save":
                return SAVE;
            case "/get":
                return GET;
            default:
                throw new RuntimeException();
        }
    }
}
