package lbabu.tutorial.test.service;

import lbabu.tutorial.test.configuration.DataSourceConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ActiveProfiles;


@Component("databaseService")
public class DatabaseService {	
	@Autowired
	private String dataSource;	
	
	public void printDataSource(){
		
		System.out.println(dataSource);
	}
	
}
