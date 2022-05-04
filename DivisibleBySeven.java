
public class DivisibleBySeven {
    public static void main(String[] args) {
        int sum=0;
        String div = "";
        for(int i=50;i<100;i++){
            if(i%7==0) {
                sum = sum + i;
                div = div+" + " + i;
            }
        }
        System.out.println("The sum of integers between 50 and 100 divisible by 7 is: "+ sum);
        System.out.println(div);
    }
}
