import java.util.Scanner;
public class RelativelyPrime { public static void main(String[] args)
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter two numbers:");
    int num1= sc.nextInt();
    int num2= sc.nextInt();
    int gcd=0;
    for(int i=1;i<=num1 && i<=num2;i++){
        if(num1%i==0 && num2%i==0){
            gcd=i;
        }
    }
    if(gcd==1){
        System.out.println(""+num1+" and "+num2+" are relatively prime.");
    }
    else{
        System.out.println(""+num1+" and "+num2+" are not relatively prime.");
    }
}
}
