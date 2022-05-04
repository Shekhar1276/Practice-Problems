import java.util.Scanner;
public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1,2,3 and 4 for addition,sub,mutiply and divide respectively:");
        int choice= sc.nextInt();
        System.out.println("Enter two numbers:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Sum= "+(a+b));
                break;
            case 2:
                System.out.println("Difference= "+(a-b));
                break;
            case 3:
                System.out.println("Product= "+(a*b));
                break;
            case 4:
                System.out.println("Quotient= "+(a/b));
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}

