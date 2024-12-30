package coffee.order;


import java.util.TreeMap;

public class CoffeeOrderBoard {
    public static int ID = 0;
    private TreeMap<Integer, String> orders = new TreeMap<>();


    public TreeMap<Integer, String> getOrders() {
        return orders;
    }

    public void setOrders(TreeMap<Integer, String> orders) {
        this.orders = orders;
    }

    public void add(Order order){
        ID++;
        orders.put(ID, order.getName());
    }

    public void deliver(){
        orders.remove(ID);
    }

    public void deliver(int orderToRemove){
        orders.remove(orderToRemove);
    }

    public void draw(){
        System.out.println("Num | Name");
        for (Integer num : orders.keySet()) {
            System.out.println(num + " | " + orders.get(num));
        }
        System.out.println();
    }
}