package io.egemen.imp;
import io.egemen.interfaces.Movable;

public class Person implements Movable {

	@Override
	public void Move() {
		System.out.println("Person walks.");
	}
}