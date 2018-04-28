import java.util.ArrayList;

public class Supplier {

    private String name;
    private ArrayList<Items> order;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Supplier(String name){
        this.name = name;
    }

    public void fillOrder(Items[] items){
        for(Items item:items){
            if(!order.contains(item))order.add(item);
        }
    }

    public ArrayList<Items> orderDelivered(){
        return order;
    }

    public void notifyDelivered(){
        Informator.notifyClient(this);
    }

}
