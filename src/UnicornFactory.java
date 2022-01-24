public class UnicornFactory extends AnimalFactory{
    /**
     * Creates new Unicorn
     * @return The new Unicorn
     */
    public Unicorn createAnimal(){
        return new Unicorn();
    }


}
