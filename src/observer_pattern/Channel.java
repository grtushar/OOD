package observer_pattern;

import java.util.ArrayList;

public class Channel implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    private String channelName, status;

    public Channel(String name) {
        this.channelName = name;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer: observers) {
            observer.update(channelName);
        }
    }
}
