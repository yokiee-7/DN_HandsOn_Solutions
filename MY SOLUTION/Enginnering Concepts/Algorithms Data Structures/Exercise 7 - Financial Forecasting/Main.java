import java.util.Scanner;

class Main
{
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the initial Value: ");
        double initialValue=s.nextDouble();
        System.out.println("Enter the rate :");
        double rate=s.nextDouble();
        rate/=100;
        System.out.println("Enter the year : ");
        int years=s.nextInt();

        Forecast obj=new Forecast(initialValue,rate,years);
        double value=obj.calculateFutureValue(years);

        System.out.print(value);
    }
}