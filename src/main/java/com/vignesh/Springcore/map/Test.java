package com.vignesh.Springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/vignesh/Springcore/map/mapconfig.xml");
		Country country=(Country) context.getBean("country");
		System.out.println(country);
	}

}
