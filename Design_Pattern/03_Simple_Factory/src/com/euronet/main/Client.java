package com.euronet.main;

import java.util.Scanner;

import com.euronet.main.domain.Shapes;
import com.euronet.main.factory.ShapesFactory;

public class Client {
public static void main(String[] args) {
	Scanner scanner = new  Scanner(System.in);
	int choice=0;
	String choose= "";
	do{
	System.out.println("Enter Your Size");
      choice = scanner.nextInt();
	Shapes shape =  ShapesFactory.getShape(choice);
	shape.drawShapes();
	System.out.println("Do you want to continue yes/no");
	scanner.nextLine();
	 choose = scanner.nextLine();
	}while(choose.equals("yes"));
	scanner.close();
}
}
