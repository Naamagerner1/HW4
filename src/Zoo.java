import java.util.ArrayList;
import java.util.Locale;

public class Zoo implements Subject{
    ArrayList<AnimalClass> listOfAnimals;
    private static Zoo instance = null;
    private ArrayList<ZooObserver> observers;
    private String desc;

    private Zoo(){
        listOfAnimals = new ArrayList<AnimalClass>();
        observers = new ArrayList<ZooObserver>();
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

    public void addAnimal(AnimalClass newAnimal){
        listOfAnimals.add(newAnimal);
        setDesc(newAnimal.getName() + " has been added to the zoo!");
    }
    public String FromEnumToNameOfAnimal (AnimalTypes type){
        String end = type.name().substring(1);
        end = end.toLowerCase();
        String name = type.name().substring(0,1) + end;
        return name;
    }

    public void showAnimalsInfo(){
        int counterMonkey = 0;
        int counterUnicorn = 0;
        int counterZebra = 0;
        String finalString = "The zoo contains total of " + listOfAnimals.size()+ " animals:\n";

        for (AnimalTypes curr: AnimalTypes.values()){
            //String tremp = (AnimalFactory) FromEnumToNameOfAnimal(curr)+ "Factory";
            //AnimalClass name1= (curr.name())curr;
            finalString = finalString + "- " + FromEnumToNameOfAnimal(curr)+ ": " + tremp.getNumberOfInstances() + "\n"; ///////////////
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

    public void feedAnimals(){
        for (AnimalClass curr : listOfAnimals)
            curr.eat();
        setDesc("The animals are being fed");
    }

    public void watchAnimals(){
        for (AnimalClass curr : listOfAnimals)
            curr.performAction();
        setDesc("The animals are being watched");
    }

    public void setDesc(String desc){
        this.desc=desc;
        notifyObservers();
    }

    public void notifyObservers(){
        System.out.println("Notifying observers:");
        for (ZooObserver curr: observers)
            curr.update(desc);
    }

    public void addObserver(ZooObserver observer){
        observers.add(observer);
    }

    public void removeObserver(ZooObserver observer){
        observers.remove(observer);
    }

}
