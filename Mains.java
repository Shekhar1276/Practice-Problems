import java.util.Scanner;
class MonthName
{
    static String[] s = new String[] {"January","February","March","April","May","June","July","August","September","October","November","December","InvalidNumber"};
    static String monthName1(int n)
    {
        if(n>=1 && n<=12)
            return MonthName.s[n-1];
        else
            return MonthName.s[12];
    }
}
class monthno {
    static void month(int mnth){
        switch (mnth) {
            case 1:
                System.out.println("Showing Month: January");
                break;
            case 2:
                System.out.println("Showing Month: February");
                break;
            case 3:
                System.out.println("Showing Month: March");
                break;
            case 4:
                System.out.println("Showing Month: April");
                break;
            case 5:
                System.out.println("Showing Month: May");
                break;
            case 6:
                System.out.println("Showing Month: June");
                break;
            case 7:
                System.out.println("Showing Month: July");
                break;
            case 8:
                System.out.println("Showing Month: August");
                break;
            case 9:
                System.out.println("Showing Month: September");
                break;
            case 10:
                System.out.println("Showing Month: October");
                break;
            case 11:
                System.out.println("Showing Month: November");
                break;
            case 12:
                System.out.println("Showing Month: December");
                break;
            default:
                System.out.println("Invalid input - Wrong month number.");
                break;
        }
    }
}
class Mains{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number between 1 to 12");
        int n = sc.nextInt();
        String str=MonthName.monthName1(n);
        monthno.month(n);
        System.out.println("Month name:"+str);
    }

}
