package observer.observers;

import observer.order.Order;

public interface Observer {
   void update(Order order);
}
