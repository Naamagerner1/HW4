public class ZooObserver implements ObserverInterface {
    private String name;
    private String desc;

    public ZooObserver(String name){
        this.name = name;
    }
    void update(String update){
        desc = update;
        System.out.println("[" + name + "] " + desc);
    }
    void addObserver(ZooObserver newObserver){

    }
    void removeObserver(ZooObserver removeObserver){

    }
}
