public class Unicorn extends AnimalClass{

    public Unicorn(){
        super();
    }

    public String getName(){
        return "Unicorn";
    }

    public void eat(){
        if (levelOfHunger > 1)
            levelOfHunger--;
        System.out.println("The unicorn is eating rainbow cakes...");

    }

    public void performAction(){
        if (levelOfHappines < 5)
            levelOfHappines++;
        if (levelOfHunger < 5)
            levelOfHunger++;
        System.out.println("The unicorn is flying...");
    }


}
