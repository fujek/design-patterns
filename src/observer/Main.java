package observer;

import observer.observers.AppObserver;
import observer.observers.EmailObserver;
import observer.observers.Observer;
import observer.observers.TextObserver;
import observer.order.Order;

import static observer.order.OrderStatus.*;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1, NEW);
        Observer emailObserver = new EmailObserver();
        Observer textObserver = new TextObserver();
        Observer appObserver = new AppObserver();

        order.registerObserver(emailObserver);
        order.registerObserver(textObserver);
        order.registerObserver(appObserver);

        order.changeOrderStatus(PROCESSING);

        order.unregisterObserver(textObserver);
        order.unregisterObserver(appObserver);

        order.changeOrderStatus(SENT);
    }
}
