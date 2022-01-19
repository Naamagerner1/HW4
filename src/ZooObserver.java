public class ZooObserver implements ObserverInterface {
    private String name;
    private String desc;
    //private Zoo subject;

    public ZooObserver(String name){
        this.name = name;
    }
    public void update(String desc){
        this.desc = desc;
        System.out.println("[" + name + "] " + desc);
    }
}
