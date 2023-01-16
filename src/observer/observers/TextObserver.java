package observer.observers;

import observer.order.Order;

public class TextObserver implements Observer {
    @Override
    public void update(Order order) {
        System.out.println("Text - order " + order.getNumber() + " changed status to " + order.getStatus());
    }
}
