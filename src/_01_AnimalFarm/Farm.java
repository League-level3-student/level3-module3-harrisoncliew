package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
public static void main(String[] args) {
	Animal Steve = new Pig("Steve");
	Animal Rob = new Cow("Rob");
	Animal Jane = new Sheep("Jane");
	Animal Bob = new Chicken("Bob");
	Animal Sarah = new Chicken("Sarah");
	Animal George = new Pig("George");
	ArrayList<Animal> farm = new ArrayList<Animal>();
	farm.add(Steve);
	farm.add(Rob);
	farm.add(Jane);
	farm.add(Bob);
	farm.add(Sarah);
	farm.add(George);
	
	for (int i = 0; i < farm.size(); i++) {
		farm.get(i).makeNoise();
		farm.get(i).printName();
	}
}
}
