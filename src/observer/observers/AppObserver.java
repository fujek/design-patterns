package observer.observers;

import observer.order.Order;

public class AppObserver implements Observer {
    public void update(Order order) {
        System.out.println("App - order " + order.getNumber() + " changed status to " + order.getStatus());
    }
}
