package _2Design_pattern_in_java.Behavioral_dp.Observer.Best_Approach.Observer;



import _2Design_pattern_in_java.Behavioral_dp.Observer.Best_Approach.interfaces.NotificationObserver;
import _2Design_pattern_in_java.Behavioral_dp.Observer.Best_Approach.interfaces.StockObservable;

public class EmailAlertObserver implements NotificationObserver {
    public String emailID;
    StockObservable observable1;

    public EmailAlertObserver(String email, StockObservable observable){
        this.emailID = email;
        this.observable1 = observable;
    }

    public void sendMail(String msg){
        System.out.println("Hi " + msg + emailID);
    }
    @Override
    public void update(){
        this.observable1.setStock(10);
    }
        
}


