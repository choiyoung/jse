package oop01.encapsule;

public class PayVO {
private	 String name;
private int salary, incom;
static final double TAX = 0.1;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

public double getIncom() {
	return incom;
}
public void setIncom(int incom) {
	this.incom = incom ;
}	
}
