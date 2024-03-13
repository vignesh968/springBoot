package com.vignesh.Springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
@SuppressWarnings("resource")
public static void main(String[] args) {
	
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/vignesh/Springcore/list/listconfig.xml");
Hospital hospital=(Hospital) context.getBean("hospital");
System.out.println(hospital.getName());
System.out.println(hospital.getDepartments());
}
}
