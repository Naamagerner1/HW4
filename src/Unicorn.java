public class Unicorn extends AnimalClass{
    /**
     * Initializes the happines and hunger levels of each new Unicorn, by calling super
     */
    public Unicorn(){
        super();
    }
    /**
     * Gets the name of the animal type
     * @return The name of the animal type
     */
    public String getName(){
        return "Unicorn";
    }

    /**
     * Feeds the Unicorn and updates the level of hunger
     */
    public void eat(){
        if (levelOfHunger > 1)
            levelOfHunger--;
        System.out.println("The unicorn is eating rainbow cakes...");
    }

    /**
     * The Unicorn is doing its performance and updates its happines and hunger levels
     */
    public void performAction(){
        if (levelOfHappines < 5)
            levelOfHappines++;
        if (levelOfHunger < 5)
            levelOfHunger++;
        System.out.println("The unicorn is flying...");
    }


}
