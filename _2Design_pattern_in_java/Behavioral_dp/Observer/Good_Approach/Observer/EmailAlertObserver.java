package _2Design_pattern_in_java.Behavioral_dp.Observer.Good_Approach.Observer;


import _2Design_pattern_in_java.Behavioral_dp.Observer.Good_Approach.Observable.AndroidObservable;
import _2Design_pattern_in_java.Behavioral_dp.Observer.Good_Approach.Observable.IphoneObservable;
import _2Design_pattern_in_java.Behavioral_dp.Observer.Good_Approach.interfaces.NotificationObserver;

public class EmailAlertObserver implements NotificationObserver {
    public String emailID;

    public EmailAlertObserver(String email){
        this.emailID = email;
    }

    public void sendMail(String msg){
        System.out.println("Hi " + msg + emailID);
    }
    @Override
    public void update(Object o){
        if (o instanceof IphoneObservable){
            sendMail("Iphone msg");
        }
        if (o instanceof AndroidObservable){
            sendMail("Android msg");
        }
    }
}
