
class Main
{
    public static void main(String[] args) {

        Order[] orders = {
                    new Order(101, "Alice", 4500.0),
                    new Order(102, "Bob", 2100.0),
                    new Order(103, "Charlie", 3200.0),
                    new Order(104, "Dave", 7000.0),
                    new Order(105, "Eve", 1200.0)
                    };
        
        //For Bubble Sort
        Order[] bubbleSorted = orders.clone();
        BubbleSort.sort(bubbleSorted);
        System.out.println("Sorted using Bubble Sort:");
        for (Order o:bubbleSorted) {
            System.out.println(o.orderId + "  " + o.customerName + "  " + o.totalPrice);
        }

        System.out.println("----------------------------------");
        
        //For Quick Sort
        Order[] quickSorted = orders.clone();
        QuickSort.sort(quickSorted, 0, quickSorted.length - 1);
        System.out.println("Sorted using Quick Sort:");
        for (Order o:quickSorted) {
            System.out.println(o.orderId + "  " + o.customerName + " " + o.totalPrice);
        }

    }
}