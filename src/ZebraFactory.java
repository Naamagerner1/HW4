public class ZebraFactory extends AnimalFactory{

    public ZebraFactory(){
        super();
    }

    public String getName(){
        return "Zebra";
    }
    public ZebraFactory createAnimal(){
        return new ZebraFactory();
    }
}