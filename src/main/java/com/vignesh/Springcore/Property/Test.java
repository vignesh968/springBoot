package com.vignesh.Springcore.Property;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/vignesh/Springcore/Property/propertyconfig.xml");
		CountryandLanguage country=(CountryandLanguage) context.getBean("countryandlang");
		System.out.println(country);
	}

}
