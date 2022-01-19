public class ZebraFactory extends AnimalFactory{

    public ZebraFactory(){
        super();
    }

    public String getName(){
        return "Zebra";
    }
    public Zebra createAnimal(){
        numberOfInstances++;
        return new Zebra();
    }

}