package _2Design_pattern_in_java.Behavioral_dp.Observer.Best_Approach.Observer;

import _2Design_pattern_in_java.Behavioral_dp.Observer.Best_Approach.interfaces.NotificationObserver;
import _2Design_pattern_in_java.Behavioral_dp.Observer.Best_Approach.interfaces.StockObservable;

public class MobileAlertObserver implements NotificationObserver {

    public int mobNo;
    StockObservable observable;

    public MobileAlertObserver(int mobNo, StockObservable observable){
        this.mobNo = mobNo;
        this.observable = observable;
    }
    @Override
    public void update(){
        
    }

    public void sendMsg(String msg){
        System.out.println("Sending Mobile Msg To " +msg+ this.mobNo);
    }
    
}
