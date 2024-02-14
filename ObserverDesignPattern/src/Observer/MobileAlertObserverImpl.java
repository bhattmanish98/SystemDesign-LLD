package Observer;

import Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String mobile;
    StockObservable observable;
    public MobileAlertObserverImpl(String mobile, StockObservable observable) {
        this.mobile = mobile;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMessage(mobile, observable.toString() + " is in the stock, hurry up!");
    }

    private void sendMessage(String phone, String message) {
        System.out.println("Mail sent to "+phone+". Message: "+ message);
    }
}
