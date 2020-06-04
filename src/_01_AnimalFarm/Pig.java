package _01_AnimalFarm;

public class Pig extends Animal {

	Pig(String name) {
		super(name);
	}
	
	void makeNoise() {
		System.out.println("MOO!");
	}
	
	void printName() {
		System.out.println(name);
	}
}
