import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main
{
    //linear search
    public static Product LinearSearch(Product[] p , String target){
        for(int i=0;i<p.length;i++){
            if(p[i].getProductName().equals(target)){
                return p[i];
            }
        }
        return null;
    }
    
    //Binary search
    public static Product BinarySearch(Product[] p,String target){
        int start=0;
        int end=p.length-1;

        //sorting the array for implementing Binear Search
        Arrays.sort(p, Comparator.comparing(Product::getProductName));

        while(start<=end){
            int mid=(start+end)/2;
            int comparing = p[mid].getProductName().compareTo(target);

            if(comparing==0){
                return p[mid];
            }
            else if(comparing>0){
                end=mid-1;
            }
            else{
                start= mid+1;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the product to Search");
        String target=s.nextLine();
        
        Product[] products = {
            new Product("Electronics", "Laptop", 1),
            new Product("Fashion", "Shoes", 2),
            new Product("Electronics", "Phone", 3),
            new Product("Books", "Novel", 4),
            new Product("Kitchen", "Blender", 5)
        };
        
        Product LinearSearchResult = LinearSearch(products, target);

        System.out.println(LinearSearchResult.DisplayProductDetails());
    }

}