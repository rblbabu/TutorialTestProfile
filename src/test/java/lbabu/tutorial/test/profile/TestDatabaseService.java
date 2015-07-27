package lbabu.tutorial.test.profile;


import lbabu.tutorial.test.configuration.GeneralConfiguration;
import lbabu.tutorial.test.service.DatabaseService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("Test")
@ContextConfiguration(classes = {GeneralConfiguration.class,DataSourceConfigurationTest.class})
public class TestDatabaseService {
	
	@Autowired
	DatabaseService databaseService;
	@Test
	public void testPrint(){
		databaseService.printDataSource();
	}
}
