package BackendLLD2.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

//    puldefau;t void checkForUpdates(){

}
