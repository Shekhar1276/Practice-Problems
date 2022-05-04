import java.util.*;
public class Timespresent {
    public static void main(String[] args) {
        int num = 0;
        double find;
        double a[] = new double[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter 10 Numbers :\n");
        for (int i = 0; i < 10; i++) {
            a[i] = s.nextDouble();
        }
        System.out.println("\nPlease Enter the Number to be searched : ");
        find = s.nextDouble();
        for (int i = 0; i < 10; i++) {
            if (a[i] == find) {
                num++;
            }
        }
        System.out.println(find + " occurs in the array " + num + " times.\n");
    }
}
