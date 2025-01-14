package com.euronet.main.factory;

import com.euronet.main.domain.Circle;
import com.euronet.main.domain.Shapes;
import com.euronet.main.domain.Triangel;

public class ShapesFactory {
public static Shapes getShape(int choice){
	if(choice == 1){
		return new Circle();
	}
	if(choice == 2){
		return new Triangel();
	}
	return null;
}
}
