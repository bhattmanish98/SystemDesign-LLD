import Observable.IpadObservableImpl;
import Observable.IphoneObservableImpl;
import Observable.StockObservable;
import Observer.EmailAlertObserverImpl;
import Observer.MobileAlertObserverImpl;
import Observer.NotificationAlertObserver;

public class Main {
    public static void main(String... args) {
        StockObservable iphonestockObservable = new IphoneObservableImpl();
        StockObservable ipadstockObservable = new IpadObservableImpl();

        NotificationAlertObserver observer1 = new MobileAlertObserverImpl("+911234567879", iphonestockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc@gmail.com", iphonestockObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("xyz@gmail.com", iphonestockObservable);
        NotificationAlertObserver observer4 = new MobileAlertObserverImpl("+911234567879", ipadstockObservable);
        NotificationAlertObserver observer5 = new EmailAlertObserverImpl("abc@gmail.com", ipadstockObservable);
        NotificationAlertObserver observer6 = new EmailAlertObserverImpl("xyz@gmail.com", ipadstockObservable);

        iphonestockObservable.add(observer1);
        iphonestockObservable.add(observer2);
        iphonestockObservable.add(observer3);
        System.out.println(iphonestockObservable.getStockCount());
        iphonestockObservable.setStockCount(10);
        System.out.println(iphonestockObservable.getStockCount());

        ipadstockObservable.add(observer4);
        ipadstockObservable.add(observer5);
        ipadstockObservable.add(observer6);
        System.out.println(ipadstockObservable.getStockCount());
        ipadstockObservable.setStockCount(10);
        System.out.println(ipadstockObservable.getStockCount());
    }
}
