public interface Subject {
    /**
     * An interface which Zoo is implementing.
     */
    void addObserver(ZooObserver observer);
    void removeObserver(ZooObserver observer);
    void notifyObservers();
    void setDesc(String desc);
}
