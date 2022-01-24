public class Zebra extends AnimalClass{
    /**
     * Initializes the happines and hunger levels of each new Zebra, by calling super
     */
    public Zebra(){
        super();
    }
    /**
     * Gets the name of the animal type
     * @return The name of the animal type
     */
    public String getName(){
        return "Zebra";
    }
    /**
     * Feeds the Zebra and updates the level of hunger
     */
    public void eat(){
        if (levelOfHunger > 1)
            levelOfHunger--;
        System.out.println("The zebra is eating grass...");

    }
    /**
     * The Zebra is doing its performance and updates its happines and hunger levels
     */
    public void performAction(){
        if (levelOfHappines < 5)
            levelOfHappines++;
        if (levelOfHunger < 5)
            levelOfHunger++;

        System.out.println("The zebra is running...");
    }

}
