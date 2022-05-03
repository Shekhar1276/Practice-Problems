import  java.util.Scanner;
public class Time {
    int sec2hour(int secs)
    {
        return  (secs/60)/60;
    }
    int sec2minute(int secs)
    {
        return (secs/60)%60;
    }
    int secu(int secs)
    {
        return (secs%60);
    }
    public static void main(String arggs[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value: ");
        Time tem = new Time();
        int seconds = scan.nextInt();
        System.out.println("Time is: " + tem.sec2hour(seconds)+ " hours "+tem.sec2minute(seconds)+" minutes "+tem.secu(seconds)+" seconds");
    }
}
