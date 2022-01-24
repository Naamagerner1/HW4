public class AnimalTypes {
    private int counter;
    private String type;
    private boolean isInList = false;

    /**
     * Initialize the type of the animal
     * Adds the type to the list if it is new type and counts the number of animals from this type
     * @param type The name of the type
     */
    public AnimalTypes(String type){
        this.type = type;
        for (AnimalTypes curr : Zoo.listOfTypes){
            if (curr.type.compareTo(this.type) == 0) {
                curr.counter++;
                isInList = true;
            }
        }
        if (!isInList){
            counter=1;
            Zoo.listOfTypes.add(this);
        }
    }

    /**
     * Gets the animal's type
     * @return The name of the type
     */
    public String getType(){
        return type;
    }

    /**
     * Gets the number of the animal type
     * @return The number of the animals from this type
     */
    public int getCounter(){
        return counter;
    }

}
