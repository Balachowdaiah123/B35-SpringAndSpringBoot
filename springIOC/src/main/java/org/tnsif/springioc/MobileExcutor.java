package org.tnsif.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileExcutor {

	public static void main(String[] args) {
		//Atrial a=new Atrial();
		/*Jio j=new Jio();
		a.call();
		a.data();
		j.call();
		j.data();*/
		
		//Spring IOC
		
		/* Here Application is a IOC container and its a interface 
		 * to implement these we need to use implemnetbls 
		 * whicj is classpathxml Applicatiom text
		 */
		//we can rename the "beans.xml"files as well
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Configuration loaded.....");
		/*Atrial a1=(Atrial)a.getBean("airtel");
		Jio j=(Jio)a.getBean("jio");
		a1.call();
		a1.data();
		j.call();
		j.data();*/
		Sim s=a.getBean("sim",Sim.class);
		s.call();
		s.data();

	}

}
