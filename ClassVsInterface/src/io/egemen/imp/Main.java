package io.egemen.imp;
import io.egemen.interfaces.Movable;

public class Main {

	public static void main(String[] args) {

		Movable person = new Person();
		Movable bird = new Bird();
		Movable fish = new Fish();

        //We can add different class instances which implement 
        //same interface to one array 
		Movable[] movables = new Movable[3];
		movables[0] = person;
		movables[1] = bird;
		movables[2] = fish;

		for (Movable movable : movables) {
			movable.Move();
		}
	}
}