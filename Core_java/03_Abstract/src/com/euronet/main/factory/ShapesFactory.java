package com.euronet.main.factory;

import com.euronet.main.domain.Circle;
import com.euronet.main.domain.Shapes;
import com.euronet.main.domain.Triangle;

public class ShapesFactory {
	public static Shapes getShapes(int choice) {
		switch (choice) {
		case 1:
			return new Circle();
		case 2:
			return new Triangle();
		}
		return null;

	}
}
