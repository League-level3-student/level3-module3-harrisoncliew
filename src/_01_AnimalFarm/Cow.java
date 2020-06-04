package _01_AnimalFarm;

public class Cow extends Animal {
	Cow(String name) {
		super(name);
	}
	
	void makeNoise() {
		System.out.println("MOO!");
	}
	
	void printName() {
		System.out.println(name);
	}
}
