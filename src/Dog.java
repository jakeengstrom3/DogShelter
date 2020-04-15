/**
 * A Dog class for use with the shelter class
 * Stores all necessary information for a dog
 * @author Jake Engstrom
 * @version 1.0
 */

public class Dog {
    private String name;
    private String size;
    private String gender;
    private String breed;
    private String temperament;
    private int age;
    private boolean spayedOrNeutered;

    /** Dog constructor
     * @param name A string variable to represent the Dog name
     * @param size A string variable to represent the Dog size, should be "Small", "Medium", or "Large"
     * @param gender A string variable to represent the Dog gender, should be "Male", or "Female"
     * @param breed A string variable to represesnt the Dog breed
     * @param temperament A string variable to represent the Dog temperment, must be "Calm" or "Energetic"
     * @param age A int variable to represent the Dog age
     * @param spayedOrNeutered A boolean variable to store wether the dog is spayed/neutered or not.
     */
    public Dog(String name, String size, String gender, String breed, String temperament, int age, boolean spayedOrNeutered){
        this.name = name;
        this.size = size;
        this.gender = gender;
        this.breed = breed;
        this.temperament = temperament;
        this.age = age;
        this.spayedOrNeutered = spayedOrNeutered;
    }

    /**
     * Prints the info of the dog in a standard format
     */
    public void printInfo(){
        System.out.print(
                "Name: " + name + "\n" +
                "Size: " + size + "\n" +
                "Gender: " + gender + "\n" +
                "Breed: " + breed + "\n" +
                "Temperament: " + temperament + "\n" +
                "Age: " + age + "\n" +
                "Spayed/Neutered: " + spayedOrNeutered + "\n" + "\n"
        );
    }

    /**
     * A getter for name
     * @return A String variable
     */
    public String getName(){
        return this.name;
    }

    /**
     * A setter for name
     * @param name A String variable to set the Dogs name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * A getter for size
     * @return A String variable
     */
    public String getSize(){
        return this.size;
    }

    /**
     * A setter for size
     * @param size A String variable
     */
    public void setSize(String size){
        this.size = size;
    }

    /**
     * A getter for gender
     * @return A String variable
     */
    public String getGender(){
        return this.gender;
    }

    /**
     * A setter for gender
     */
    public void setGender(String gender){
        this.gender = gender;
    }

    /**
     * A getter for breed
     * @return A String variable
     */
    public String getBreed(){
        return this.breed;
    }

    /**
     * A setter for breed
     */
    public void setBreed(String Breed){
        this.breed = breed;
    }

    /**
     * A getter for temperament
     * @return A String variable
     */
    public String getTemperament(){
        return this.temperament;
    }

    /**
     * A setter for temperament
     */
    public void setTemperament(String temperament){
        this.temperament = temperament;
    }

    /**
     * A getter for age
     * @return A String variable
     */
    public int getAge(){
        return this.age;
    }

    /**
     * A setter for age
     */
    public void setAge(int age){
        this.age = age;
    }

    /**
     * A getter for SpayedOrNeutered
     * @return A String variable
     */
    public boolean isSpayedOrNeutered(){
        return  this.spayedOrNeutered;
    }

    /**
     * A setter for SpayedOrNeutered
     */
    public void setSpayedOrNeutered(boolean spayedOrNeutered){
        this.spayedOrNeutered = spayedOrNeutered;
    }
}
