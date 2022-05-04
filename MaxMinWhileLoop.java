import java.util.Scanner;
public class MaxMinWhileLoop {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter how much no you want to compare for max and min: ");
        int n=inp.nextInt();
        int arr[]=new int[n+1];
        int i=0;
        System.out.println(" Enter the numbers: ");
        while(i<n)
        {
            arr[i]=inp.nextInt();
            i++;
        }
        int max=0,min=0,j=0;
        while(j<n)
        {

            if(arr[j]>arr[j+1]) {
                max = arr[j];
                min = arr[j+1];
            }
            if(arr[j]<arr[j+1]) {
                min = arr[j];
                max = arr[j+1];
            }
            j++;
        }
        System.out.println("Maximum Number: "+max);
        System.out.println("Minimum Number: "+min);
    }
}
