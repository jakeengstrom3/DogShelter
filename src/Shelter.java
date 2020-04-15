
/**
 * A shelter class to handle 10 dogs
 * @author Jake Engstrom
 * @version 1.0
 */

import java.util.*;
public class Shelter {
    final int SHELTER_SIZE = 10;
    private ArrayList<Dog> dogs;

    /**
     * Shelter constructor
     */
    public Shelter(){
        dogs = new ArrayList<Dog>();
    }

    /**
     * Adds a dog to the shelter arrayList dogs
     * @param dog The dog object to add to the shelter
     */
    public void addDog(Dog dog){
        if(this.numOfDogs() < SHELTER_SIZE){
            String dogName = dog.getName();
            if (noDogsOfName(dogName)) {
                dogs.add(dog);
            }
            else{
                System.out.println("There is already a dog named " + dogName + ". Please choose another name.");
            }
        }
        else{
            System.out.println("Cannot add " + dog.getName() + " to the shelter because it is full!");
        }
    }

    /**
     * Only removes a dog if there exists a dog of that name
     * @param name name of the dog to adopt
     */
    public void adoptDog(String name){
        boolean dogAdopted = false;
        for(int i = dogs.size() - 1; i >= 0; --i){
            Dog d = dogs.get(i);
            if(d.getName().equals(name)){
                dogs.remove(i);
                dogAdopted = true;
            }
        }
        if(!dogAdopted){
            System.out.println("No dog by the name of " + name + " here to adopt");
        }
    }

    /**
     * Returns true if there are no dogs of a certain name in the shelter
     * @param name String. name of dog to check if it exists
     * @return true Boolean.  true if no dogs exists with the name
     */
    public boolean noDogsOfName(String name){
        boolean noDogsOfName = true;
        for(Dog d : dogs){
            if(d.getName().equals(name)){
                noDogsOfName = false;
                break;
            }
        }
        return noDogsOfName;
    }

    /**
     * Prints the info of all the dogs in the shelter
     */
    public void printDogs(){
        System.out.println("Here are the dogs in the shelter:");
        for(Dog d : dogs){
            d.printInfo();
        }
    }

    /**
     * @return int.  Number of dogs in the shelter
     */
    public int numOfDogs(){
        return dogs.size();
    }

    /**
     * Returns an arraylist of Dogs such that all members are dogs in the shelter that have the size specified in the parameter.
     * @param size String variable.  Desired size to look for
     * @return ArrayList<Dog> Variable.  Contains all the dogs that have the size specified in the parameter.
     */
    public ArrayList<Dog> dogsOfSize(String size){
        ArrayList<Dog> dogsOfSize = new ArrayList<Dog>();

        for(Dog d : dogs){
            if(d.getSize().equals(size)){
                dogsOfSize.add(d);
            }
        }

        return dogsOfSize;
    }

    /**
     * Prints info of all dogs with the size specified by the parameter
     * @param size A String variable, the desired size to look for
     */
    public void printDogsOfSize(String size){
        System.out.println("Here are the " + size + " dogs in the shelter:");
        ArrayList<Dog> smallDogs = dogsOfSize(size);
        for(Dog d : smallDogs){d.printInfo();}
    }

    /**
     * Returns an arraylist of Dogs such that all members are dogs in the shelter that are the breed specified in the parameter.
     * @param breed String variable.  Desired size to look for
     * @return ArrayList<Dog> Variable.  Contains all the dogs that are the breed specified in the parameter.
     */
    public ArrayList<Dog> dogsOfBreed(String breed){
        ArrayList<Dog> dogsOfBreed = new ArrayList<Dog>();

        for(Dog d : dogs){
            if(d.getBreed().equals(breed)){
                dogsOfBreed.add(d);
            }
        }

        return dogsOfBreed;
    }

    /**
     * Prints info of all dogs with the breed specified by the parameter
     * @param breed A String variable, the desired breed to look for
     */
    public void printDogsOfBreed(String breed){
        System.out.println("Here are the " + breed + " dogs in the shelter:");
        ArrayList<Dog> specificDogs = dogsOfBreed(breed);
        for(Dog d : specificDogs){d.printInfo();}
    }

