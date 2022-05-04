import java.util.*;
public class Rotate{
    static void rotate180(int m[][],int s){
        for(int i=s-1;i>=0;i--){
            for(int j=s-1;j>=0;j--){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void rotate90(int m[][],int s){
        for(int i=0;i<s;i++){
            for(int j=s-1;j>=0;j--){
                System.out.print(m[j][i]+" ");
            }
            System.out.println();
        }
    }
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
        System.out.println("Rotated by 180 degree : ");
        rotate180(m,s);
        System.out.println("Rotated by 90 degree : ");
        rotate90(m,s);
    }
}
