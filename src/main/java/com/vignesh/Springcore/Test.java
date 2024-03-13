package com.vignesh.Springcore;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/vignesh/Springcore/springconfig.xml");
        Employee empObject=(Employee) ctx.getBean("emp");
	System.out.println(empObject.toString());
	}

}
