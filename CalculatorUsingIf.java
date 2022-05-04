//Using If-else
import java.util.Scanner;
public class CalculatorUsingIf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1,2,3 and 4 for addition,sub,mutiply and divide respectively:");
        int choice= sc.nextInt();
        System.out.println("Enter two numbers:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        if(choice==1){
            System.out.println("Sum= "+(a+b));
        }
        else if(choice==2){
            System.out.println("Difference= "+(a-b));
        }
        else if(choice==3){
            System.out.println("Product= "+(a*b));
        }
        else if(choice==4){
            System.out.println("Quotient= "+(a/b));
        }
        else{
            System.out.println("Wrong Choice");
        }
    }
}
