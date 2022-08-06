package _2Design_pattern_in_java.Behavioral_dp.Observer.Best_Approach;



import _2Design_pattern_in_java.Behavioral_dp.Observer.Best_Approach.Observable.AndroidObservable;
import _2Design_pattern_in_java.Behavioral_dp.Observer.Best_Approach.Observable.IphoneObservable;
import _2Design_pattern_in_java.Behavioral_dp.Observer.Best_Approach.Observer.EmailAlertObserver;
import _2Design_pattern_in_java.Behavioral_dp.Observer.Best_Approach.Observer.MobileAlertObserver;
import _2Design_pattern_in_java.Behavioral_dp.Observer.Best_Approach.interfaces.NotificationObserver;
import _2Design_pattern_in_java.Behavioral_dp.Observer.Best_Approach.interfaces.StockObservable;

public class Client {
    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservable();
        StockObservable androidObservable = new AndroidObservable();

        NotificationObserver observer1 = new EmailAlertObserver("abc.gmail.com",iphoneObservable);
        NotificationObserver observer2 = new EmailAlertObserver("abc.gmail.com", iphoneObservable);
        NotificationObserver observer3 = new  MobileAlertObserver(930, androidObservable);
        NotificationObserver observer4 = new MobileAlertObserver(123, androidObservable);


        iphoneObservable.Add(observer1);
        iphoneObservable.Add(observer2);

        iphoneObservable.setStock(0);
        
        androidObservable.Add(observer3);
        androidObservable.Add(observer4);
    }
}
