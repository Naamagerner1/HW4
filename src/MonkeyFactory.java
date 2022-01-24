public class MonkeyFactory extends AnimalFactory{
    /**
     * Creates new Monkey
     * @return The new Monkey
     */
    public Monkey createAnimal(){
        return new Monkey();
    }
}