package gg.sparkzy.casl.userconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class UserConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserConfigServerApplication.class, args);
	}

}
