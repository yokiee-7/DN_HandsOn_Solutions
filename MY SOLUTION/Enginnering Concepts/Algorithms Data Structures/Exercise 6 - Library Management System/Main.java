import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import javax.sound.midi.SysexMessage;

class Main
{
    //linear search
    public static Book LinearSearch(Book[] b , String search){
        for(int i=0;i<b.length;i++){
            if(b[i].getBooktitle().equals(search)){
                return b[i];
            }
        }
        return null;
    }
    
    //Binary search
    public static Book BinarySearch(Book[] b,String search){
        int start=0;
        int end=b.length-1;

        //sorting the array for implementing Binear Search
        Arrays.sort(b, Comparator.comparing(Book::getBooktitle));

        while(start<=end){
            int mid=(start+end)/2;
            int comparing = b[mid].getBooktitle().compareTo(search);

            if(comparing==0){
                return b[mid];
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
        System.out.println("Enter the book to Search");
        String search=s.nextLine();
        
        Book[] books = {
            new Book(01, "War and Peace", "Leo"),
            new Book(02, "Frankenstein", "Mary"),
            new Book(03, "Harry Potter", "Rowling"),
            new Book(04, "Macbeth", "William"),
            new Book(05, "Jazz", "Morrison")
        };
        
        Book LinearSearchResult = LinearSearch(books, search);
        Book BinarySearchResult = BinarySearch(books, search);
        System.out.println("---------------------------------------------------");
        if(LinearSearchResult!=null)
        {
            System.out.println("Linear Search Was Done");
            System.out.println(LinearSearchResult.toString());
        }
        else
        {
            System.out.println("Book not found (Linear Search)");
        }
        System.out.println("---------------------------------------------------");
        
        if(BinarySearchResult!=null)
        {
            System.out.println("Binary Search was Done");
            System.out.println(BinarySearchResult.toString());
        }
        else
        {
            System.out.println("Book not found (Linear Search)");
        }
        
        System.out.println("---------------------------------------------------");
    }

}