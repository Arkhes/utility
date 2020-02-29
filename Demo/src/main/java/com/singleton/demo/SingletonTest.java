package com.singleton.demo;


public class SingletonTest {

	public static void main(String[] args) {
Singleton ref = Singleton.getObject();
ref.iValue=200;
System.out.println(ref.iValue);
Singleton obj = Singleton.getObject();
System.out.println(obj.iValue);
System.out.println(ref);
System.out.println(obj);
	}

}
