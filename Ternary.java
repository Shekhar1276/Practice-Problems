import java.util.Scanner;
public class Ternary {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        int num3= scan.nextInt();
        int largest= num3>((num1>num2) ? num1:num2) ? num3
                :((num1>num2) ? num1:num2);
        System.out.println("The largest number is: "+largest);
    }
}
