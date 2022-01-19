public class UnicornFactory extends AnimalFactory{

    public UnicornFactory(){
        super();
    }

    //public String getName(){
    //    return "Unicorn";
    //}

    public Unicorn createAnimal(){
        return (Unicorn) new Unicorn();
    }
    /*public void eat(){
        if (levelOfHunger > 0)
            levelOfHunger--;

    }*/


}
