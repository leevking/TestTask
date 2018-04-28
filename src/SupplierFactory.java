import java.util.ArrayList;

public class SupplierFactory {

    static ArrayList<Supplier> suppliers;


    public static void newInstance(){
        suppliers = new ArrayList<>();
    }

    public static void addSupplier(String name){
        suppliers.add(new Supplier(name));
    }

    public static void addSupplier(Supplier supplier){
        suppliers.add(supplier);
    }

    public static void removeSupplier(String name){
        suppliers.remove(getSupplier(name));
    }

    public static Supplier getSupplier(String name){
        for(Supplier supplier: suppliers)if(supplier.getName()==name)return supplier;
        Supplier newSupplier= new Supplier(name);
        addSupplier(newSupplier);
        return newSupplier;
    }

}
