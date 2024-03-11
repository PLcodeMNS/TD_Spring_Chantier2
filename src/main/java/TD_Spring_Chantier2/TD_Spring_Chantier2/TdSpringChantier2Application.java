package TD_Spring_Chantier2.TD_Spring_Chantier2;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class TdSpringChantier2Application {

	public static void main(String[] args) {
		SpringApplication.run(TdSpringChantier2Application.class, args);
	}

		@PostConstruct
		public void init() {
			TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
		}
}
