package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.settergetter.Address;
import com.example.demo.settergetter.Employee;

@SpringBootApplication
public class SpringAutoWiringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAutoWiringApplication.class, args);
		
		ApplicationContext applicationContext = null;
		
		try {
			
			applicationContext = new ClassPathXmlApplicationContext("autoWiring.xml");
			Object object = applicationContext.getBean("employee");
			Employee bean = (Employee) object;
			Address address = bean.getAddress();
			System.out.println(bean);
			System.out.println(address);
			
			
			
		}catch(Exception e) {
			
		}
		
	}

}
