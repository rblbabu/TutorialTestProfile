package lbabu.tutorial.test.configuration;


import lbabu.tutorial.test.service.DatabaseService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Import({DataSourceConfiguration.class}) 
@Configuration
public class GeneralConfiguration {
	 
	@Bean
	DatabaseService databaseService(){
		return new DatabaseService();
	}
	
	
}
