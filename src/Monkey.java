public class Monkey extends AnimalClass{
    /**
     * Initializes the happines and hunger levels of each new Monkey, by calling super
     */
    public Monkey(){
        super();
    }

    /**
     * Gets the name of the animal type
     * @return The name of the animal type
     */
    public String getName(){
        return "Monkey";
    }

    /**
     * Feeds the Monkey and updates the level of hunger
     */
    public void eat(){
        if (levelOfHunger > 1)
            levelOfHunger--;
        System.out.println("The monkey is eating a banana...");

    }

    /**
     * The Monkey is doing its performance and updates its happines and hunger levels
     */
    public void performAction(){
        if (levelOfHappines < 5)
            levelOfHappines++;
        if (levelOfHunger < 5)
            levelOfHunger++;
        System.out.println("The monkey is hanging on trees...");
    }

}
