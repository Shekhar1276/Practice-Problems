import java.util.Scanner;
public class Palin
{
    static void isPalindrome()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a string or Number : ");
        String s=obj.nextLine();
        int i=0,j=s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
                System.out.println("Not Palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
    static void isPalindromeSwitch()
    {
        Scanner sc =new Scanner(System.in);
        int c;
        System.out.println("Do you want to test string/number for a palindrome :\n1. string\n2. number");
        c=sc.nextInt();
        System.out.print("Enter number/string : ");
        String s=sc.nextLine();
        int i=0,j=s.length()-1;
        int f=1;
        while(i<=j)
        {
            if(s.charAt(i) != s.charAt(j))
                f=0;
            i++;
            j--;
        }
        switch(c)
        {
            case 1: if(f==0)
                System.out.println("String is not a palindrome");
            else
                System.out.println("String is a palindrome");
                break;
            case 2: if(f==0)
                System.out.println("Number is not a palindrome");
            else
                System.out.println("Number is a palindrome");
                break;
        }
    }
    public static void main(String[] args)
    {
        System.out.println("USING IF/ELSE");
        isPalindrome();
        System.out.println("\nUSING SWITCH");
        isPalindromeSwitch();
    }
}
