package com.vignesh.Springcore.map;

import java.util.Map;

public class Country {
private Map<String, String>contlangMap;

public Map<String, String> getContlangMap() {
	return contlangMap;
}

public void setContlangMap(Map<String, String> contlangMap) {
	this.contlangMap = contlangMap;
}

@Override
public String toString() {
	return "Country [contlangMap=" + contlangMap + "]";
}

}
