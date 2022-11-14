package com.example.demo.settergetter;

public class Employee {
	
	private String employeeName;
	private Integer age;
	private String employeeLastName;
	
	private Address address;

/*	public Employee(String employeeName, Integer age, String employeeLastName, Address address) {
		super();
		this.employeeName = employeeName;
		this.age = age;
		this.employeeLastName = employeeLastName;
		this.address = address;
	}*/

	

	public String getEmployeeName() {
		return employeeName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", age=" + age + ", employeeLastName=" + employeeLastName
				+ "]";
	}



}
