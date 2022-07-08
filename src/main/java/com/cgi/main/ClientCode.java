package com.cgi.main;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cgi.Employee;

public class ClientCode {
	public static void main(String[] args) throws IOException {
		String path = "application.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(path);
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println(emp);

	}

}
