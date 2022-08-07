package after;

public class phonePay {
    // bankApi obj = new ybapiAdapter();
    bankApi obj;
    // bankApi obj = new iciciAdapter();
    
    // dependecny injection
    public phonePay(bankApi bankapi){
        this.obj = bankapi;
    }

    void pay(){
        obj.pay();
    }
    boolean marksuccess(){
        obj.marksuccess();
        return false;
    }
    void paytofreind(){}
    void sendgift(){
        obj.pay();
        obj.marksuccess();
    }
}
