package _2Design_pattern_in_java.Behavioral_dp.Observer.Good_Approach.interfaces;

public interface StockObservable {
    public void Add(NotificationObserver observer);
    public void Remove(NotificationObserver observer);
    public void notifySubscriber();
    public void setiphoneStock(int x);
}
