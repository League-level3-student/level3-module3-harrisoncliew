package _01_AnimalFarm;

public class Sheep extends Animal {

	Sheep(String name) {
		super(name);
	}
	
	void makeNoise() {
		System.out.println("MOO!");
	}
	
	void printName() {
		System.out.println(name);
	}
}
