public class MonkeyFactory extends AnimalFactory{

    public MonkeyFactory(){
        super();
    }

    public String getName(){
        return "Monkey";
    }

    public MonkeyFactory createAnimal(){
        return new MonkeyFactory();
    }
}