package lbabu.tutorial.test.profile;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;;
@Configuration
@Profile("Test")
public class DataSourceConfigurationTest {
	
	@Bean
	public String dataSource(){
		return "Test DataSource";
	}
}
