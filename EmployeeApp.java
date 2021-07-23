package com.pi.product;
class Employee{
	String name;
	String ssn;
	String dept;
	int salary;
	Employee() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, String ssn, String dept, int salary) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", ssn=" + ssn + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
}
public class EmployeeApp {

	
	Employee getEmployeeInfo(String str) {
		

 /*  given string    -   "abc@4356-uuuii#98000"   ;
    name =abc,  ssn=4326,  dept=uuuii, sal=98
    Cretae Employee Object with above details and return MEployee Object*/
		
			String[] split=str.split("@|-|#");
			
			String name=split[0];
			String ssn=split[1];
			String dept=split[2];
			int sal=Integer.parseInt((split[3]));
			Employee employee=new Employee();
			employee.setName(name);
			employee.setSsn(ssn);
			employee.setDept(dept);
			employee.setSalary(sal);
			return employee;
				
	}
	String getEmployeeLevel(Employee e) {

/* 
    in a given employee if ssn is - 1 to 10 employee level is L1
if ssn is - 61 to 120 employee level is L2
if ssn is - 121 to 180 employee level is L3
else L4
rteurn the given level"

*/
		String level;
		if(Integer.parseInt(e.getSsn())>=1 &&Integer.parseInt( e.getSsn())<=60)
			level="L1";
		else if(Integer.parseInt(e.getSsn())>=61 &&Integer.parseInt( e.getSsn())<=120)
			level="L2";
		else if(Integer.parseInt(e.getSsn())>=121 &&Integer.parseInt( e.getSsn())<=180)
			level="L3";
		else
			level="L4";
		return level;
			
	}
	public static void main(String[] args) {
		EmployeeApp e=new EmployeeApp();
		System.out.println(e.getEmployeeInfo("abc@4356-uuuii#98"));
		System.out.println(e.getEmployeeLevel(new Employee("abc","4356","uuuii",9889)));
		
	}
}
 