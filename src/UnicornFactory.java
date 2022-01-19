public class UnicornFactory extends AnimalFactory{

    public UnicornFactory(){
        super();
    }

    //public String getName(){
    //    return "Unicorn";
    //}

    public Unicorn createAnimal(){
        numberOfInstances++;
        return (Unicorn) new Unicorn();
    }


}
