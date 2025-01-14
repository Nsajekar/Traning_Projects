package com.euronet.main.test;

import org.junit.Test;

import static org.junit.Assert.*;

import com.euronet.main.domain.EmployeeDetails;
import com.euronet.main.util.EmployeeUtil;

public class EmployeeDetailsTest {

	EmployeeDetails employeeDetails;
	EmployeeUtil employeeUtil = new EmployeeUtil();

	@Test
	public void testAppraisal() {
		// employeeDetails =new EmployeeDetails("Nitesh", 12000, 23);
		// double appraisal = employeeUtil.calculateAppraisal(employeeDetails);
		// assertEquals(1000, appraisal,0.0);
		assertEquals(1000, employeeUtil.calculateAppraisal(new EmployeeDetails(
				"Nitesh", 12000, 23)), 0.0);
	}

	@Test
	public void testAnnualSalary() {
		employeeDetails = new EmployeeDetails("Test", 12000, 23);
		assertEquals(employeeDetails.getMonthelySalary() * 12,
				employeeUtil.calculateYearlySalary(employeeDetails), 0.0);
	}

	@Test
	public void testAssertion() {
		boolean result;

		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";

		int val1 = 5;
		int val2 = 6;

		String[] expectedArray = { "one", "two", "three" };
		String[] resultArray = { "one", "two", "three" };

		System.out.println("Assert Equals");
		// Check two object are equals
		assertEquals(str1, str2);
		// Check for condition
		assertTrue(val1 < val2);
		// Check for condition
		assertTrue(val1 > val2);
		// Check object is not null
		assertNotNull(str1);
		// Check object is not null
		assertNotNull(str3);
		// Check if two object reference to same object
		assertSame(str4, str5);
		// Check if two object reference to not same object
		assertNotSame(str4, str5);
		// check whether two arrays are equal or not
		assertArrayEquals(expectedArray, resultArray);

	}

}
