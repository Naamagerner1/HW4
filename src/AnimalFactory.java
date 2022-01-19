public abstract class AnimalFactory {
    protected static int numberOfInstances = 0;

    public abstract AnimalClass createAnimal();

    public static int getNumberOfInstances(){
        return numberOfInstances;
    }

}
