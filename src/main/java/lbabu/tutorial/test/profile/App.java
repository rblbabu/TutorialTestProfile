package lbabu.tutorial.test.profile;

import lbabu.tutorial.test.configuration.GeneralConfiguration;
import lbabu.tutorial.test.service.DatabaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	@Autowired
	DatabaseService databaseService;
	
    public static void main( String[] args )
    {
    	
    	 ApplicationContext ctx = 
    			   new AnnotationConfigApplicationContext(GeneralConfiguration.class);
    	 DatabaseService databaseService = ctx.getBean(DatabaseService.class);
        databaseService.printDataSource();
    }
}