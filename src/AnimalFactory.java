public abstract class AnimalFactory implements Animal{
    private int levelOfHappines;
    private int levelOfHunger;

    public AnimalFactory(){
        levelOfHappines = 2;
        levelOfHunger = 3;
    }

    public abstract String getName();

    public void performAction(){
        if (levelOfHappines < 5)
            levelOfHappines++;
        if (levelOfHunger < 5)
            levelOfHunger++;
    }

    public void eat(){
        if (levelOfHunger > 0)
            levelOfHunger--;
    }

    createAnimal()
}
