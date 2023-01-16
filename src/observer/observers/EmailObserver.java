package observer.observers;

import observer.order.Order;

public class EmailObserver implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("Email - order " + order.getNumber() + " changed status to " + order.getStatus());
    }
}
