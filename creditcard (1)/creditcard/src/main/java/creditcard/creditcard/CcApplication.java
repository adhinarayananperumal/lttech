package creditcard.creditcard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CcApplication.class, args);
	}

}
