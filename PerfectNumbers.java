public class PerfectNumbers {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<10;i++){
            sum=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    sum=sum+j;
                }
            }
            if(sum==2*i){
                System.out.print(i+" ");
            }
        }
    }
}
