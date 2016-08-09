package MyZoo;

import java.util.ArrayList;

public class MyZoo {

	public static void main(String[] args) {

		ArrayList<Animal> theZoo = new ArrayList<>();
		Beaver Beaver = new Beaver("Beaver", "Male", "Gnawty", true, false);
		Alligator Alligator = new Alligator("Alligator", "Male", "King K. Rool", 30, false);
		Elephant Elephant = new Elephant("Elephant", "Female", "Ellie", 5, true);
		Monkey Monkey = new Monkey("Gorilla", "Male", "Donkey Kong", true, false);
		Ostrich Ostrich = new Ostrich("Ostrich", "Male", "Expresso", 30);
		Parrot Parrot = new Parrot("Parrot", "Male", "Squawks", true, false);
		Rhino Rhino = new Rhino("Rhino", "Male", "Rambi", true, false);
		Snake Snake = new Snake("Rattle Snake", "Male", "Rattly", true, true);
		Swordfish Swordfish = new Swordfish("Swordfish", "Male", "Enguarde", 30, true);
		Frog Frog = new Frog("Frog", "Male", "Winky", 15, false);

		theZoo.add(Alligator);
		theZoo.add(Beaver);
		theZoo.add(Elephant);
		theZoo.add(Monkey);
		theZoo.add(Ostrich);
		theZoo.add(Parrot);
		theZoo.add(Rhino);
		theZoo.add(Snake);
		theZoo.add(Swordfish);
		theZoo.add(Frog);

		for (int i = 0; i < theZoo.size(); i++) {

			System.out.println("Today at the zoo I saw a " + theZoo.get(i));

		}

	}
}
