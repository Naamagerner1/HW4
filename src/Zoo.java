import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Zoo implements Subject{
    ArrayList<AnimalClass> listOfAnimals;
    private static Zoo instance = null;
    private ArrayList<ZooObserver> observers;
    public static ArrayList<AnimalTypes> listOfTypes;
    private String desc;

    /**
     * Initialize the characteristics of Zoo
     */
    private Zoo(){
        listOfAnimals = new ArrayList<AnimalClass>();
        observers = new ArrayList<ZooObserver>();
        listOfTypes = new ArrayList<AnimalTypes>();
    }

    /**
     * Creates only one magical Zoo - according to Singelton design pattern
     * @return the one magical Zoo
     */
    public static Zoo getInstance(){
        if (instance == null) {
            instance = new Zoo();
            System.out.println("Creating zoo...");
        }
        else
            System.out.println("The zoo already exists...");

        return instance;
    }

    /**
     * Adds new animal to the Zoo, by its type and notify the observers
     * @param newAnimal The new animal to add
     */
    public void addAnimal(AnimalClass newAnimal){
        listOfAnimals.add(newAnimal);
        new AnimalTypes(newAnimal.getName());
        setDesc(newAnimal.getName() + " has been added to the zoo!");
    }

    /**
     * Sorts the animal types according lexicographic order
     */
    public static void SortTypes(){
        Collections.sort(listOfTypes,(Comparator.comparing((AnimalTypes type) -> type.getType())));
    }

    /**
     * Prints the animal's info according the format
     */
    public void showAnimalsInfo(){
        String finalString = "The zoo contains total of " + listOfAnimals.size()+ " animals:\n";

        Zoo.SortTypes();
        for (AnimalTypes curr: listOfTypes){
            finalString = finalString + "- " + curr.getType()+ ": " + curr.getCounter() + "\n";
        }

        int happiesLevel = listOfAnimals.get(0).levelOfHappines;
        int hungerLevel = listOfAnimals.get(0).levelOfHunger;
        finalString = finalString + "Happiness level: "+ happiesLevel + "\n";
        if (happiesLevel < 3)
            finalString = finalString + "The animals are not happy, you should watch them...\n";
        else
            finalString = finalString + "The animals are very happy, keep working hard...\n";
        finalString = finalString + "Hunger level: "+ hungerLevel;
        if (hungerLevel > 3)
            finalString = finalString + "\nThe animals are hungry, you should feed them...";

        System.out.println(finalString);

    }

    /**
     * Feeds the animals and notifies the observers
     */
    public void feedAnimals(){
        for (AnimalClass curr : listOfAnimals)
            curr.eat();
        setDesc("The animals are being fed");
    }

    /**
     * Makes performance and notifies the observers
     */
    public void watchAnimals(){
        for (AnimalClass curr : listOfAnimals)
            curr.performAction();
        setDesc("The animals are being watched");
    }

    /**
     * Sets and updates the description and notifies the observers
     * @param desc The new description
     */
    public void setDesc(String desc){
        this.desc=desc;
        notifyObservers();
    }

    /**
     * Notifies the observers by sending each one of the observers the new update
     */
    public void notifyObservers(){
        System.out.println("Notifying observers:");
        for (ZooObserver curr: observers)
            curr.update(desc);
    }

    /**
     * Adds new observer to the observers list
     * @param observer the new observer
     */
    public void addObserver(ZooObserver observer){
        observers.add(observer);
    }

    /**
     * Removes the observer from the observers list
     * @param observer The observer to remove
     */
    public void removeObserver(ZooObserver observer){
        observers.remove(observer);
    }

}
