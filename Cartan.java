import java.util.*;
public class Cartan
{
    public static void main(String[] args) {
        int i, j, n;
        Scanner s = new Scanner(System.in);
        System.out.println("\nPlease Enter the Order of Matrix : ");
        n=s.nextInt();
        System.out.println("\nPlease Enter elements of 1st Matrix : ");
        double[][] a = new double[n][n];
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                a[i][j]=s.nextDouble();
            }
        }
        System.out.println("\nPlease Enter elements of 2nd Matrix : ");
        double[][] b = new double[n][n];
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                b[i][j]=s.nextDouble();
            }
        }
        double[][] pro = new double[n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                pro[i][j]=0;
                for(int k=0;k<n;k++){
                    pro[i][j]=pro[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("The Product of given matrix is :\n");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(" "+pro[i][j]);
            }
            System.out.println("");
        }
    }
}
