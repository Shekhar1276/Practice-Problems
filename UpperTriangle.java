import java.util.*;
public class UpperTriangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s;
        System.out.println("Enter the dimension of square matrix : ");
        s=sc.nextInt();
        int[][] m = new int[10][10];
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                m[i][j]=sc.nextInt();
            }
        }
        int f=1;
        for(int i=0;i<s;i++) {
            for(int j=0;j<s;j++){
                if(i>j && m[i][j]!=0){
                    f=0;
                    break;
                }
            }
        }
        if(f==0){
            System.out.println("Not a upper triangular matrix");
        }else{
            System.out.println("Upper triangular matrix");
        }
    }
}
