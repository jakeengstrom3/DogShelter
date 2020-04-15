/** Dog Shelter program.
 * @author Jacob Engstrom
 * @version 1.0
 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter();

        shelter.addDog(new Dog("Bolt", "Medium", "Male", "Collie", "Calm", 4, true));
        shelter.addDog(new Dog("Luna", "Medium", "Female", "Collie", "Energetic", 1, true));
        shelter.addDog(new Dog("Bosco", "Large", "Male", "Shepard", "Energetic", 3, false));
        shelter.addDog(new Dog("Rupert", "Small", "Male", "Shitzu", "Energetic", 9, true));
        shelter.addDog(new Dog("Harold", "Large", "Female", "Pyrenees", "Calm", 2, true));
        shelter.addDog(new Dog("Loki", "Medium", "Male", "Collie", "Energetic", 3, true));
        shelter.addDog(new Dog("Cricket", "Large", "Female", "Labrador", "Energetic", 9, true));
        shelter.addDog(new Dog("Ruff", "Large", "Female", "Labrador", "Energetic", 1, false));
        shelter.addDog(new Dog("Marley", "Medium", "Male", "Golden", "Calm", 14, true));
        shelter.addDog(new Dog("Luna", "Small", "Female", "Pomeranian", "Energetic", 6, true));
        shelter.addDog(new Dog("Ralph", "Medium", "Female", "Collie", "Energetic", 6, true));
        shelter.addDog(new Dog("Bob", "Medium", "Female", "Collie", "Energetic", 6, true));

        System.out.println("There are currently " + shelter.numOfDogs() + " dogs in the shelter");
        shelter.printDogs();
        shelter.printDogsOfSize("Small");
        shelter.printDogsOfBreed("Labrador");
        shelter.printDogsOfAge(7,10);
        shelter.getDogFromName("Bosco").printInfo();
        shelter.printSpayedOrNeutered();
        shelter.spayOrNeuterDog("Bosco");
        shelter.adoptDog("Bosco");
        shelter.adoptDog("Bosco");
    }
}