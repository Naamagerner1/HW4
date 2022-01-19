public interface Subject {
    void addObserver(ZooObserver observer);
    void removeObserver(ZooObserver observer);
    void notifyObservers();
    //String subjectDetails();
    void setDesc(String desc);
}
