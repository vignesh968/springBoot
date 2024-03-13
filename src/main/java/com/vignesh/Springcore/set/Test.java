package com.vignesh.Springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/vignesh/Springcore/set/setconfig.xml");
		Student student=(Student) context.getBean("student");
		System.out.println(student);
	}

}
