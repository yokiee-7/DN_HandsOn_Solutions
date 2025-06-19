
import java.util.HashMap;

public class InventoryManager {

    HashMap<Integer,Product>map=new HashMap<>();

    public void toAdd(int product_id,Product p){
        map.put(product_id,p) ;
    }


    public void toUpdate(int product_id,int newqty,int newprice){
        Product p=map.get(product_id);
        if(p!=null){
            p.quantity=newqty;
            p.price=newprice;
        }
        map.put(product_id,p);
    }
    public void toDelete(int product_id){
        map.remove(product_id);
    }
        
        public void displayInventory() {
        for (Product p : map.values()) {
            System.out.println(p);
        }
    }

    


    public static void main(String[] args) {
        Product obj1=new Product(1,"Coke",25,40);
        Product obj2=new Product(2,"Pepsi ",25,40);
        Product obj3=new Product(3,"Fanta ",25,40);
        Product obj4=new Product(4,"Diet Coke",25,40); 

        InventoryManager manager=new InventoryManager();
        manager.toAdd(1, obj1);
        manager.toAdd(2, obj2);
        manager.toAdd(3, obj3);
        manager.toAdd(4, obj4);
        manager.toUpdate(4, 25, 40);
        manager.toDelete(3);
    
        manager.displayInventory();

    }
}
