
import java.util.*;
public class Revarray
{
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("\nPlease Enter the size of array : ");
        n=s.nextInt();
        double a[] = new double[n];
        double b[] = new double[n];
        System.out.println("Please Enter "+n+" Numbers :\n");
        for(int i=0; i<n; i++){
            a[i]=s.nextDouble();
        }
        for(int i=0; i<n; i++){
            b[n-1-i]=a[i];
        }
        System.out.println("The new array will be :\n");
        for(int i=0; i<n; i++){
            System.out.print(" "+b[i]);
        }
    }
}
