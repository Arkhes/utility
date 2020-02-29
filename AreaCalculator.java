package com.app.mod.feature;

public class AreaCalculator {
	static final double PI = 3.14;

	static void display() {
		System.out.println("this method return type is void");
		return;// optional
	}

	static double areaOfCircle(float radius) {

		double area = PI * Math.pow(radius, 2);
		return area;

	}

	public static void main(String[] args) {
		System.out.println("main starts");
		double areaValue = areaOfCircle(12.34f);
		System.out.println("the area of circle is " + areaValue);
		double perimeter = PerimeterCalculation.perimeterOfCircle(34.5);
		System.out.println("the perimeter of the circle is "+perimeter);
		System.out.println("Main ends");
	}

}
