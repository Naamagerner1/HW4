public class MonkeyFactory extends AnimalFactory{

    public MonkeyFactory(){
        super();
    }

    public String getName(){
        return "Monkey";
    }

    public Monkey createAnimal(){
        return new Monkey();
    }
}