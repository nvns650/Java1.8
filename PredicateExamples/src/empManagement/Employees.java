package empManagement;

public class Employees {
	private String name;
	private String designation;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private String city;
	public Employees(String name, String designation, double salary, String city) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}
	@Override
	public String toString() {
		/*return "Employees [name=" + name + ", designation=" + designation + ", salary=" + salary + ", city=" + city
				+ "]";*/
		String s=String.format("%s,%s,%.2f,%s", name,designation,salary,city);
		return s;
	
	} 

}
