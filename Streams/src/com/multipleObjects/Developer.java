package com.multipleObjects;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Developer {
private String name;
private Set<String> languages;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Set<String> getLanguages() {
	return languages;
}
public void setLanguages(Set<String> tech1) {
	this.languages = tech1;
}
public Developer(String name) {
	super();
	this.name = name;
	this.languages = new HashSet<>();
}
public Developer() {
	super();
}
}
