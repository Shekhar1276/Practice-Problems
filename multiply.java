import java.util.Scanner;
public class multiply {
        private int first_num;
        private int second_num;
        private int third_num;
        private int fourth_num;
        multiply(int first_num,int second_num, int third_num, int fourth_num)
        {
            this.first_num=first_num;
            this.second_num=second_num;
            this.third_num=third_num;
            this.fourth_num=fourth_num;
        }
        int mult()
        {
            int result =  first_num*second_num*third_num*fourth_num;
            return  result;
        }
        /*int geo_mean()
        {
            int mean ;
        }*/
        public static void main(String args[])
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please Enter the four numbers: ");
            int x,y,z,w;
            x = scan.nextInt();
            y = scan.nextInt();
            z = scan.nextInt();
            w = scan.nextInt();
            multiply use = new multiply(x,y,z,w);
            System.out.println(use.mult());
        }
    }
