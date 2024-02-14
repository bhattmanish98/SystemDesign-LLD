package Observer;

import Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String email;
    StockObservable observable;

    public EmailAlertObserverImpl(String email, StockObservable observable) {
        this.email = email;
        this.observable = observable;
    }
    
    @Override
    public void update() {
        sendMail(email, observable.toString() + " is in the stock, hurry up!");
    }

    private void sendMail(String email, String message) {
        System.out.println("Mail sent to "+email+". Message: "+ message);
    }
}
