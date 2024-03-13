package com.vignesh.Springcore.lc.xmlconfig;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/vignesh/Springcore/lc/xmlconfig/config.xml");
        Patient patient=(Patient) ctx.getBean("patient");
	System.out.println(patient.toString());
	}

}