    /**
     * Returns an arraylist of Dogs such that all members are dogs in the shelter that are the gender specified in the parameter.
     * @param gender String variable.  Desired size to look for
     * @return ArrayList<Dog> Variable.  Contains all the dogs that are the gender specified in the parameter.
     */
    public ArrayList<Dog> dogsOfGender(String gender){
        ArrayList<Dog> dogsOfGender = new ArrayList<Dog>();

        for(Dog d : dogs){
            if(d.getGender().equals(gender)){
                dogsOfGender.add(d);
            }
        }

        return dogsOfGender;
    }

    /**
     * Prints info of all dogs with the gender specified by the parameter
     * @param gender A String variable, the desired gender to look for
     */
    public void printDogsOfGender(String gender){
        System.out.println("Here are the " + gender + " dogs in the shelter:");
        ArrayList<Dog> specificDogs = dogsOfGender(gender);
        for(Dog d : specificDogs){d.printInfo();}
    }

    /**
     * Returns an arraylist of Dogs such that all members are dogs in the shelter that have an age between the two variables specified in the parameter.
     * @param ageLower int variable.  Lower bound for age range
     * @param ageUpper int variable. Upper bound for age range
     * @return ArrayList<Dog> Variable.  Contains all the dogs that have an age between the two variables specified in the parameter.
     */
    public ArrayList<Dog> dogsOfAge(int ageLower, int ageUpper){
        ArrayList<Dog> dogsOfAge = new ArrayList<Dog>();

        for(Dog d : dogs){
            if(d.getAge() >= ageLower && d.getAge() <= ageUpper){
                dogsOfAge.add(d);
            }
        }

        return dogsOfAge;
    }

    /**
     * Prints info of all dogs with an age between the variables specified by the parameter
     * @param ageLower A int variable, the lower bound of the age range
     * @param ageUpper A int variable, the upper bound of the age range
     */
    public void printDogsOfAge(int ageLower, int ageUpper){
        System.out.println("Here are the " + ageLower + "to " + ageUpper + " year old dogs in the shelter:");
        ArrayList<Dog> specificDogs = dogsOfAge(ageLower, ageUpper);
        for(Dog d : specificDogs){d.printInfo();}
    }

    /**
     * Returns an arraylist of Dogs such that all members are dogs in the shelter that are spayed or neutered
     * @return ArrayList<Dog> Variable.  Contains all the dogs that are spayed or neutered
     */
    public ArrayList<Dog> dogsSpayedOrNeutered(){
        ArrayList<Dog> dogsSpayedOrNeutered = new ArrayList<Dog>();

        for(Dog d : dogs){
            if(d.isSpayedOrNeutered()){
                dogsSpayedOrNeutered.add(d);
            }
        }

        return dogsSpayedOrNeutered;
    }

    /**
     * Prints info of all dogs spayed or neutered
     */
    public void printSpayedOrNeutered(){
        System.out.println("Spayed or Neutered Dogs:");
        ArrayList<Dog> dogsSpayedOrNeutered = dogsSpayedOrNeutered();
        for(Dog d : dogsSpayedOrNeutered){
            d.printInfo();
        }
    }

    /**
     * Returns a dog object that has the name specified by the parameter
     * Because the addDog method doesn't allow duplicate names, the correct dog will always be chosen
     * @param name The name of the dog to be returned
     * @return A Dog object with the name specified by the parameter
     */
    public Dog getDogFromName(String name){
        for(Dog d : dogs){
            if(d.getName().equals(name)){
                return d;
            }
        }
        return null;
    }

    /**
     * @return An int variable, the number of spayed/neutered dogs
     */
    public int numSpayedOrNeutered(){
        return dogsSpayedOrNeutered().size();
    }

    /**
     * Gets a dog from the name and sets its spayedOrNeutered variable to true
     * @param name A String variable, the name of the dog to spay/neuter
     */
    public void spayOrNeuterDog(String name){
        Dog d = getDogFromName(name);
        if(d.isSpayedOrNeutered()){
            System.out.println(d.getName() + " is already spayed or neutered");
        }else {
            d.setSpayedOrNeutered(true);
        }
    }
}
