package lbabu.tutorial.test.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;;
@Configuration
public class DataSourceConfiguration {
	
	@Bean
	public String dataSource(){
		return "Dev DataSource";
	}
}
