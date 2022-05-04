import java.util.Scanner;
public class HemchandraSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of terms upto you want hemachandra series:");
        int n= sc.nextInt();
        int term1=1;
        int term2=2;
        System.out.println("Hemachandra series upto "+n+" term is:");
        for(int i=0;i<n;i++){
            System.out.print(term1+" ");
            int nextTerm=term1+term2;
            term1=term2;
            term2=nextTerm;
        }
    }
}
