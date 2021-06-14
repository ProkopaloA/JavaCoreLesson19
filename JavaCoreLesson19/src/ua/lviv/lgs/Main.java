package ua.lviv.lgs;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main { 
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	

	File file = new File("Test.txt");
	List <Employee> employeeList = new ArrayList<Employee>();
	employeeList.add(new Employee("Artur", 8023564, 15000));
	employeeList.add(new Employee("Anna", 8023743, 14000));
	employeeList.add(new Employee("Iryna", 8023896, 10000));
	employeeList.add(new Employee("Oleg", 8024757, 8500));
	employeeList.add(new Employee("Yevgen", 8023023, 45000));
	employeeList.add(new Employee("Maxim", 8023565, 70000));
	
	System.out.println("employeeList: ");
	for (Employee employee : employeeList) {
		System.out.println(employee);
	}
	
	Methods.serialize((Serializable)employeeList, file);	
	System.out.println(Methods.deserealize(file));

}}
