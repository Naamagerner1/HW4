public abstract class AnimalClass implements Animal{
    protected int levelOfHappines;
    protected int levelOfHunger;

    public AnimalClass(){
        levelOfHappines = 2;
        levelOfHunger = 3;
    }

    public abstract String getName();

    public abstract void eat();

    public abstract void performAction();
}
