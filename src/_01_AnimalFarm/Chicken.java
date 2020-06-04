package _01_AnimalFarm;

public class Chicken extends Animal {
	Chicken(String name) {
		super(name);
	}
	
	void makeNoise() {
		System.out.println("BAWK!");
	}
	
	void printName() {
		System.out.println(name);
	}
}
