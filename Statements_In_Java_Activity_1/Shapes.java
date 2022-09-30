package com.cognizant.shapes;

public class Shapes {
	int numberOfSides;
	void calculateShapeArea(int numberOfsides,int side_length) {
	this.numberOfSides=numberOfsides;
		if(numberOfsides==1) {
			Circle cir=new Circle();
			cir.calculateArea(side_length);
		}
		else if(numberOfsides==3) {
			Triangle tri =new Triangle();
			tri.calculateArea(side_length);
		}
		else if(numberOfsides==4) {
			Square sq =new Square();
			sq.calculateArea(side_length);
		}
		else {
		
			System.out.println("No Shapes Present.");
		}
			
	}
	public static void main(String[] args) {
		new Shapes().calculateShapeArea (5,15);
		new Shapes().calculateShapeArea (3,12);
		new Shapes().calculateShapeArea (4,15);
		
	}
}
