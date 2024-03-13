package com.vignesh.Springcore.lc.xmlconfig;

public class Patient {
private  int id;

public int getId() {
	return id;
}

public void setId(int id) {
	System.out.println("inside the setter methods");
	this.id = id;
}

public void hi() {
	System.out.println("inside hi method");
}
public void bye() {
	System.out.println("Inside bye method");
}

@Override
public String toString() {
	return "Patient [id=" + id + "]";
}

}
