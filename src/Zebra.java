public class Zebra extends AnimalClass{

    public Zebra(){
        super();
    }

    public String getName(){
        return "Zebra";
    }

    public void eat(){
        if (levelOfHunger > 1)
            levelOfHunger--;
        System.out.println("The zebra is eating grass...");

    }

    public void performAction(){
        if (levelOfHappines < 5)
            levelOfHappines++;
        if (levelOfHunger < 5)
            levelOfHunger++;

        System.out.println("The zebra is running...");
    }

}
