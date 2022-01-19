public abstract class AnimalFactory {
    /*protected int levelOfHappines;
    protected int levelOfHunger;

    public AnimalFactory(){
        levelOfHappines = 2;
        levelOfHunger = 3;
    }

    //public abstract String getName();

    public void performAction(){
        if (levelOfHappines < 5)
            levelOfHappines++;
        if (levelOfHunger < 5)
            levelOfHunger++;
    }

    public abstract void eat();*/

    public abstract AnimalClass createAnimal();
}
