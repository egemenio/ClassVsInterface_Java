package io.egemen.imp;
import io.egemen.interfaces.Movable;

public class Bird implements Movable {

	@Override
	public void Move() {
		System.out.println("Bird flies.");
	}
}