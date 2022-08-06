package _2Design_pattern_in_java.Behavioral_dp.Observer.Good_Approach.Observer;

import _2Design_pattern_in_java.Behavioral_dp.Observer.Good_Approach.Observable.AndroidObservable;
import _2Design_pattern_in_java.Behavioral_dp.Observer.Good_Approach.Observable.IphoneObservable;
import _2Design_pattern_in_java.Behavioral_dp.Observer.Good_Approach.interfaces.NotificationObserver;

public class MobileAlertObserver implements NotificationObserver {

    public int mobNo;

    public MobileAlertObserver(int mobNo){
        this.mobNo = mobNo;
    }
    @Override
    public void update(Object o){
        if (o instanceof IphoneObservable){
            sendMsg("Iphone msg");
        }
        if (o instanceof AndroidObservable){
            sendMsg("Android msg");

        }
    }

    public void sendMsg(String msg){
        System.out.println("Sending Mobile Msg To " +msg+ this.mobNo);
    }
    
}
