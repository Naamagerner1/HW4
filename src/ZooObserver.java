public class ZooObserver implements ObserverInterface {
    private String name;
    private String desc;

    /**
     * Initialize the zoo observer by its name
     * @param name Then name of the observer
     */
    public ZooObserver(String name){
        this.name = name;
    }

    /**
     * Sets the new description and prints it by the format
     * @param desc The description of the update
     */
    public void update(String desc){
        this.desc = desc;
        System.out.println("[" + name + "] " + desc);
    }
}
