import java.util.*;
public class Maxelem{
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
        int max=m[0][0];
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                if(m[i][j]>max){
                    max=m[i][j];
                }
            }
        }
        System.out.println("Maximum element is "+max);
    }
}
