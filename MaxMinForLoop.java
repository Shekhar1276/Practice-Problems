import java.util.Scanner;
public class MaxMinForLoop {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter how much no you want to compare for max and min: ");
        int n=inp.nextInt();
        int arr[]=new int[n];
        System.out.println(" Enter the numbers: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=inp.nextInt();
        }
        int max=arr[0],min=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max) {
                max = arr[i];
            }
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum Number: "+max);
        System.out.println("Minimum Number: "+min);
    }
}