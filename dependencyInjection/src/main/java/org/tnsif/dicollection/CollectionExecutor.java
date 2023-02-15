package org.tnsif.dicollection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionExecutor {

	public static void main(String[] args) {
		ApplicationContext p=new ClassPathXmlApplicationContext("collect.xml");
		CollectionDemo d=p.getBean("def",CollectionDemo.class);
		d.display();

	}

}
