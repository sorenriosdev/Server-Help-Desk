package pe.cibertec.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerHelpDeskApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerHelpDeskApplication.class, args);
		System.out.println("Proyecto Eureka-Server-Help-Desk iniciado");
	}

}
