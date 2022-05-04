import java.util.Scanner;
public class Median {
    public static void  main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scan.nextInt();
        double median;
        double [] Array = new double[n];
        System.out.println("Enter the elements in sorted order: ");
        for (int i=0;i<n;i++)
        {
            Array[i]=scan.nextDouble();
        }
        if (n%2==0) {
            median = (Array[(n / 2)-1] + Array[(n / 2)]) / 2;
        }
        else{
            median = (int) Array[n/2];
        }
        System.out.println("Median is : "+ median);
    }
}
