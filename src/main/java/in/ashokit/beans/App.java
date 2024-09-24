package in.ashokit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		//starting IOC Container
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		Car car = context.getBean(Car.class);
		car.drive();
	}

}
