package Observable;

import Observer.NotificationAlertObserver;


public interface StockObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void setStockCount(int newCount);
    public int getStockCount();
}
