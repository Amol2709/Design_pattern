package before;

public class phonePay {
    YBApi  ybapi = new YBApi();

    void pay(){
        ybapi.makePayment();
    }
    boolean marksuccess(){
        ybapi.makePayment();
        ybapi.recievePayment();
        return false;
    }
    void paytofreind(){}
    void sendgift(){
        ybapi.makePayment();
        ybapi.recievePayment();
    }
}
