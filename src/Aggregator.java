import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Aggregator {

    private static ArrayList<Order> orders;
    private static HashMap<String, Items[]> aggregatedOrders;

    private Aggregator(){
        this.orders = new ArrayList<>();
    }

    public static Aggregator newInstance(){
        return new Aggregator();
    }

    public static void addOrder(Order order){
        orders.add(order);
    }

    public static void aggregate(){

        for (Order order:orders) {
            aggregatedOrders.putAll(order.getOrder());
        }

        for(Map.Entry<String, Items[]> entry:aggregatedOrders.entrySet()){
            String key = entry.getKey();
            Items[] value = entry.getValue();
            SupplierFactory.getSupplier(key).fillOrder(value);
        }
    }


}
