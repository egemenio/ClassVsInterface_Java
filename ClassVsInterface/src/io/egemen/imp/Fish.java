package io.egemen.imp;
import io.egemen.interfaces.Movable;

public class Fish implements Movable {

	@Override
	public void Move() {
		System.out.println("Fish swims.");
	}
}