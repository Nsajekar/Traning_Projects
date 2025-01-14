package com.euronet.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.euronet.main.domain.EmployeeSortByEmployeeId;
import com.euronet.main.domain.EmployeeSortBySalary;
import com.euronet.main.domain.EmployeesortByName;
import com.euronet.main.domain.Empolyee;

public class EmployeeSortArrayList {

	public static void main(String[] args) {
//		List<Empolyee> employeeList = new ArrayList<>();
//       employeeList.add(new Empolyee(101, "Mayur", 20000));
//       employeeList.add(new Empolyee(102, "Pranali", 20000));
//       employeeList.add(new Empolyee(103, "Mandar", 20000));
//       employeeList.add(new Empolyee(104, "Pravin", 20000));
//       employeeList.add(new Empolyee(105, "Nitesh", 20000));
//       employeeList.add(new Empolyee(106, "Ibrahim", 20000));
//       employeeList.add(new Empolyee(107, "Kiran", 20000));
//       employeeList.add(new Empolyee(108, "Ritesh", 20000));
       
//       for (Empolyee empolyee : employeeList) {
//		System.out.println(empolyee);
//	}
       
       //Collections.sort(employeeList);
       Empolyee [] employee =new Empolyee[8];
       employee[0] =new Empolyee(101, "Mayur", 1000);
       employee[1] =new Empolyee(102, "Pranali", 2000);
       employee[2] =new Empolyee(103, "Mandar", 3000);
       employee[3] =new Empolyee(104, "Pravin", 4000);
       employee[4] =new Empolyee(105, "Nitesh", 5000);
       employee[5] =new Empolyee(106, "Ibrahim", 6000);
       employee[6] =new Empolyee(107, "Kiran", 20000);
       employee[7] =new Empolyee(108, "Ritesh", 1500);
       System.out.println("Employee id" +'\n');
      Arrays.sort(employee,new EmployeeSortByEmployeeId());
      for (Empolyee empolyee1 : employee) {
  		System.out.println(empolyee1);
  	}
      System.out.println("Employee name"+'\n');
      Arrays.sort(employee,new EmployeesortByName());
      for (Empolyee empolyee1 : employee) {
  		System.out.println(empolyee1);
  	}
      System.out.println("Employee salary"+'\n');
      Arrays.sort(employee,new EmployeeSortBySalary());
      for (Empolyee empolyee1 : employee) {
  		System.out.println(empolyee1);
  	}
	}

}
