public class QuickSort {

    public static void sort(Order[] a,int low, int high) {
        if (low<high) {
            int pi=partition(a,low,high);
            sort(a,low,pi-1);
            sort(a,pi+1,high);
        }
    }

    public static int partition(Order[] a, int low, int high) {
        double pivot=a[high].totalPrice;
        int i=low-1;

        for (int j=low;j<high;j++) {
            if(a[j].totalPrice<pivot){
                i++;
                Order temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }

        Order temp = a[i+1];
        a[i+1]=a[high];
        a[high]=temp;

        return i+1;
    }
}
