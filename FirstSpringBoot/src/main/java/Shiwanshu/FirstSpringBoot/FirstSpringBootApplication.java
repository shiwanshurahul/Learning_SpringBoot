package Shiwanshu.FirstSpringBoot;
//is package ke bahar components ko scan ni krega

import org.springframework.boot.SpringApplication;  //imports the SpringApplication class, which is the entry point for launching Spring Boot apps. It provides the run() method used in the main() method below.
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   //This marks the class as the main Spring Boot application class.
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
	}

}
//@SpringBootApplication -> project me ek hoga jo main class/ entry clas pe lagate
// incorporates 3 annotation : @Configuration, @EnableAutoConfiguration, @ComponentScan
// @ComponentScan -> ye spring ko bolta ki scan the beans (@component wale classes)
// @Configuration -> jis class pe lgate wo config deta, us class me Bean bana skte using @Bean

//src/
//		└── main/
//		└── java/
//		└── Shiwanshu/
//		└── FirstSpringBoot/         ← main package
//		├── FirstSpringBootApplication.java  ← @SpringBootApplication
//               ├── controller/
//		│   └── MyController.java           ← @RestController
//                ├── service/
//		│   └── MyService.java              ← @Service
//                └── repository/
//		└── MyRepository.java           ← @Repository

//Everything is inside Shiwanshu.FirstSpringBoot.
//Spring Boot will automatically detect and manage all components.
// warna manually configure @SpringBootApplication(scanBasePackages = {"Shiwanshu.FirstSpringBoot", "Shiwanshu.controller"})