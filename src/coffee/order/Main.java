package coffee.order;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("Alen"));
        orders.add(new Order("Yoda"));
        orders.add(new Order("Obi-van"));
        orders.add(new Order("John Snow"));

        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();
        for(Order order : orders){
            orderBoard.add(order);
        }
        orderBoard.draw();
        orderBoard.deliver();
        orderBoard.deliver(2);
        orderBoard.draw();
    }
}
