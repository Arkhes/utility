package com.basic.j2ee;

public class SolarImpl implements LightFactory {

	public void lightOn() {
		System.out.println("solar light is On");
	}

	public void lightOff() {
		System.out.println("solar light is off");
	}

}
 class MercuryImpl implements LightFactory {

	public void lightOn() {
		System.out.println("mercury light is On");
	}

	public void lightOff() {
		System.out.println("mercury light is off");
	}

}
 class LEDImpl implements LightFactory {

	public void lightOn() {
		System.out.println("led light is On");
	}

	public void lightOff() {
		System.out.println("led light is off");
	}

}