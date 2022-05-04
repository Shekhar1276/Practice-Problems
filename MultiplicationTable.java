import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter the no of which you want multiplication table:");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int table=0;
        for(int i=1;i<=10;i++){
            table=n*i;
            System.out.println(""+n+" * "+i+" = "+table);
        }
    }
}
