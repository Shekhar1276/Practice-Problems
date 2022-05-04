import java.util.*;
public class Overlap{
    static void PrintSubMatrix(double a[][], int n, int so, int r, int c, int
            ro, int co){
        if(co-so>=0){
            if(ro-so>=0){
                for(int i=r; i<r+so; i++){
                    for(int j=c; j<c+so; j++){
                        System.out.print(" "+a[i][j]);
                    }
                    System.out.println("");
                }
                System.out.println("");
                PrintSubMatrix(a, n, so, r+so, c, ro-so, co);
            }else{
                PrintSubMatrix(a, n, so, 0, c+so, n, co-so);
            }
        }else{
            System.out.println("THE END");
        }
    }
    public static void main(String[] args) {
        int r=0, c=0, n, so;
        Scanner s = new Scanner(System.in);
        System.out.println("\nPlease Enter the Order of Matrix : ");
        n=s.nextInt();
        System.out.println("\nPlease Enter elements of the Matrix : ");
        double[][] a = new double[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j]=s.nextDouble();
            }
        }
        System.out.println("\nPlease Enter the Order of Sub Matrix : ");
        so=s.nextInt();
        System.out.println("The Non Overlapping Sub Matrices will be:\n");
        PrintSubMatrix(a, n, so, r, c, n, n);
    }
}
