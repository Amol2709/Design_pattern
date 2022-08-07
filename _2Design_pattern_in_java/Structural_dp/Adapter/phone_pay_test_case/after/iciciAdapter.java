package after;

public class iciciAdapter implements bankApi{
    iciciApi obj = new iciciApi();
    
    @Override
    public void pay(){
        obj.makePay();
        obj.recieveamount();
    }

    @Override
    public void marksuccess(){
        obj.checkStatus();
    }
}
