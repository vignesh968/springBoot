package com.vignesh.Springcore.Property;

import java.util.Properties;

public class CountryandLanguage {
private Properties countryAndLangs;

public Properties getCountryAndLangs() {
	return countryAndLangs;
}

public void setCountryAndLangs(Properties countryAndLangs) {
	this.countryAndLangs = countryAndLangs;
}

@Override
public String toString() {
	return "CountryandLanguage [countryAndLangs=" + countryAndLangs + "]";
}

}
