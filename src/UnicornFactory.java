public class UnicornFactory extends AnimalFactory{

    public UnicornFactory(){
        super();
    }

    public String getName(){
        return "Unicorn";
    }

    public UnicornFactory createAnimal(){
        return new UnicornFactory();
    }
}
