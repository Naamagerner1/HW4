import java.util.ArrayList;

public class Zoo {
    ArrayList<AnimalFactory> listOfAnimals;
    private static Zoo instance = null;

    private Zoo(){
        listOfAnimals = new ArrayList<AnimalFactory>();
    }

    public static Zoo getInstance(){
        if (instance == null) {
            instance = new Zoo();
            System.out.println("Creating zoo...");
        }
        else
            System.out.println("The zoo already exists...");

        return instance;
    }

    addObserver()

    public void addAnimal(AnimalFactory newAnimal){
        listOfAnimals.add(newAnimal);
    }

    public String showAnimalsInfo(){ /////////////////
        String finalString = "The zoo contains total of " + listOfAnimals.size()+ " animals:";
        for (AnimalFactory currAnimal : listOfAnimals){
            //currAnimal.getName();
        }
    }

    public void feedAnimals(){
        for (AnimalFactory curr : listOfAnimals)
            curr.eat();
    }

    public void watchAnimals(){
        for (AnimalFactory curr : listOfAnimals)
            curr.performAction();
    }

    removeObserver()
}
