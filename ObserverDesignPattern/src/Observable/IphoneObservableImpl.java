package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable {
    List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();
    int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver observer) {
        notificationAlertObserverList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        notificationAlertObserverList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer: notificationAlertObserverList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if (stockCount == 0) {
            notifySubscribers();
        }
        stockCount = stockCount + newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }


    @Override
    public String toString() {
        return "Iphone";
    }
}
