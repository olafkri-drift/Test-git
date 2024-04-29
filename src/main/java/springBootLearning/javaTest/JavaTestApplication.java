package springBootLearning.javaTest;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.springframework.context.annotation.Bean;
import springBootLearning.javaTest.run.Location;
import springBootLearning.javaTest.run.Run;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class JavaTestApplication {

	private static final Logger log = LoggerFactory.getLogger(JavaTestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(JavaTestApplication.class, args);
	}

	@Bean
	CommandLineRunner runner () {
		return args -> {
			Run run = new Run(1, "First run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5, Location.OUTDOOR);
			log.info("Run" + run);
		};
	}
}
