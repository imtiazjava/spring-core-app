package myapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.cgi.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/application.xml")
public class SpringTestApplication {
	@Autowired
	ApplicationContext context;

	@Test
	public void testBean() {
		System.out.println(context);
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println(emp);
		
	}

}
