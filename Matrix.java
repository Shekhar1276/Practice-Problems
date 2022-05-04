import java.util.*;
public class Matrix
{
    static void CoFactor(double m[][], double t[][], int r, int c, int n){
        int i=0, j=0;
        for (int row = 0; row < n; row++){
            for (int col = 0; col < n; col++){
                if (row != r && col != c){
                    t[i][j++] = m[row][col];
                    if (j == n - 1)
                    {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }
    static double Determinant(double m[][], int n){
        double det = 0;
        double t[][] = new double[5][5];
        int sign = 1;
        for (int f = 0; f < n; f++)
        {
            CoFactor(m, t, 0, f, n);
            det += sign*m[0][f]*Determinant(t, n - 1);
            sign = -sign;
        }
        return det;
    }
    public static void main(String[] args) {
        int i, j;
        Scanner s = new Scanner(System.in);
        System.out.println("\nPlease Enter the 5x5 Matrix Values : ");
        double[][] a = new double[5][5];
        for(i=0; i<5; i++){
            for(j=0; j<5; j++){
                a[i][j]=s.nextDouble();
            }
        }
        System.out.print("Determinant "+"of the matrix is : "+Determinant(a, 5));
    }
}
