import java.util.Scanner;
public class Multiplyno {
    static double multply(double m,double n)
    {
        double sum=0;
        for(int i=0; i<n; i++)
        {
            sum += m;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number then the second number with a space.");
        double m = scan.nextDouble();
        double n = scan.nextDouble();
        System.out.println("Result is : "+ Multiplyno.multply(m,n));
    }
}
