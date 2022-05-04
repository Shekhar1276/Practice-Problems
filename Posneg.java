import java.util.*;
public class Posneg{
    public static void main(String[] args) {
        int odd=0, even=0, pos=0, neg=0;
        double a[] = new double[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter 10 Numbers :\n");
        for(int i=0; i<10; i++){
            a[i]=s.nextDouble();
        }
        for(int i=0; i<10; i++){
            if(a[i]%2==0){
                even++;
            }if(a[i]%2!=0){
                odd++;
            }if(a[i]<0){
                neg++;
            }if(a[i]>=0){
                pos++;
            }
        }
        System.out.println("There are :\n"+pos+" Positive\n"+neg+" Negative\n"+even+" Even\n"+odd+" Odd Numbers in the array.\n");
    }
}
