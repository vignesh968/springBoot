package com.vignesh.Springcore.set;

import java.util.Set;

public class Student {
private Set<Integer> id;

public Set<Integer> getId() {
	return id;
}

public void setId(Set<Integer> id) {
	this.id = id;
}

@Override
public String toString() {
	return "Student [id=" + id + "]";
}


}
