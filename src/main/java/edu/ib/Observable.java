package edu.ib;

public interface Observable {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void updateObservers();
}
