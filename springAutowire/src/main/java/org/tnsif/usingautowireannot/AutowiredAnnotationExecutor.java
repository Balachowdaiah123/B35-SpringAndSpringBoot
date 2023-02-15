package org.tnsif.usingautowireannot;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

public class AutowiredAnnotationExecutor {

	public static void main(String[] args) {
		ApplicationContext f=new ClassPathXmlApplicationContext("web.xml");
		Citizen c=f.getBean("city",Citizen.class);
		c.display();

	}

}
