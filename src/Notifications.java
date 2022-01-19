import java.util.ArrayList;

public class Notifications implements Subject{
    private ArrayList<ZooObserver> observers;
    private String desc;
    private String subjectDetails;

    public Notifications(ArrayList<ZooObserver> observers, String subjectDetails){
        this.observers = observers;
        this.subjectDetails = subjectDetails;
    }

    public void setDesc(String desc){
        this.desc=desc;
        notifyObservers();
    }

    public void notifyObservers(){
        System.out.println("Notifying observers:");
        for (ZooObserver curr: observers)
            curr.update(desc);
    }

    public void addObserver(ZooObserver observer){
        observers.add(observer);
    }

    public void removeObserver(ZooObserver observer){
        observers.remove(observer);
    }

    /*public String SubjectDetails(){
        return subjectDetails;
    }*/
}
