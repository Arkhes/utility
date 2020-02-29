package com.basic.j2ee;
import java.util.Scanner;
public class FactoryImpl {
	static LightFactory getFactoryObject(String type) {
		if (type.equalsIgnoreCase("LED")) {
			return new LEDImpl();
		} else if (type.equalsIgnoreCase("SOLAR")) {
			return new SolarImpl();
		} else {
			return new MercuryImpl();
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the type of light needed");
		System.out.println("1.LED\n2.Mercury\n3.Solar");
		String type = scan.next();
		LightFactory light = getFactoryObject(type);
		light.lightOn();
		light.lightOff();
		scan.close();
	}
}
