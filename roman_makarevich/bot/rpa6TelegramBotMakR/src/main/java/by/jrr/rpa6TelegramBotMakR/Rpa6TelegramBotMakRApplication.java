package by.jrr.rpa6TelegramBotMakR;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class Rpa6TelegramBotMakRApplication {

	public static void main(String[] args) {
		ApiContextInitializer.init();
		SpringApplication.run(Rpa6TelegramBotMakRApplication.class, args);
	}

}
