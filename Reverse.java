import java.util.Scanner;
public class Reverse {
    int rev(int num) {
        int result=0;
        for (int i = 0, j = 10000; i < 5&& j >=1; i++, j /= 10) {
            int digit = num % 10;
            num = num/10;
            int pos_value = j;
            result += digit * pos_value;
        }
        return result;
    }
    public  static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        Reverse reverse= new Reverse();
        System.out.println("Enter 5 digit number: ");
        int num = scan.nextInt();
        System.out.println("Number in reverse order is: "+reverse.rev(num));
    }
}
