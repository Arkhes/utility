package com.singleton.demo;

public class Singleton {
	int iValue;

	private Singleton() {

	}

	static Singleton object;

	public static Singleton getObject() {
		if (object == null) {
			object = new Singleton();
		}
		System.out.println(object);
		return object;
	}
}
