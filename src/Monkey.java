public class Monkey extends AnimalClass{
    public Monkey(){
        super();
    }

    public String getName(){
        return "Monkey";
    }

    public void eat(){
        if (levelOfHunger > 1)
            levelOfHunger--;
        System.out.println("The monkey is eating a banana...");

    }

    public void performAction(){
        if (levelOfHappines < 5)
            levelOfHappines++;
        if (levelOfHunger < 5)
            levelOfHunger++;
        System.out.println("The monkey is hanging on trees...");
    }


}
