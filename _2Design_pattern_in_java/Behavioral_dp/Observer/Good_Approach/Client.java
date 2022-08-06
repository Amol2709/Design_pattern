package _2Design_pattern_in_java.Behavioral_dp.Observer.Good_Approach;

import javax.management.Notification;

import _2Design_pattern_in_java.Behavioral_dp.Observer.Good_Approach.Observable.AndroidObservable;
import _2Design_pattern_in_java.Behavioral_dp.Observer.Good_Approach.Observable.IphoneObservable;
import _2Design_pattern_in_java.Behavioral_dp.Observer.Good_Approach.Observer.EmailAlertObserver;
import _2Design_pattern_in_java.Behavioral_dp.Observer.Good_Approach.Observer.MobileAlertObserver;
import _2Design_pattern_in_java.Behavioral_dp.Observer.Good_Approach.interfaces.NotificationObserver;
import _2Design_pattern_in_java.Behavioral_dp.Observer.Good_Approach.interfaces.StockObservable;

public class Client {
    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservable();
        StockObservable androidObservable = new AndroidObservable();

        NotificationObserver observer1 = new EmailAlertObserver("abc.gmail.com");
        NotificationObserver observer2 = new EmailAlertObserver("abc.gmail.com");
        NotificationObserver observer3 = new  MobileAlertObserver(930);
        NotificationObserver observer4 = new MobileAlertObserver(123);


        iphoneObservable.Add(observer1);
        iphoneObservable.Add(observer2);

        iphoneObservable.setiphoneStock(0);
        
        androidObservable.Add(observer3);
        androidObservable.Add(observer4);
    }
}
