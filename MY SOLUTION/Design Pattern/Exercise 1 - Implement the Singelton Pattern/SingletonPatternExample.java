
public class SingletonPatternExample
{
    public static void main(String[] args){
        Logger obj1=Logger.getInstance(100);
        Logger obj2=Logger.getInstance(200);

        if(obj1==obj2){
            System.out.println("Objects are same");
        }
        else{
            System.out.println("Objects are different");
        }
    }
}