package predicateEx;

public class SEng {
private String name;
private int age;
private boolean married=false;

public boolean isMarried() {
	return married;
}
public void setMarried(boolean married) {
	this.married = married;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public SEng(String name, int age, boolean married) {
	super();
	this.name = name;
	this.age = age;
	this.married = married;
}

}
