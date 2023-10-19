package com.example.app.SpringBootWebClients;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.logging.Logger;

@SpringBootApplication
public class WebClientsApplication {

	private static final Logger LOGGER =
			Logger.getLogger(WebClientsApplication.class.getName());

	public static void main(String[] args) {

		new SpringApplicationBuilder(WebClientsApplication.class)
				.bannerMode(Banner.Mode.OFF)
				.run(args);

		LOGGER.info("APP is running...");
	}
}
