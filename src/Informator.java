import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Informator {

    private static HashMap<Client, Order> trackedOrders;

    public static void setOrderOnTrack(Client client, Order order){
        trackedOrders.put(client,order);
    }

    public static void notifyClient(Supplier supplier){
        for(Map.Entry<Client, Order> entry:trackedOrders.entrySet()){
            Client key = entry.getKey();
            Order value = entry.getValue();
            if(value.getOrder().containsKey(supplier.getName())){
               key.notifyOrder(supplier.getName(), value.getOrder().get(supplier.getName()));
            }
        }
    }
}
