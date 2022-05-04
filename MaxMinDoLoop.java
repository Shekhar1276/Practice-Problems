import java.util.Scanner;
public class MaxMinDoLoop {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter how much no you want to compare for max and min: ");
        int n=inp.nextInt();
        int arr[]=new int[n];
        int i=0;
        System.out.println(" Enter the numbers: ");
        do
        {
            arr[i]=inp.nextInt();
            i++;
        }while(i<n);
        int max=arr[0],min=arr[0];
        do
        {
            if(arr[i]>max) {
                max = arr[i];
            }
            if(arr[i]<min) {
                min = arr[i];
            }
            i++;
        }while(i<n);
        System.out.println("Maximum Number: "+max);
        System.out.println("Minimum Number: "+min);
    }
}
