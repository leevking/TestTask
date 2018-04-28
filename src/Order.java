import java.util.HashMap;
import java.util.Map;

public class Order {


    private Map<String, Items[]> order;

    Order(Map<String, Items[]> order){
        this.order= order;
    }

    Order(){
        this.order = new HashMap<>();
    }

    public void addPurchase(String supplier, Items[] items){
        order.put(supplier, items);
    }

    public void removePurchase(String supplier){
        order.remove(supplier);
    }

    public Map<String, Items[]> getOrder(){
        return order;
    }
}
