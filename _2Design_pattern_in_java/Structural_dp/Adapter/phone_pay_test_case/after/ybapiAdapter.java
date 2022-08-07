package after;

public class ybapiAdapter implements bankApi{
    YBApi obj = new YBApi();
    
    @Override
    public void pay(){
        obj.makePayment();
        obj.recievePayment();
    }

    @Override
    public void marksuccess(){
        obj.checkSuccess();
    }

}
