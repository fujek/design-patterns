package observer.order;


import observer.observers.Observable;
import observer.observers.Observer;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observable {
    private final int number;
    private OrderStatus status;

    private final Set<Observer> observers = new HashSet<>();

    public Order(int number, OrderStatus status) {
        this.number = number;
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public OrderStatus getStatus() {
        return status;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update(this));
    }

    public void changeOrderStatus(OrderStatus newStatus) {
        this.status = newStatus;
        notifyObservers();
    }
}
