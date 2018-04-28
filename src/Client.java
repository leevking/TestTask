import java.util.Map;

public class Client {

    String name;

    Client(String name){
        this.name=name;
    }

    public void placeOrder(Order order){
        Aggregator.addOrder(order);
        Informator.setOrderOnTrack(this,order);
    }

    public void notifyOrder(String supplier, Items[] items){
        System.out.print("Items ");
        for(Items item :items) System.out.print(item.toString()+" ");
        System.out.println("delivered by"+supplier);
    }
}
