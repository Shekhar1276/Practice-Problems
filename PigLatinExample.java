import java.util.Scanner;
public class PigLatinExample
{
    static private boolean isVowel(char ch)
    {
        return (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u');
    }
    static String Piglatinsentgenerator(String sentence){
        String[] sent = sentence.split(" ");
        String res ="";
        for(String word:sent)
        {
            res = res + " " + pigLatinWord(word);
        }
        return res;
    }
    private static String pigLatinWord(String string)
    {
        int stringlength=string.length();
        int index=-1;
        for (int i=0; i<stringlength; i++)
        {
            if (isVowel(string.charAt(i)))
            {
                index=i;
                break;
            }
        }
        if(index==-1) {
            return string + "ay";
        }
        else if (index==0){
            return string + "way";
        }
        return string.substring(index) + string.substring(0, index) + "ay";
    }
    public static void main(String args[])
    {
        Scanner scan = new  Scanner(System.in);
        System.out.println("Enter your text");
        String sent = scan.nextLine();
        System.out.println(PigLatinExample.Piglatinsentgenerator(sent));
    }
}