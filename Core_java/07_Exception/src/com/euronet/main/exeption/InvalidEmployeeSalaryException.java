package com.euronet.main.exeption;

public class InvalidEmployeeSalaryException extends Exception {
	private String message;

	public InvalidEmployeeSalaryException() {
	}

	public InvalidEmployeeSalaryException(String message) {
		this.message = message;
	}
	@Override
	public String getMessage() {
		return message;
	}

}
