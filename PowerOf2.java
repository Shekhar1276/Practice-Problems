import java.util.Scanner;
public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        float n= sc.nextFloat();
        while(n>1){
            n=n/2;
        }
        if(n==1){
            System.out.println("Yes it is a power of 2.");
        }
        else{
            System.out.println("It is not a power of 2.");
        }
    }
} 