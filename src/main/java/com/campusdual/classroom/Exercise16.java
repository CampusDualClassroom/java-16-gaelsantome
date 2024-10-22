package com.campusdual.classroom;

public class Exercise16 {

	public static void main(String[] args) {
		Plane plane = new Plane("Boeing");
		Tractor tractor = new Tractor(3500);

		plane.start();
		plane.takeOff();
		plane.fly();
		plane.land();
		plane.stop();
		plane.maintenance();

		tractor.start();
		tractor.forward();
		tractor.backward();
		tractor.stop();
		tractor.maintenance();

	}

}
