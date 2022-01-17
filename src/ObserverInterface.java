public interface ObserverInterface {
    void update(String update);
    void addObserver(ZooObserver newObserver);
    void removeObserver(ZooObserver removeObserver);
}
