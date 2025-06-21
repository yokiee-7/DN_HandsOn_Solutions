

class Product 
{
    int product_id ;
    String product_name ;
    int quantity ;
    int price ;

    public Product( int product_id,String product_name,int quantity,int price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.quantity = quantity;
        this.price = price;
    }
   @Override
public String toString() {
    return product_name + " - Qty: " + quantity + ", Price: " + price;
}

}