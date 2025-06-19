class Product
{
    int product_id;
    String product_Name;
    String category;

    public Product(String category, String product_Name, int product_id) {
        this.category = category;
        this.product_Name = product_Name;
        this.product_id = product_id;
    }

    public String getProductName(){
        return product_Name;
    }

    public String DisplayProductDetails(){
        return "Product ID :"+product_id +" , Name: "+ product_Name+", Category: "+ category;
    }

}