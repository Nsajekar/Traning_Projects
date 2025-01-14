package com.euronet.main;

import java.util.Scanner;

import com.euronet.main.domain.Shapes;
import com.euronet.main.factory.ShapesFactory;

public class ShapesMain {
static int choice;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println( "Enter your choice :");
		System.out.println("1: Circle");
		System.out.println("2: Triangle");
		choice=scanner.nextInt();
		Shapes shapes = ShapesFactory.getShapes(choice);
		shapes.drawShape();
	
	}

}
