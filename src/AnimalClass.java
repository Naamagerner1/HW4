public abstract class AnimalClass implements Animal{
    protected int levelOfHappines;
    protected int levelOfHunger;

    /**
     * Initializes the happines and hunger levels of each new animal
     */
    public AnimalClass(){
        levelOfHappines = 2;
        levelOfHunger = 3;
    }

    /**
     * Abstract method, each animal will return its name
     * @return The name of the animal
     */
    public abstract String getName();

    /**
     * Abstract method, each animal will eat its food
     */
    public abstract void eat();

    /**
     * Abstract method, each animal will perform
     */
    public abstract void performAction();
}
